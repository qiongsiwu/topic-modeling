protocol nio ByteBuffer junit framework TestCase Fixtures TBase TDeserializer TException TSerializer transport TMemoryBuffer test CompactProtoTestStruct test HolyMoley test Nesting test OneOfEach test Srv protocoltestbase testcase canbeusednaked tprotocolfactory getfactory testdouble canbeusednaked tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writedouble assertequals proto.readdouble internalteststructfield structfieldtestcase ttype.double override readmethod tprotocol proto texception assertequals proto.readdouble override writemethod tprotocol proto texception proto.writedouble testserialization internaltestserialization oneofeach.class fixtures.oneofeach internaltestserialization nesting.class fixtures.nesting internaltestserialization holymoley.class fixtures.holymoley internaltestserialization compactprototeststruct.class fixtures.compactprototeststruct testbinary canbeusednaked internaltestnakedbinary internaltestbinaryfield canbeusednaked data tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf bytebuffer bb bytebuffer.wrap data bb.get proto.writebinary bb.slice assertequals bytebuffer.wrap data proto.readbinary teststring canbeusednaked internaltestnakedstring internalteststringfield testlong canbeusednaked internaltestnakedi64 internaltesti64field canbeusednaked internaltestnakedi64 l internaltestnakedi64 l internaltesti64field l internaltesti64field l testint canbeusednaked internaltestnakedi32 internaltesti32field testshort canbeusednaked internaltestnakedi16 internaltesti16field testbyte canbeusednaked internaltestnakedbyte internaltestbytefield internaltestbytefield internaltestnakedbyte tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writebyte assertequals proto.readbyte internaltestbytefield internalteststructfield structfieldtestcase ttype.byte writemethod tprotocol proto texception proto.writebyte readmethod tprotocol proto texception assertequals proto.readbyte internaltestnakedi16 tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writei16 assertequals proto.readi16 internaltesti16field internalteststructfield structfieldtestcase ttype.i16 writemethod tprotocol proto texception proto.writei16 readmethod tprotocol proto texception assertequals proto.readi16 internaltestnakedi32 tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writei32 assertequals proto.readi32 internaltesti32field internalteststructfield structfieldtestcase ttype.i32 writemethod tprotocol proto texception proto.writei32 readmethod tprotocol proto texception assertequals proto.readi32 internaltestnakedi64 tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writei64 assertequals proto.readi64 internaltesti64field internalteststructfield structfieldtestcase ttype.i64 writemethod tprotocol proto texception proto.writei64 readmethod tprotocol proto texception assertequals proto.readi64 internaltestnakedstring str tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writestring str assertequals str proto.readstring internalteststringfield str internalteststructfield structfieldtestcase ttype.string writemethod tprotocol proto texception proto.writestring str readmethod tprotocol proto texception assertequals str proto.readstring internaltestnakedbinary data tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf proto.writebinary bytebuffer.wrap data assertequals bytebuffer.wrap data proto.readbinary internaltestbinaryfield data internalteststructfield structfieldtestcase ttype.string writemethod tprotocol proto texception proto.writebinary bytebuffer.wrap data readmethod tprotocol proto texception assertequals bytebuffer.wrap data proto.readbinary t tbase internaltestserialization t klass t expected tmemorybuffer buf tmemorybuffer tbinaryprotocol binproto tbinaryprotocol buf expected.write binproto buf tmemorybuffer tprotocol proto getfactory getprotocol buf expected.write proto proto.getclass getsimplename buf.length t actual klass.newinstance actual.read proto assertequals expected actual testmessage tmessage msgs tmessage tmessage tmessagetype.call tmessage tmessagetype.reply tmessage tmessagetype.exception tmessage tmessagetype.call tmessage msg msgs tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf tmessage output proto.writemessagebegin msg proto.writemessageend output proto.readmessagebegin assertequals msg output testserverrequest srv.iface handler srv.iface janky i32arg texception i32arg primitivemethod texception compactprototeststruct structmethod texception texception methodwithdefaultargs texception override onewaymethod texception srv.processor testprocessor srv.processor handler tmemorybuffer clientouttrans tmemorybuffer tprotocol clientoutproto getfactory getprotocol clientouttrans tmemorybuffer clientintrans tmemorybuffer tprotocol clientinproto getfactory getprotocol clientintrans srv.client testclient srv.client clientinproto clientoutproto testclient.send_janky testprocessor.process clientoutproto clientinproto assertequals testclient.recv_janky testtdeserializer texception tserializer ser tserializer getfactory bytes ser.serialize fixtures.compactprototeststruct tdeserializer deser tdeserializer getfactory compactprototeststruct cpts compactprototeststruct deser.deserialize cpts bytes assertequals fixtures.compactprototeststruct cpts internalteststructfield structfieldtestcase testcase tmemorybuffer buf tmemorybuffer tprotocol proto getfactory getprotocol buf tfield field tfield testcase.type_ testcase.id_ proto.writestructbegin tstruct proto.writefieldbegin field testcase.writemethod proto proto.writefieldend proto.writestructend proto.readstructbegin tfield readfield proto.readfieldbegin assertequals testcase.id_ readfield.id assertequals testcase.type_ readfield.type testcase.readmethod proto proto.readstructend structfieldtestcase type_ id_ structfieldtestcase type id type_ type id_ id writemethod tprotocol proto texception readmethod tprotocol proto texception num_trials num_reps benchmark trial trial num_trials trial tserializer ser tserializer getfactory serialized serstart system.currenttimemillis rep rep num_reps rep serialized ser.serialize fixtures.holymoley serend system.currenttimemillis serelapsed serend serstart serelapsed serelapsed holymoley cpts holymoley tdeserializer deser tdeserializer getfactory deserstart system.currenttimemillis rep rep num_reps rep deser.deserialize cpts serialized deserend system.currenttimemillis deserelapsed deserend deserstart deserelapsed deserelapsed 