include pijuice.inc 

DEPENDS = " \
        python3-smbus \
        python3-urwid \
        "

S = "${WORKDIR}/git/Software/Source"

SRC_URI:append = " \            
    file://0002-Fix-setuptools-issue.patch \
    "

inherit setuptools3

do_install:prepend() {
    export PIJUICE_BUILD_BASE=1
}

do_install:append() {
    mv ${D}${datadir}/bin/pijuice_cli ${D}${bindir}

    rm -rv ${D}${datadir}
}

FILES:${PN} += " \
            ${bindir}/pijuice_cli \
            "
