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

SRC_URI[sha256sum] = "6469aa40d0e61aca9342ba39e822b710177734b171e53a4ab9abb97401a2c480"
SRC_URI[md5sum] = "b723010a75fa0e87a09908c40a0105e9"

inherit autotools pkgconfig

prefix="/usr/xenomai"

EXTRA_OECONF += "--with-core=cobalt"

FILES_${PN} += " \
  /usr/xenomai/demo/bufp-readwrite \
  /usr/xenomai/demo/xddp-echo \
  /usr/xenomai/demo/cyclictest \
  /usr/xenomai/demo/gpiopwm \
  /usr/xenomai/demo/xddp-label \
  /usr/xenomai/demo/eth_p_all \
  /usr/xenomai/demo/can_rtt \
  /usr/xenomai/demo/bufp-label \
  /usr/xenomai/demo/altency \
  /usr/xenomai/demo/iddp-sendrecv \
  /usr/xenomai/demo/xddp-stream \
  /usr/xenomai/demo/iddp-label \
  /usr/xenomai/demo/cross-link \
  /usr/xenomai/lib/cobalt.wrappers \
  /usr/xenomai/lib/dynlist.ld \
  /usr/xenomai/lib/modechk.wrappers \
"