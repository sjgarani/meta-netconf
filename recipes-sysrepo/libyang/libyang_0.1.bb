# Recipe created by recipetool
SUMMARY = "YANG-based configuration and operational state data store for Unix/Linux applications."
DESCRIPTION = ""
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3916d7d8d42a6508d0ea418cfff10ad"

SRC_URI = "git://github.com/CESNET/libyang.git;tag=v2.1.30;protocol=git"

DEPENDS = "libpcre2"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = ""

inherit cmake

FILES_${PN} += " /usr/share/yang "