DESCRIPTION = "Console utility which reads data from ADS1256 using DMA"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "78db837e6f199def609687a4b9a868fd298e20e5"
SRC_URI = "git://github.com/zuckerman-dev/adc-fast-reader.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake systemd

SYSTEMD_SERVICE_${PN} += " \
        adcrf.service \
        "
