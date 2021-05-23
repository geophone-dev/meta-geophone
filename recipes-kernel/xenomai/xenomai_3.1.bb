DESCRIPTION = "Xenomai 3 is the new architecture of the Xenomai real-time framework, \
               which can run seamlessly side-by-side Linux as a co-kernel system, or \
               natively over mainline Linux kernels.  In the latter case, the \
               mainline kernel can be supplemented by the \
               PREEMPT-RT patch to meet stricter response time requirements \ 
               than standard kernel preemption would bring. \
               "

SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://xenomai.org/downloads/xenomai/stable/xenomai-${PV}.tar.bz2"

inherit autotools systemd


