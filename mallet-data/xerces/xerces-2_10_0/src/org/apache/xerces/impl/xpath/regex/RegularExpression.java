impl xpath regex text IntStack regularexpression java.io.serializable serialversionuid l debug compile token tok this.operations this.numberofclosures this.operations this.compile tok op compile token tok op reverse op ret tok.type token.dot ret op.createdot ret.next token.char ret op.createchar tok.getchar ret.next token.anchor ret op.createanchor tok.getchar ret.next token.range token.nrange ret op.createrange tok ret.next token.concat ret reverse tok.size ret compile tok.getchild ret tok.size ret compile tok.getchild ret token.union op.unionop uni op.createunion tok.size tok.size uni.addelement compile tok.getchild reverse ret uni token.closure token.nongreedyclosure token child tok.getchild min tok.getmin max tok.getmax min min max ret min ret compile child ret reverse min max max min max ret max op.childop op.createquestion tok.type token.nongreedyclosure q.setchild compile child ret reverse ret op.childop op tok.type token.nongreedyclosure op op.createnongreedyclosure op op.createclosure this.numberofclosures op.next op.setchild compile child op reverse ret op min min ret compile child ret reverse token.empty ret token.string ret op.createstring tok.getstring ret.next token.backreference ret op.createbackreference tok.getreferencenumber ret.next token.paren tok.getparennumber ret compile tok.getchild reverse reverse op.createcapture tok.getparennumber compile tok.getchild reverse ret op.createcapture tok.getparennumber op.createcapture tok.getparennumber compile tok.getchild reverse ret op.createcapture tok.getparennumber token.lookahead ret op.createlook op.lookahead compile tok.getchild token.negativelookahead ret op.createlook op.negativelookahead compile tok.getchild token.lookbehind ret op.createlook op.lookbehind compile tok.getchild token.negativelookbehind ret op.createlook op.negativelookbehind compile tok.getchild token.independent ret op.createindependent compile tok.getchild reverse token.modifiergroup ret op.createmodifier compile tok.getchild reverse token.modifiertoken tok getoptions token.modifiertoken tok getoptionsmask token.condition token.conditiontoken ctok token.conditiontoken tok ref ctok.refnumber op condition ctok.condition compile ctok.condition reverse op yes compile ctok.yes reverse op ctok.no compile ctok.no reverse ret op.createcondition ref condition yes tok.type ret matches target this.matches target target length match matches target start this.matches target start match matches target match match this.matches target target length match matches target start match match this.operations this.prepare this.context this.context con this.context con this.context.inuse this.context con.reset target start this.numberofclosures match match.setnumberofgroups this.nofparen match.setsource target this.hasbackreferences match match match.setnumberofgroups this.nofparen con.match match regularexpression.isset this.options xmlschema_mode matchend match con this.operations con.start this.options matchend con.limit con.match con.match.setbeginning con.start con.match.setend matchend con.setinuse this.fixedstringonly this.fixedstringtable.matches target con.start con.limit con.match con.match.setbeginning con.match.setend this.fixedstring.length con.setinuse con.setinuse this.fixedstring this.fixedstringtable.matches target con.start con.limit con.setinuse limit con.limit-this.minlength matchstart matchend this.operations this.operations.type op.closure this.operations.getchild type op.dot this.options single_line matchstart con.start matchend match con this.operations con.start this.options previousiseol matchstart con.start matchstart limit matchstart ch target matchstart iseolchar ch previousiseol previousiseol matchend match con this.operations matchstart this.options previousiseol this.firstchar rangetoken range this.firstchar matchstart con.start matchstart limit matchstart ch target matchstart reutil.ishighsurrogate ch matchstart con.limit ch reutil.composefromsurrogates ch target matchstart range.match ch matchend match con this.operations matchstart this.options matchstart con.start matchstart limit matchstart matchend match con this.operations matchstart this.options matchend con.match con.match.setbeginning matchstart con.match.setend matchend con.setinuse con.setinuse matches target this.matches target target length match matches target start this.matches target start match matches target match match this.matches target target length match matches target start match match this.operations this.prepare this.context this.context con this.context con this.context.inuse this.context con.reset target start this.numberofclosures match match.setnumberofgroups this.nofparen match.setsource target this.hasbackreferences match match match.setnumberofgroups this.nofparen con.match match regularexpression.isset this.options xmlschema_mode debug system.err.println target matchend match con this.operations con.start this.options debug system.err.println matchend system.err.println con.limit matchend con.limit con.match con.match.setbeginning con.start con.match.setend matchend con.setinuse this.fixedstringonly this.fixedstringtable.matches target con.start con.limit con.match con.match.setbeginning con.match.setend this.fixedstring.length con.setinuse con.setinuse this.fixedstring this.fixedstringtable.matches target con.start con.limit con.setinuse limit con.limit-this.minlength matchstart matchend this.operations this.operations.type op.closure this.operations.getchild type op.dot this.options single_line matchstart con.start matchend this.match con this.operations con.start this.options previousiseol matchstart con.start matchstart limit matchstart ch target charat matchstart iseolchar ch previousiseol previousiseol matchend this.match con this.operations matchstart this.options previousiseol this.firstchar rangetoken range this.firstchar matchstart con.start matchstart limit matchstart ch target charat matchstart reutil.ishighsurrogate ch matchstart con.limit ch reutil.composefromsurrogates ch target.charat matchstart range.match ch matchend this.match con this.operations matchstart this.options matchstart con.start matchstart limit matchstart matchend this.match con this.operations matchstart this.options matchend con.match con.match.setbeginning matchstart con.match.setend matchend con.setinuse con.setinuse match con op op offset dx opts expressiontarget target con.target opstack intstack datastack intstack issetignorecase opts ignore_case retvalue returned op offset con.limit offset con.start op retvalue opts xmlschema_mode offset con.limit offset retvalue returned retvalue op.type op.char o1 dx offset offset o1 con.limit o1 matchchar op.getdata target.charat o1 issetignorecase returned offset dx op op.next op.dot o1 dx offset offset o1 con.limit o1 returned opts single_line reutil.ishighsurrogate target.charat o1 o1 dx o1 dx con.limit o1 dx ch target.charat o1 reutil.ishighsurrogate ch o1 dx o1 dx con.limit o1 dx ch reutil.composefromsurrogates ch target.charat o1 iseolchar ch returned offset dx o1 o1 op op.next op.range op.nrange o1 dx offset offset o1 con.limit o1 returned ch target.charat offset reutil.ishighsurrogate ch o1 dx con.limit o1 dx o1 dx ch reutil.composefromsurrogates ch target.charat o1 rangetoken tok op.gettoken tok.match ch returned offset dx o1 o1 op op.next op.anchor matchanchor target op con offset opts returned op op.next op.backreference refno op.getdata refno refno this.nofparen refno con.match.getbeginning refno con.match.getend refno returned o2 con.match.getbeginning refno literallen con.match.getend refno o2 dx target.regionmatches issetignorecase offset con.limit o2 literallen returned offset literallen target.regionmatches issetignorecase offset-literallen con.limit o2 literallen returned offset literallen op op.next op.string literal op.getstring literallen literal.length dx target.regionmatches issetignorecase offset con.limit literal literallen returned offset literallen target.regionmatches issetignorecase offset-literallen con.limit literal literallen returned offset literallen op op.next op.closure id op.getdata previousoffset con.offsets id previousoffset offset returned con.offsets id offset offset previousoffset op op.next op.question opstack.push op datastack.push offset op op.getchild op.nongreedyclosure op.nongreedyquestion opstack.push op datastack.push offset op op.next op.union op.size returned opstack.push op datastack.push datastack.push offset op op.elementat op.capture refno op.getdata con.match refno datastack.push con.match.getbeginning refno con.match.setbeginning refno offset index refno datastack.push con.match.getend index con.match.setend index offset opstack.push op datastack.push offset op op.next op.lookahead op.negativelookahead op.lookbehind op.negativelookbehind opstack.push op datastack.push dx datastack.push offset dx op.type op.lookahead op.type op.negativelookahead op op.getchild op.independent opstack.push op datastack.push offset op op.getchild op.modifier localopts opts localopts op.getdata localopts op.getdata2 opstack.push op datastack.push opts datastack.push offset opts localopts op op.getchild op.condition op.conditionop cop op.conditionop op cop.refnumber cop.refnumber this.nofparen cop.refnumber con.match.getbeginning cop.refnumber con.match.getend cop.refnumber op cop.yes cop.no op cop.no op cop.next opstack.push op datastack.push offset op cop.condition op.type returned opstack.isempty retvalue op op opstack.pop offset datastack.pop op.type op.closure con.offsets op.getdata offset op.question retvalue op op.next returned op.nongreedyclosure op.nongreedyquestion retvalue op op.getchild returned op.union unionindex datastack.pop debug system.err.println unionindex retvalue retvalue unionindex op.size opstack.push op datastack.push unionindex datastack.push offset op op.elementat unionindex returned retvalue op.capture refno op.getdata saved datastack.pop retvalue refno con.match.setbeginning refno saved con.match.setend refno saved op.lookahead op.lookbehind dx datastack.pop retvalue op op.next returned retvalue op.negativelookahead op.negativelookbehind dx datastack.pop retvalue op op.next returned retvalue op.modifier opts datastack.pop op.independent retvalue offset retvalue op op.next returned op.condition op.conditionop cop op.conditionop op retvalue op cop.yes cop.no op cop.no op cop.next returned matchchar ch ignorecase ignorecase matchignorecase ch ch matchanchor expressiontarget target op op con offset opts op.getdata opts multiple_lines offset con.start offset con.start offset con.limit iseolchar target.charat offset-1 offset con.start offset con.start offset con.start iseolchar target.charat offset-1 opts multiple_lines offset con.limit offset con.limit iseolchar target.charat offset offset con.limit offset con.limit iseolchar target.charat offset offset con.limit target.charat offset carriage_return target.charat offset line_feed offset con.start offset con.limit offset con.limit iseolchar target.charat offset offset con.limit target.charat offset carriage_return target.charat offset line_feed offset con.limit con.length getwordtype target con.start con.limit offset opts wt_ignore getpreviouswordtype target con.start con.limit offset opts con.length getwordtype target con.start con.limit offset opts wt_ignore getpreviouswordtype target con.start con.limit offset opts con.length offset con.limit getwordtype target con.start con.limit offset opts wt_letter getpreviouswordtype target con.start con.limit offset opts wt_other con.length offset con.start getwordtype target con.start con.limit offset opts wt_other getpreviouswordtype target con.start con.limit offset opts wt_letter getpreviouswordtype expressiontarget target begin offset opts ret getwordtype target begin offset opts ret wt_ignore ret getwordtype target begin offset opts ret getwordtype expressiontarget target begin offset opts offset begin offset wt_other getwordtype0 target.charat offset opts matches target this.matches target match matches target match match start target.getbeginindex target.getendindex this.operations this.prepare this.context this.context con this.context con this.context.inuse this.context con.reset target start this.numberofclosures match match.setnumberofgroups this.nofparen match.setsource target this.hasbackreferences match match match.setnumberofgroups this.nofparen con.match match regularexpression.isset this.options xmlschema_mode matchend this.match con this.operations con.start this.options matchend con.limit con.match con.match.setbeginning con.start con.match.setend matchend con.setinuse this.fixedstringonly this.fixedstringtable.matches target con.start con.limit con.match con.match.setbeginning con.match.setend this.fixedstring.length con.setinuse con.setinuse this.fixedstring this.fixedstringtable.matches target con.start con.limit con.setinuse limit con.limit-this.minlength matchstart matchend this.operations this.operations.type op.closure this.operations.getchild type op.dot this.options single_line matchstart con.start matchend this.match con this.operations con.start this.options previousiseol matchstart con.start matchstart limit matchstart ch target setindex matchstart iseolchar ch previousiseol previousiseol matchend this.match con this.operations matchstart this.options previousiseol this.firstchar rangetoken range this.firstchar matchstart con.start matchstart limit matchstart ch target setindex matchstart reutil.ishighsurrogate ch matchstart con.limit ch reutil.composefromsurrogates ch target.setindex matchstart range.match ch matchend this.match con this.operations matchstart this.options matchstart con.start matchstart limit matchstart matchend match con this.operations matchstart this.options matchend con.match con.match.setbeginning matchstart con.match.setend matchend con.setinuse con.setinuse regex options nofparen token tokentree hasbackreferences minlength op operations numberofclosures context rangetoken firstchar fixedstring fixedstringoptions bmpattern fixedstringtable fixedstringonly expressiontarget charat index regionmatches ignorecase offset limit partlen regionmatches ignorecase offset limit offset2 partlen stringtarget expressiontarget target stringtarget target this.target target resettarget target this.target target charat index target.charat index regionmatches ignorecase offset limit partlen limit-offset partlen ignorecase target.regionmatches offset partlen target.regionmatches offset partlen regionmatches ignorecase offset limit offset2 partlen limit-offset partlen ignorecase target.regionmatches offset target offset2 partlen target.regionmatches offset target offset2 partlen chararraytarget expressiontarget target chararraytarget target this.target target resettarget target this.target target charat index target index regionmatches ignorecase offset limit partlen offset limit-offset partlen ignorecase regionmatchesignorecase offset limit partlen regionmatches offset limit partlen regionmatches offset limit partlen partlen-- target offset part.charat regionmatchesignorecase offset limit partlen partlen-- ch1 target offset ch2 part.charat ch1 ch2 uch1 character.touppercase ch1 uch2 character.touppercase ch2 uch1 uch2 character.tolowercase uch1 character.tolowercase uch2 regionmatches ignorecase offset limit offset2 partlen offset limit-offset partlen ignorecase regionmatchesignorecase offset limit offset2 partlen regionmatches offset limit offset2 partlen regionmatches offset limit offset2 partlen offset2 partlen-- target offset target regionmatchesignorecase offset limit offset2 partlen offset2 partlen-- ch1 target offset ch2 target ch1 ch2 uch1 character.touppercase ch1 uch2 character.touppercase ch2 uch1 uch2 character.tolowercase uch1 character.tolowercase uch2 characteriteratortarget expressiontarget target characteriteratortarget target this.target target resettarget target this.target target charat index target.setindex index regionmatches ignorecase offset limit partlen offset limit-offset partlen ignorecase regionmatchesignorecase offset limit partlen regionmatches offset limit partlen regionmatches offset limit partlen partlen-- target.setindex offset part.charat regionmatchesignorecase offset limit partlen partlen-- ch1 target.setindex offset ch2 part.charat ch1 ch2 uch1 character.touppercase ch1 uch2 character.touppercase ch2 uch1 uch2 character.tolowercase uch1 character.tolowercase uch2 regionmatches ignorecase offset limit offset2 partlen offset limit-offset partlen ignorecase regionmatchesignorecase offset limit offset2 partlen regionmatches offset limit offset2 partlen regionmatches offset limit offset2 partlen offset2 partlen-- target.setindex offset target.setindex regionmatchesignorecase offset limit offset2 partlen offset2 partlen-- ch1 target.setindex offset ch2 target.setindex ch1 ch2 uch1 character.touppercase ch1 uch2 character.touppercase ch2 uch1 uch2 character.tolowercase uch1 character.tolowercase uch2 start limit length match match inuse offsets stringtarget stringtarget chararraytarget chararraytarget characteriteratortarget characteriteratortarget expressiontarget target resetcommon nofclosures this.length this.limit-this.start setinuse this.match this.offsets this.offsets.length nofclosures this.offsets nofclosures nofclosures this.offsets reset target start limit nofclosures characteriteratortarget characteriteratortarget characteriteratortarget target characteriteratortarget.resettarget target this.target characteriteratortarget this.start start this.limit limit this.resetcommon nofclosures reset target start limit nofclosures stringtarget stringtarget stringtarget target stringtarget.resettarget target this.target stringtarget this.start start this.limit limit this.resetcommon nofclosures reset target start limit nofclosures chararraytarget chararraytarget chararraytarget target chararraytarget.resettarget target this.target chararraytarget this.start start this.limit limit this.resetcommon nofclosures setinuse inuse this.inuse inuse prepare op.count op.nofinstances this.compile this.tokentree op.count system.err.println op.nofinstances this.minlength this.tokentree.getminlength this.firstchar this.options prohibit_head_character_optimization this.options xmlschema_mode rangetoken firstchar token.createrange fresult this.tokentree.analyzefirstcharacter firstchar this.options fresult token.fc_terminal firstchar.compactranges this.firstchar firstchar debug system.err.println firstchar this.operations this.operations.type op.string this.operations.type op.char this.operations.next debug system.err.print this.fixedstringonly this.operations.type op.string this.fixedstring this.operations.getstring this.operations.getdata this.fixedstring reutil.decomposetosurrogates this.operations.getdata ac ac this.operations.getdata this.fixedstring ac this.fixedstringoptions this.options this.fixedstringtable bmpattern this.fixedstring this.fixedstringoptions ignore_case this.options prohibit_fixed_string_optimization this.options xmlschema_mode token.fixedstringcontainer container token.fixedstringcontainer this.tokentree.findfixedstring container this.options this.fixedstring container.token container.token.getstring this.fixedstringoptions container.options this.fixedstring this.fixedstring.length this.fixedstring this.fixedstring this.fixedstringtable bmpattern this.fixedstring this.fixedstringoptions ignore_case debug system.err.println this.fixedstring.length reutil.createoptionstring this.fixedstringoptions system.err.print reutil.dumpstring this.fixedstring ignore_case single_line multiple_lines extended_comment use_unicode_category unicode_word_boundary prohibit_head_character_optimization prohibit_fixed_string_optimization xmlschema_mode special_comma options flag options flag flag regularexpression regex parseexception regex regularexpression regex options parseexception this.setpattern regex options regularexpression regex options locale parseexception this.setpattern regex options locale regularexpression regex token tok parens hasbackreferences options this.regex regex this.tokentree tok this.nofparen parens this.options options this.hasbackreferences hasbackreferences setpattern newpattern parseexception this.setpattern newpattern locale.getdefault setpattern newpattern locale parseexception this.setpattern newpattern this.options locale setpattern newpattern options locale parseexception this.regex newpattern this.options options regexparser rp regularexpression.isset this.options regularexpression.xmlschema_mode parserforxmlschema locale regexparser locale this.tokentree rp.parse this.regex this.options this.nofparen rp.parennumber this.hasbackreferences rp.hasbackreferences this.operations this.context setpattern newpattern options parseexception this.setpattern newpattern options locale.getdefault setpattern newpattern options locale parseexception this.setpattern newpattern reutil.parseoptions options locale getpattern this.regex this.tokentree.tostring this.options getoptions reutil.createoptionstring this.options obj obj obj regularexpression regularexpression regularexpression obj this.regex.equals r.regex this.options r.options pattern options this.regex.equals pattern this.options options hashcode this.regex this.getoptions hashcode getnumberofgroups this.nofparen wt_ignore wt_letter wt_other getwordtype0 ch opts opts unicode_word_boundary opts use_unicode_category token.getrange match ch wt_letter wt_other iswordchar ch wt_letter wt_other character.gettype ch character.uppercase_letter character.lowercase_letter character.titlecase_letter character.modifier_letter character.other_letter character.letter_number character.decimal_digit_number character.other_number character.combining_spacing_mark wt_letter character.format character.non_spacing_mark character.enclosing_mark wt_ignore character.control ch wt_other wt_ignore wt_other line_feed carriage_return line_separator paragraph_separator iseolchar ch ch line_feed ch carriage_return ch line_separator ch paragraph_separator iswordchar ch ch ch ch ch ch ch ch matchignorecase chardata ch chardata ch chardata ch uch1 character.touppercase chardata uch2 character.touppercase ch uch1 uch2 character.tolowercase uch1 character.tolowercase uch2 