
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "\
    file://gpsd.default \
    file://gpsd.socket \
"

do_install_append() {
    install -m 0644 ${WORKDIR}/gpsd.default ${D}/${sysconfdir}/default/gpsd.default
    install -m 0644 ${WORKDIR}/gpsd.socket ${D}${systemd_unitdir}/system/${BPN}.socket
}