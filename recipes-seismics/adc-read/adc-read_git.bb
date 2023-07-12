DESCRIPTION = "Console utility which reads data from ADC1256 and writes it to stdout"
SECTION = "devel"
LICENSE = "Apache-2.0"

DEPENDS += "wiring-pi bcm2835 cli11 concurrentqueue asio spdlog date"

SRCREV = "0445498e747cae138b1ce82ed56062ed75d0c4b3"
SRC_URI = "git://github.com/zuckerman-dev/adc-reader.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake