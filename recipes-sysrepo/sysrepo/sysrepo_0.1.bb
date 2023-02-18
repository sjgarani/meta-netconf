# Recipe created by recipetool
SUMMARY = "YANG-based configuration and operational state data store for Unix/Linux applications."
DESCRIPTION = ""
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef345f161efb68c3836e6f5648b2312f"

SRC_URI = "git://github.com/sysrepo/sysrepo.git;tag=v2.2.36;protocol=git"

DEPENDS = "libyang"

S = "${WORKDIR}/git"

FILES_${PN} += " /usr/share/yang/modules/sysrepo/* /usr/lib/sysrepo-plugind/plugins "

EXTRA_OECMAKE = ""

inherit cmake pkgconfig
