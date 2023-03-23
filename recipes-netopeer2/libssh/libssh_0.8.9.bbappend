EXTRA_OECMAKE = " -DWITH_GCRYPT=0 -DWITH_PCAP=0 -DWITH_SFTP=1 -DWITH_ZLIB=0 -DLIB_SUFFIX=${@d.getVar('baselib', True).replace('lib', '')} "
