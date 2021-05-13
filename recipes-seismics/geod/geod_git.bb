DESCRIPTION = "Daemon which distributes seismic signal over the network"
SECTION = "devel"
LICENSE = "Apache2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += "adc-read cppzmq spdlog"

SRCREV = "1bb805ab95f12c327c77263900c89b2e61f2c60e"
SRC_URI = "git://github.com/zuckerman-dev/geod.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake systemd

SYSTEMD_SERVICE_${PN} += " \
        geod.service \
        "
