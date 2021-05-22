SUMMARY = "TI ADS1256 Analog to digital converter SPI kernel driver module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://git/LICENSE;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRCREV = "dc11a51367322bae8fdaba7ce0ac37edc0c7087d"
SRC_URI = "git://github.com/zuckerman-dev/ads1256-rtdm.git;protocol=https;branch=add-sources"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "ads1256-rtdm"