SUMMARY = "TI ADS1256 Analog to digital converter SPI kernel driver module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/zuckerman-dev/kernel-module-ads1256.git;protocol=https;branch=main"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-ads1256"
