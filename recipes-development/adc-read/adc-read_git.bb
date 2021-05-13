DESCRIPTION = "Console utility which reads data from ADC1256 and writes it to stdout"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "wiring-pi bcm2835 cli11 concurrentqueue spdlog"

SRCREV = "620b6dec5a713e44791b6433a1d38fe0002a6673"
SRC_URI = "git://github.com/zuckerman-dev/adc-reader.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake