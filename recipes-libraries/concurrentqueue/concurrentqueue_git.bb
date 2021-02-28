DESCRIPTION = "An industrial-strength lock-free queue for C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"

DEPENDS += "boost"

SRCREV = "3747268264d0fa113e981658a99ceeae4dad05b7"
SRC_URI = "git://github.com/cameron314/concurrentqueue.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake