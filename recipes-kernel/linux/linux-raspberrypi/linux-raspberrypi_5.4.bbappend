FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION = "5.4.83"
LINUX_RPI_BRANCH = "rpi-5.4.y"

SRCREV_machine = "93349cdffc3fbb446c7c1fc7354215a5b8e30b97"

SRC_URI += " \
    file://0001-realtime-apply-preemt-rt.patch \
    file://preempt-rt.cfg
"