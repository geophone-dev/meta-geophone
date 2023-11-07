DESCRIPTION = "An industrial-strength lock-free queue for C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f"

DEPENDS += "boost"

SRCREV = "e6fec438e8639221d43dae4b2ddf133e20580fdd"
SRC_URI = "git://github.com/cameron314/concurrentqueue.git;protocol=https;branch=master \
           file://0001-Modernize-cmake.patch \
        "

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

inherit cmake

# Header-only library
RDEPENDS:${PN}-dev = ""
RRECOMMENDS:${PN}-dbg = "${PN}-dev (= ${EXTENDPKGV})"
