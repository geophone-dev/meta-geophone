DESCRIPTION = "An industrial-strength lock-free queue for C++."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "8f95c598c931c7a955720bfecbf01337978c69e0"
SRC_URI = "git://github.com/HowardHinnant/date.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += " \
        -DUSE_SYSTEM_TZ_DB=ON \
        -DBUILD_SHARED_LIBS=ON \       
        -DBUILD_TZ_LIB=ON \
"