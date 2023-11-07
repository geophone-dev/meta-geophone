DESCRIPTION = "Test application for SPI driver"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "a9ed7102a24ef3d68598efbace0da475fb7391f8"
SRC_URI = "git://github.com/zuckerman-dev/spidev_test.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake