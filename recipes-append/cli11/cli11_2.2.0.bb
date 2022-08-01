SUMMARY = "C++11 command line parser"
DESCRIPTION = "A command line parser for C++11 and beyond that provides a rich feature set with a simple and intuitive interface."
HOMEPAGE = "https://github.com/CLIUtils/CLI11"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9ad746b5f49c0fd53c08ca1faff1922c"

SRC_URI = "https://github.com/CLIUtils/CLI11/archive/refs/tags/v${PV}.tar.gz"

SRC_URI[md5sum] = "f0b70187eadf05a23257ac1d17c9a0e3"
SRC_URI[sha256sum] = "d60440dc4d43255f872d174e416705f56ba40589f6eb07727f76376fb8378fd6"

S = "${WORKDIR}/CLI11-${PV}"

inherit cmake
inherit ptest

EXTRA_OECMAKE += "-DCLI11_CLANG_TIDY=OFF"
DEPENDS += "boost"

# cli11 is a header only C++ library, so the main package will be empty.
RDEPENDS_${PN}-dev = ""
