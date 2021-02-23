DESCRIPTION = "Daemon which reads analog data input using SPI and translates it over network"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "wiring-pi boost"

SRCREV = "158a08ef567d9c9890c169f48e48b10b3d70e46c"
SRC_URI = "git://gitlab.com/michaelzuckerman/raspberry-ads1256-dac8552.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake