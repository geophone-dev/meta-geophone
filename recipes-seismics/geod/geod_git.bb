DESCRIPTION = "Daemon which distributes seismic signal over the network"
SECTION = "devel"
LICENSE = "Apache2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += "adc-read cppzmq spdlog"

SRCREV = "fb1d9091b34fade7ade694c6ce995411008f1546"
SRC_URI = "git://github.com/zuckerman-dev/geod.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake systemd

SYSTEMD_SERVICE_${PN} += " \
        geod.service \
        "
