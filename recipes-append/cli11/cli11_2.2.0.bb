SUMMARY = "C++11 command line parser"
DESCRIPTION = "A command line parser for C++11 and beyond that provides a rich feature set with a simple and intuitive interface."
HOMEPAGE = "https://github.com/CLIUtils/CLI11"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b73927b18d5c6cd8d2ed28a6ad539733"

SRC_URI += "git://github.com/CLIUtils/CLI11;tag=${PV}"

S = "${WORKDIR}/git"

inherit cmake
inherit ptest

EXTRA_OECMAKE += "-DCLI11_CLANG_TIDY=OFF"
DEPENDS += "boost"

# cli11 is a header only C++ library, so the main package will be empty.
RDEPENDS_${PN}-dev = ""
