DESCRIPTION = "Install script to Rootfs"
SUMMARY = "Install script to Rootfs and run after boot"
LICENSE = "CLOSED"

SRC_URI = "file://netconf"

inherit update-rc.d

RDEPENDS_${PN} += "bash netopeer2"

INITSCRIPT_NAME = "netconf"

do_install() {
    install -d 644 ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/netconf ${D}${sysconfdir}/init.d/netconf
}

FILES_${PN} = "${sysconfdir}/init.d"
