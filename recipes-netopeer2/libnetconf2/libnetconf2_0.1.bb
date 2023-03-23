SUMMARY = ""
DESCRIPTION = ""
SECTION = "libs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08a5578c9bab06fb2ae84284630b973f"

SRC_URI = "git://github.com/CESNET/libnetconf2.git;tag=v2.1.28;protocol=git"

S = "${WORKDIR}/git"

DEPENDS = "libssh libxcrypt openssl libyang"

FILES_${PN} += " /usr/share/yang/modules/libnetconf2/* "

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = " -DCMAKE_INSTALL_PREFIX:PATH=/usr -DCMAKE_BUILD_TYPE:String=Release "
