FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append_class-target = " file://fw_env.config"

do_install:append_class-target() {
	install -d ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}
}

FILES_${PN}:append_class-target = " ${sysconfdir}"
