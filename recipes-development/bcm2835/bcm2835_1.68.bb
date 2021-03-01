DESCRIPTION = "C library for Broadcom BCM 2835 as used in Raspberry Pi"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "http://www.airspayce.com/mikem/bcm2835/bcm2835-${PV}.tar.gz;name=bcm2835_archive"
SRC_URI[bcm2835_archive.md5sum] = ""

inherit autotools