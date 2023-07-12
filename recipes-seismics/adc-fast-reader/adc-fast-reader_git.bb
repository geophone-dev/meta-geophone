DESCRIPTION = "Console utility which reads data from ADS1256 using DMA"
SECTION = "devel"
LICENSE = "Apache-2.0"

SRCREV = "78db837e6f199def609687a4b9a868fd298e20e5"
SRC_URI = "git://github.com/zuckerman-dev/adc-fast-reader.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake
