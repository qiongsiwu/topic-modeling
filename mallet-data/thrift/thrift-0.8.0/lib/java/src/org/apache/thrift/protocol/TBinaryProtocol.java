protocol io UnsupportedEncodingException nio ByteBuffer TException transport TTransport tbinaryprotocol tprotocol tstruct anonymous_struct tstruct version_mask version_1 strictread_ strictwrite_ readlength_ checkreadlength_ factory tprotocolfactory strictread_ strictwrite_ readlength_ factory factory strictread strictwrite strictread strictwrite factory strictread strictwrite readlength strictread_ strictread strictwrite_ strictwrite readlength_ readlength tprotocol getprotocol ttransport trans tbinaryprotocol proto tbinaryprotocol trans strictread_ strictwrite_ readlength_ proto.setreadlength readlength_ proto tbinaryprotocol ttransport trans trans tbinaryprotocol ttransport trans strictread strictwrite trans strictread_ strictread strictwrite_ strictwrite writemessagebegin tmessage message texception strictwrite_ version version_1 message.type writei32 version writestring message.name writei32 message.seqid writestring message.name writebyte message.type writei32 message.seqid writemessageend writestructbegin tstruct struct writestructend writefieldbegin tfield field texception writebyte field.type writei16 field.id writefieldend writefieldstop texception writebyte ttype.stop writemapbegin tmap map texception writebyte map.keytype writebyte map.valuetype writei32 map.size writemapend writelistbegin tlist list texception writebyte list.elemtype writei32 list.size writelistend writesetbegin tset texception writebyte set.elemtype writei32 writesetend writebool texception writebyte bout writebyte texception bout trans_.write bout i16out writei16 i16 texception i16out i16 i16out i16 trans_.write i16out i32out writei32 i32 texception i32out i32 i32out i32 i32out i32 i32out i32 trans_.write i32out i64out writei64 i64 texception i64out i64 i64out i64 i64out i64 i64out i64 i64out i64 i64out i64 i64out i64 i64out i64 trans_.write i64out writedouble dub texception writei64 double.doubletolongbits dub writestring str texception dat str.getbytes writei32 dat.length trans_.write dat dat.length unsupportedencodingexception uex texception writebinary bytebuffer bin texception length bin.limit bin.position writei32 length trans_.write bin.array bin.position bin.arrayoffset length tmessage readmessagebegin texception readi32 version version_mask version version_1 tprotocolexception tprotocolexception.bad_version tmessage readstring readi32 strictread_ tprotocolexception tprotocolexception.bad_version tmessage readstringbody readbyte readi32 readmessageend tstruct readstructbegin anonymous_struct readstructend tfield readfieldbegin texception type readbyte id type ttype.stop readi16 tfield type id readfieldend tmap readmapbegin texception tmap readbyte readbyte readi32 readmapend tlist readlistbegin texception tlist readbyte readi32 readlistend tset readsetbegin texception tset readbyte readi32 readsetend readbool texception readbyte bin readbyte texception trans_.getbytesremaininginbuffer trans_.getbuffer trans_.getbufferposition trans_.consumebuffer readall bin bin i16rd readi16 texception buf i16rd trans_.getbytesremaininginbuffer buf trans_.getbuffer trans_.getbufferposition trans_.consumebuffer readall i16rd buf buf i32rd readi32 texception buf i32rd trans_.getbytesremaininginbuffer buf trans_.getbuffer trans_.getbufferposition trans_.consumebuffer readall i32rd buf buf buf buf i64rd readi64 texception buf i64rd trans_.getbytesremaininginbuffer buf trans_.getbuffer trans_.getbufferposition trans_.consumebuffer readall i64rd buf buf buf buf buf buf buf buf readdouble texception double.longbitstodouble readi64 readstring texception readi32 trans_.getbytesremaininginbuffer trans_.getbuffer trans_.getbufferposition trans_.consumebuffer unsupportedencodingexception texception readstringbody readstringbody texception checkreadlength buf trans_.readall buf buf unsupportedencodingexception uex texception bytebuffer readbinary texception readi32 checkreadlength trans_.getbytesremaininginbuffer bytebuffer bb bytebuffer.wrap trans_.getbuffer trans_.getbufferposition trans_.consumebuffer bb buf trans_.readall buf bytebuffer.wrap buf readall buf len texception checkreadlength len trans_.readall buf len setreadlength readlength readlength_ readlength checkreadlength_ checkreadlength length texception length texception length checkreadlength_ readlength_ length readlength_ texception length 