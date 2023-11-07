include pijuice.inc 

S = "${WORKDIR}/git/Firmware"

SRC_URI:append = " \
        file://0001-Add-cmake-script-to-build-firmware-update-utility.patch \
"

inherit cmake