DESCRIPTION = "An industrial-strength lock-free queue for C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"

DEPENDS += "boost"

SRCREV = "e6fec438e8639221d43dae4b2ddf133e20580fdd"
SRC_URI = "git://github.com/cameron314/concurrentqueue.git;protocol=https;branch=master \
           file://0001-Modernize-cmake.patch \
        "

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

inherit cmake

# Header-only library
RDEPENDS_${PN}-dev = ""
RRECOMMENDS_${PN}-dbg = "${PN}-dev (= ${EXTENDPKGV})"
