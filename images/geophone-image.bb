SUMMARY = "A console development image customized for the rpi"
HOMEPAGE = "http://zuckerman.dev"

require images/basic-dev-image.bb

DEPENDS += "bootfiles"

WIFI = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"

DEV_EXTRAS = " \
    serialecho  \
    spiloop \
"

RPI_STUFF = " \
    raspi2fb \
    userland \
    spidev-test \
    adc2tcp \   
    adc-read \
    geod \
"

GPS_STUFF = " \
    gpsd \
    gps-utils \
"

POWER_MANAGEMENT = " \
    nut \
"

ADDONS = " \
    python3 \
    nginx \
"

IMAGE_INSTALL += " \
    firewall \
    ${ADDONS} \
    ${POWER_MANAGEMENT} \ 
    ${GPS_STUFF} \
    ${DEV_EXTRAS} \
    ${RPI_STUFF} \
    ${WIFI} \
    ${SECURITY_TOOLS} \
    ${WIREGUARD} \
"

export IMAGE_BASENAME = "geophone-image"
