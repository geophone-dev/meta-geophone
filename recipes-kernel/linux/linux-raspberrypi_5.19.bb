LINUX_VERSION ?= "5.19.17"
LINUX_RPI_BRANCH ?= "rpi-5.19.y"
LINUX_RPI_KMETA_BRANCH ?= "yocto-5.19"

SRCREV_machine = "2b525314c7b57eac29fe8b77a6589428e4a4f6dd"
SRCREV_meta = "61d7aaaa97297780205a333d529e55136e20cb11"

KMETA = "kernel-meta"

SRC_URI = " \
    git://github.com/raspberrypi/linux.git;name=machine;branch=${LINUX_RPI_BRANCH};protocol=https \
    git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=${LINUX_RPI_KMETA_BRANCH};destsuffix=${KMETA} \
    file://powersave.cfg \
    file://patch-5.16.2-rt19.patch \
    file://preempt-rt.cfg \
    "

require linux-raspberrypi.inc

KERNEL_DTC_FLAGS += "-@ -H epapr"
