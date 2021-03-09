DESCRIPTION = "A package for reproducible geophysical data processing"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "python3-native python3-scons-native"

SRCREV = "71134e19f1ff991c4bc7f575164866ff4b29a3be"
SRC_URI = "git://github.com/ahay/src.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

EXTRA_OECONF += "\
                API=c++ \
                "

inherit autotools