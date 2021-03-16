DESCRIPTION = "Unofficial WiringPi Mirror"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS += "pkgconfig libgcrypt"

SRCREV = "e9821abdb4b4fe46a2ea9243471d339435fa7bde"
SRC_URI = "git://github.com/WiringPi/WiringPi.git;protocol=https;branch=master \
          file://0001-Add-cmake-script-to-build-the-wiring-pi-library.patch \
          file://0002-gpio-install-via-cmake.patch \
          "

S = "${WORKDIR}/git"

inherit cmake
