DESCRIPTION = "The miniSEED library provides a framework for manipulation of SEED data records"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "04389accf9a7dd95ef7b8fe4a44843c4b0efc1f8"
SRC_URI = "git://github.com/iris-edu/libmseed.git;protocol=https;branch=master \
            file://0001-Add-support-for-cmake.patch  \
            "

S = "${WORKDIR}/git"

inherit cmake