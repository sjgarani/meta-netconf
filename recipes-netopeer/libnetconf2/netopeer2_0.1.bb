SUMMARY = "libnetconf2 is a NETCONF library in C intended for building NETCONF clients and servers"
DESCRIPTION = "The library provides functions to connect NETCONF client and server to each other via SSH and to send, receive and process NETCONF messages."
SECTION = "libs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=41daedff0b24958b2eba4f9086d782e1"

SRC_URI = "git://github.com/CESNET/netopeer2.git;tag=v2.1.49;protocol=git"

S = "${WORKDIR}/git"

DEPENDS = "libyang sysrepo libnetconf2 curl"

FILES_${PN} += " /usr/share/yang/modules/netopeer2/* "

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = " -DCMAKE_INSTALL_PREFIX=/usr -DCMAKE_BUILD_TYPE:String=Release -DINSTALL_MODULES:BOOL=OFF -DGENERATE_HOSTKEY:BOOL=OFF -DMERGE_LISTEN_CONFIG:BOOL=OFF "
