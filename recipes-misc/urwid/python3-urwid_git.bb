DESCRIPTION = "Urwid is a console user interface library for Python"
SECTION = "devel"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780"

SRCREV = "951093c8ec12309e5baa19ee6f907bc35a830f54"
SRC_URI = "git://github.com/urwid/urwid.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit setuptools3
