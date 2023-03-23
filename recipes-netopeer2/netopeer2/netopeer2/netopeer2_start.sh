#!/bin/sh

init_sysrepo() {
    export NP2_MODULE_DIR="/usr/share/yang/modules/netopeer2"
    export NP2_MODULE_PERMS="600"
    export NP2_MODULE_OWNER="root"
    export NP2_MODULE_GROUP="root"
    sh /usr/share/netopeer2/setup.sh
    sh /usr/share/netopeer2/merge_hostkey.sh
    sh /usr/share/netopeer2/merge_config.sh
    touch /etc/sysrepo/init
}

test -r /etc/sysrepo/init || init_sysrepo

netopeer2-server -d -v 2
