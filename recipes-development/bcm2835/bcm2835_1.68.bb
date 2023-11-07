DESCRIPTION = "C library for Broadcom BCM 2835 as used in Raspberry Pi"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "http://www.airspayce.com/mikem/bcm2835/bcm2835-${PV}.tar.gz;name=bcm2835_archive \
            file://0001-Add-cmake-build-script.patch \
            "
SRC_URI[bcm2835_archive.md5sum] = "96ee0c2b078a77bfe4aa749fd056157a"
SRC_URI[bcm2835_archive.sha256sum] = "b7eda59fd7bc3cb97fdac14e8455e86ddad75006d69270358ac8d00108e369a9"

inherit cmake