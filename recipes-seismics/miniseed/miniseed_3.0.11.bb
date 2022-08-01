DESCRIPTION = "The miniSEED library provides a framework for manipulation of SEED data records"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://github.com/iris-edu/libmseed/archive/refs/tags/v${PV}.tar.gz \
           file://0001-Add-support-for-cmake.patch  \
        "

SRC_URI[md5sum] = "4d8b7160a73ce9a86d6ffc04ce149502"
SRC_URI[sha256sum] = "f049ef4904577adb2903bc7e35283d98b6c9db5228df042612680f5a7a333f40"

S = "${WORKDIR}/libmseed-${PV}"

inherit cmake