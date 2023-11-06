DESCRIPTION = "Network UPS Tools is a collection of programs which provide a common interface \
                for monitoring and administering UPS, PDU and SCD hardware"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "python3 \
            python3-native \ 
            asciidoc-native \
            i2c-tools \
            "

SRCREV = "9defa7a9cc97491b4d595fe1233996b948ab730d"
SRC_URI = "git://github.com/networkupstools/nut.git;protocol=https;branch=master \
            file://nut_python.patch \
            file://ups.conf \
            file://upsd.conf \
            file://upsd.users \
            file://upsmon.conf \
            "
S = "${WORKDIR}/git"

inherit autotools systemd

# We have to force ax_cv__printf_string_null=yes to avoid
# crosscompilation issues
EXTRA_OECONF += "ax_cv__printf_string_null=yes \
                --with-linux_i2c=yes \
                --with-solaris-smf=no \
                --with-solaris-pkg-svr4=no \ 
                --with-solaris-pkg-ips=no \
                -with-systemdsystemunitdir=${systemd_system_unitdir} \
                --with-user=root \
                --with-group=root \
                " 

do_configure:prepend() {
    ( cd ${S}; ./autogen.sh )
}

do_install:append() {
    rm -v ${D}${sysconfdir}/*.sample
    rm -vr ${D}${datadir}/solaris-init

    install -m 0644 ${WORKDIR}/ups.conf ${D}${sysconfdir}/ups.conf
    install -m 0644 ${WORKDIR}/upsd.conf ${D}${sysconfdir}/upsd.conf
    install -m 0644 ${WORKDIR}/upsd.users ${D}${sysconfdir}/upsd.users
    install -m 0644 ${WORKDIR}/upsmon.conf ${D}${sysconfdir}/upsmon.conf

    install -d ${D}/var/state/ups/
}

SYSTEMD_SERVICE_${PN} = " \
        nut-server.service \
        nut-monitor.service \
        nut-driver.target \
        nut-driver-enumerator.service \
        nut.target \
        nut-driver-enumerator.path \
        nut-driver@.service \
        "

FILES_${PN} += " \
            ${datadir} \
            /var/state/ups \
            "

REQUESTED_DISTRO_FEATURES = "systemd"
