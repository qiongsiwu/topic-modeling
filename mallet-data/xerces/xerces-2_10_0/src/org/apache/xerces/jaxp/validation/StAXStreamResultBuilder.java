jaxp validation xml stream XMLStreamException xml stream XMLStreamReader xml stream XMLStreamWriter xml stream events Characters xml stream events Comment xml stream events xml stream events EndDocument xml stream events xml stream events ProcessingInstruction xml stream events StartDocument xml transform stax StAXResult JAXPNamespaceContextWrapper xni Augmentations xni NamespaceContext xni QName xni XMLAttributes xni XMLLocator xni XMLResourceIdentifier xni XMLString xni XNIException xni parser XMLDocumentSource staxstreamresultbuilder staxdocumenthandler xmlstreamwriter fstreamwriter jaxpnamespacecontextwrapper fnamespacecontext fignorechars fincdata qname fattrname qname staxstreamresultbuilder jaxpnamespacecontextwrapper context fnamespacecontext context setstaxresult staxresult fignorechars fincdata fattrname.clear fstreamwriter result.getxmlstreamwriter startdocument xmlstreamreader reader xmlstreamexception version reader.getversion encoding reader.getcharacterencodingscheme fstreamwriter.writestartdocument encoding encoding version version xmlstreamreader reader xmlstreamexception fstreamwriter.writeenddocument fstreamwriter.flush comment xmlstreamreader reader xmlstreamexception fstreamwriter.writecomment reader.gettext processinginstruction xmlstreamreader reader xmlstreamexception data reader.getpidata data data.length fstreamwriter.writeprocessinginstruction reader.getpitarget data fstreamwriter.writeprocessinginstruction reader.getpitarget entityreference xmlstreamreader reader xmlstreamexception fstreamwriter.writeentityref reader.getlocalname startdocument startdocument event xmlstreamexception version event.getversion encoding event.getcharacterencodingscheme fstreamwriter.writestartdocument encoding encoding version version enddocument event xmlstreamexception fstreamwriter.writeenddocument fstreamwriter.flush doctypedecl event xmlstreamexception fstreamwriter.writedtd event.getdocumenttypedeclaration characters characters event xmlstreamexception fstreamwriter.writecharacters event.getdata cdata characters event xmlstreamexception fstreamwriter.writecdata event.getdata comment comment event xmlstreamexception fstreamwriter.writecomment event.gettext processinginstruction processinginstruction event xmlstreamexception data event.getdata data data.length fstreamwriter.writeprocessinginstruction event.gettarget data fstreamwriter.writeprocessinginstruction event.gettarget entityreference event xmlstreamexception fstreamwriter.writeentityref event.getname setignoringcharacters ignore fignorechars ignore startdocument xmllocator locator encoding namespacecontext namespacecontext augmentations augs xniexception xmldecl version encoding standalone augmentations augs xniexception doctypedecl rootelement publicid systemid augmentations augs xniexception comment xmlstring text augmentations augs xniexception processinginstruction target xmlstring data augmentations augs xniexception startelement qname element xmlattributes attributes augmentations augs xniexception element.prefix.length fstreamwriter.writestartelement element.prefix element.localpart element.uri element.uri element.uri fstreamwriter.writestartelement element.uri element.localpart fstreamwriter.writestartelement element.localpart fnamespacecontext.getdeclaredprefixcount javax.xml.namespace.namespacecontext nc fnamespacecontext.getnamespacecontext prefix fnamespacecontext.getdeclaredprefixat uri nc.getnamespaceuri prefix prefix.length fstreamwriter.writedefaultnamespace uri uri fstreamwriter.writenamespace prefix uri uri attributes.getlength attributes.getname fattrname fattrname.prefix.length fstreamwriter.writeattribute fattrname.prefix fattrname.uri fattrname.uri fattrname.localpart attributes.getvalue fattrname.uri fstreamwriter.writeattribute fattrname.uri fattrname.localpart attributes.getvalue fstreamwriter.writeattribute fattrname.localpart attributes.getvalue xmlstreamexception xniexception emptyelement qname element xmlattributes attributes augmentations augs xniexception startelement element attributes augs element augs startgeneralentity name xmlresourceidentifier identifier encoding augmentations augs xniexception textdecl version encoding augmentations augs xniexception endgeneralentity name augmentations augs xniexception characters xmlstring text augmentations augs xniexception fignorechars fincdata fstreamwriter.writecharacters text.ch text.offset text.length fstreamwriter.writecdata text.tostring xmlstreamexception xniexception ignorablewhitespace xmlstring text augmentations augs xniexception characters text augs qname element augmentations augs xniexception fstreamwriter.writeendelement xmlstreamexception xniexception startcdata augmentations augs xniexception fincdata endcdata augmentations augs xniexception fincdata augmentations augs xniexception setdocumentsource xmldocumentsource source xmldocumentsource getdocumentsource 