DESCRIPTION = "Console utility which reads data from ADC1256 and writes it to stdout"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "wiring-pi bcm2835 cli11 concurrentqueue spdlog date"

SRCREV = "40365748ab00f22833f7352d7c2eb6ff02b3a56e"
SRC_URI = "git://github.com/zuckerman-dev/adc-reader.git;protocol=https;branch=add-support-for-ads1263"

S = "${WORKDIR}/git"

inherit cmake