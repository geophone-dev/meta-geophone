DESCRIPTION = "PiJuice software and firmware"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRCREV = "399da842f97d862666132c2ce0b2fb103b802a5f"
SRC_URI = "git://github.com/PiSupply/PiJuice.git;protocol=https;branch=master \
            file://0001-Add-cmake-script-to-build-firmware-update-utility.patch \
            "
