LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "netconf.service"

SRC_URI_append = " file://netconf.service "
FILES_${PN} += "${systemd_unitdir}/system/netconf.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/netconf.service ${D}/${systemd_unitdir}/system
}
