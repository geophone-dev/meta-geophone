DESCRIPTION = "Console utility which can read data from ADC1256 and output in stdout"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "wiring-pi cli11 concurrentqueue"

SRCREV = "1caf58562523adcfc9dc7a624029f7dcf98a85d1"
SRC_URI = "git://gitlab.com/michaelzuckerman/adc-read.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake