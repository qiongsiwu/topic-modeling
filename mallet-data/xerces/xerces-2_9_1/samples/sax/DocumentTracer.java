sax io OutputStream io OutputStreamWriter io PrintWriter io UnsupportedEncodingException io xml sax xml sax xml sax ContentHandler xml sax DocumentHandler xml sax DTDHandler xml sax ErrorHandler xml sax Locator xml sax xml sax SAXException xml sax SAXNotRecognizedException xml sax SAXNotSupportedException xml sax SAXParseException xml sax XMLReader xml sax helpers DefaultHandler xml sax helpers ParserAdapter xml sax helpers ParserFactory xml sax helpers XMLReaderFactory xml sax ext DeclHandler xml sax ext LexicalHandler documenttracer defaulthandler contenthandler dtdhandler errorhandler declhandler lexicalhandler documenthandler namespaces_feature_id namespace_prefixes_feature_id validation_feature_id schema_validation_feature_id schema_full_checking_feature_id honour_all_schema_locations_id validate_annotations_id dynamic_validation_feature_id load_external_dtd_feature_id xinclude_feature_id xinclude_fixup_base_uris_feature_id xinclude_fixup_language_feature_id lexical_handler_property_id default_parser_name default_namespaces default_namespace_prefixes default_validation default_load_external_dtd default_schema_validation default_schema_full_checking default_honour_all_schema_locations default_validate_annotations default_dynamic_validation default_xinclude default_xinclude_fixup_base_uris default_xinclude_fixup_language printwriter fout findent documenttracer setoutput printwriter setoutput outputstream stream encoding unsupportedencodingexception encoding encoding writer outputstreamwriter stream encoding fout printwriter writer setoutput writer fout writer printwriter printwriter writer printwriter writer setdocumentlocator locator locator printindent fout.print fout.print fout.print locator fout.println fout.flush startdocument saxexception findent printindent fout.println fout.flush findent processinginstruction target data saxexception printindent fout.print fout.print printquotedstring target fout.print fout.print printquotedstring data fout.println fout.flush characters ch offset length saxexception printindent fout.print fout.print printquotedstring ch offset length fout.println fout.flush ignorablewhitespace ch offset length saxexception printindent fout.print fout.print printquotedstring ch offset length fout.println fout.flush saxexception findent-- printindent fout.println fout.flush startprefixmapping prefix uri saxexception printindent fout.print fout.print printquotedstring prefix fout.print fout.print printquotedstring uri fout.println fout.flush startelement uri localname qname attributes saxexception printindent fout.print fout.print printquotedstring uri fout.print fout.print printquotedstring localname fout.print fout.print printquotedstring qname fout.print fout.print attributes fout.println fout.print length attributes.getlength length fout.print attrlocalname attributes.getlocalname attrqname attributes.getqname attruri attributes.geturi attrtype attributes.gettype attrvalue attributes.getvalue fout.print fout.print printquotedstring attruri fout.print fout.print printquotedstring attrlocalname fout.print fout.print printquotedstring attrqname fout.print fout.print printquotedstring attrtype fout.print fout.print printquotedstring attrvalue fout.print fout.print fout.println fout.flush findent uri localname qname saxexception findent-- printindent fout.print fout.print printquotedstring uri fout.print fout.print printquotedstring localname fout.print fout.print printquotedstring qname fout.println fout.flush endprefixmapping prefix saxexception printindent fout.print fout.print printquotedstring prefix fout.println fout.flush skippedentity name saxexception printindent fout.print fout.print printquotedstring name fout.println fout.flush startelement name attributes saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print attributes fout.println fout.print length attributes.getlength length attrname attributes.getname attrtype attributes.gettype attrvalue attributes.getvalue fout.print fout.print printquotedstring attrname fout.print fout.print printquotedstring attrtype fout.print fout.print printquotedstring attrvalue fout.print fout.print fout.println fout.flush findent name saxexception findent-- printindent fout.print fout.print printquotedstring name fout.println fout.flush notationdecl name publicid systemid saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring publicid fout.print fout.print printquotedstring systemid fout.println fout.flush unparsedentitydecl name publicid systemid notationname saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring publicid fout.print fout.print printquotedstring systemid fout.print fout.print printquotedstring notationname fout.println fout.flush startdtd name publicid systemid saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring publicid fout.print fout.print printquotedstring systemid fout.println fout.flush findent startentity name saxexception printindent fout.print fout.print printquotedstring name fout.println fout.flush findent startcdata saxexception printindent fout.println fout.flush findent endcdata saxexception findent-- printindent fout.println fout.flush comment ch offset length saxexception printindent fout.print fout.print printquotedstring ch offset length fout.println fout.flush name saxexception findent-- printindent fout.print fout.print printquotedstring name fout.println saxexception findent-- printindent fout.println fout.flush elementdecl name contentmodel saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring contentmodel fout.println fout.flush attributedecl elementname attributename type valuedefault saxexception printindent fout.print fout.print printquotedstring elementname fout.print fout.print printquotedstring attributename fout.print fout.print printquotedstring type fout.print fout.print printquotedstring valuedefault fout.print fout.print printquotedstring fout.println fout.flush internalentitydecl name text saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring text fout.println fout.flush externalentitydecl name publicid systemid saxexception printindent fout.print fout.print printquotedstring name fout.print fout.print printquotedstring publicid fout.print fout.print printquotedstring systemid fout.println fout.flush warning saxparseexception ex saxexception ex error saxparseexception ex saxexception ex fatalerror saxparseexception ex saxexception ex ex printquotedstring fout.print fout.print length s.length length s.charat normalizeandprint fout.print printquotedstring ch offset length fout.print length normalizeandprint ch offset fout.print normalizeandprint fout.print fout.print fout.print fout.print fout.print fout.print type saxparseexception ex system.err.print system.err.print type system.err.print systemid ex.getsystemid systemid index systemid.lastindexof index systemid systemid.substring index system.err.print systemid system.err.print system.err.print ex.getlinenumber system.err.print system.err.print ex.getcolumnnumber system.err.print system.err.print ex.getmessage system.err.println system.err.flush printindent findent fout.print argv argv.length printusage documenttracer tracer documenttracer printwriter printwriter xmlreader parser namespaces default_namespaces namespaceprefixes default_namespace_prefixes validation default_validation externaldtd default_load_external_dtd schemavalidation default_schema_validation schemafullchecking default_schema_full_checking honourallschemalocations default_honour_all_schema_locations validateannotations default_validate_annotations dynamicvalidation default_dynamic_validation xincludeprocessing default_xinclude xincludefixupbaseuris default_xinclude_fixup_base_uris xincludefixuplanguage default_xinclude_fixup_language argv.length arg argv arg.startswith option arg.substring option.equals argv.length system.err.println parsername argv parser xmlreaderfactory.createxmlreader parsername sax1parser parserfactory.makeparser parsername parser parseradapter sax1parser system.err.println ex parser system.err.println parsername option.equalsignorecase namespaces option.equals option.equalsignorecase namespaceprefixes option.equals option.equalsignorecase validation option.equals option.equalsignorecase externaldtd option.equals option.equalsignorecase schemavalidation option.equals option.equalsignorecase schemafullchecking option.equals option.equalsignorecase honourallschemalocations option.equals option.equalsignorecase validateannotations option.equals option.equalsignorecase dynamicvalidation option.equals option.equalsignorecase xincludeprocessing option.equals option.equalsignorecase xincludefixupbaseuris option.equals option.equalsignorecase xincludefixuplanguage option.equals option.equals printusage parser parser xmlreaderfactory.createxmlreader default_parser_name system.err.println default_parser_name parser.setfeature namespaces_feature_id namespaces saxexception system.err.println namespaces_feature_id parser.setfeature namespace_prefixes_feature_id namespaceprefixes saxexception system.err.println namespace_prefixes_feature_id parser.setfeature validation_feature_id validation saxexception system.err.println validation_feature_id parser.setfeature load_external_dtd_feature_id externaldtd saxnotrecognizedexception system.err.println load_external_dtd_feature_id saxnotsupportedexception system.err.println load_external_dtd_feature_id parser.setfeature schema_validation_feature_id schemavalidation saxnotrecognizedexception system.err.println schema_validation_feature_id saxnotsupportedexception system.err.println schema_validation_feature_id parser.setfeature schema_full_checking_feature_id schemafullchecking saxnotrecognizedexception system.err.println schema_full_checking_feature_id saxnotsupportedexception system.err.println schema_full_checking_feature_id parser.setfeature honour_all_schema_locations_id honourallschemalocations saxnotrecognizedexception system.err.println honour_all_schema_locations_id saxnotsupportedexception system.err.println honour_all_schema_locations_id parser.setfeature validate_annotations_id validateannotations saxnotrecognizedexception system.err.println validate_annotations_id saxnotsupportedexception system.err.println validate_annotations_id parser.setfeature dynamic_validation_feature_id dynamicvalidation saxnotrecognizedexception system.err.println dynamic_validation_feature_id saxnotsupportedexception system.err.println dynamic_validation_feature_id parser.setfeature xinclude_feature_id xincludeprocessing saxnotrecognizedexception system.err.println xinclude_feature_id saxnotsupportedexception system.err.println xinclude_feature_id parser.setfeature xinclude_fixup_base_uris_feature_id xincludefixupbaseuris saxnotrecognizedexception system.err.println xinclude_fixup_base_uris_feature_id saxnotsupportedexception system.err.println xinclude_fixup_base_uris_feature_id parser.setfeature xinclude_fixup_language_feature_id xincludefixuplanguage saxnotrecognizedexception system.err.println xinclude_fixup_language_feature_id saxnotsupportedexception system.err.println xinclude_fixup_language_feature_id parser.setdtdhandler tracer parser.seterrorhandler tracer parser xmlreader parser.setcontenthandler tracer parser.setproperty tracer saxexception e.printstacktrace system.err parser.setproperty tracer saxexception e.printstacktrace system.err parser setdocumenthandler tracer parser.parse arg saxparseexception system.err.println e.getmessage saxexception nested saxexception nested nested e.printstacktrace system.err printusage system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println system.err.println default_parser_name system.err.print system.err.println default_namespaces system.err.print system.err.println default_namespace_prefixes system.err.print system.err.println default_validation system.err.print system.err.println default_load_external_dtd system.err.print system.err.println default_schema_validation system.err.print system.err.println default_schema_full_checking system.err.print system.err.println default_honour_all_schema_locations system.err.print system.err.println default_validate_annotations system.err.print system.err.println default_dynamic_validation system.err.print system.err.println default_xinclude system.err.print system.err.println default_xinclude_fixup_base_uris system.err.print system.err.println default_xinclude_fixup_language 