include pijuice.inc 

S = "${WORKDIR}/git"

do_install() {
    install -d 0755 ${D}${sysconfdir}/pijuice/battery
    install -d 0755 ${D}${datadir}/pijuice/firmware

    cp -v ${S}/Software/Configs/Batteries/* ${D}${sysconfdir}/pijuice/battery
    cp -v ${S}/Firmware/*.elf.binary  ${D}${datadir}/pijuice/firmware
}


FILES_${PN} += " \
        ${datadir}/pijuice/firmware \
        "
