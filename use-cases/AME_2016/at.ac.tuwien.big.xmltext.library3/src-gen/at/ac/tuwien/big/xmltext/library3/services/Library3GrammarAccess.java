/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.library3.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class Library3GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class LibraryTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LibraryType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLibraryTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLibraryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cBookAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cBookBookTypeParserRuleCall_3_0_0 = (RuleCall)cBookAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cBookAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cBookBookTypeParserRuleCall_3_1_1_0 = (RuleCall)cBookAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cCustomerAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cCustomerCustomerTypeParserRuleCall_4_0_0 = (RuleCall)cCustomerAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cCustomerAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cCustomerCustomerTypeParserRuleCall_4_1_1_0 = (RuleCall)cCustomerAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//LibraryType:
		//	{LibraryType} "Library" "{" (book+=BookType ("," book+=BookType)*)? (customer+=CustomerType (","
		//	customer+=CustomerType)*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{LibraryType} "Library" "{" (book+=BookType ("," book+=BookType)*)? (customer+=CustomerType (","
		//customer+=CustomerType)*)? "}"
		public Group getGroup() { return cGroup; }

		//{LibraryType}
		public Action getLibraryTypeAction_0() { return cLibraryTypeAction_0; }

		//"Library"
		public Keyword getLibraryKeyword_1() { return cLibraryKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(book+=BookType ("," book+=BookType)*)?
		public Group getGroup_3() { return cGroup_3; }

		//book+=BookType
		public Assignment getBookAssignment_3_0() { return cBookAssignment_3_0; }

		//BookType
		public RuleCall getBookBookTypeParserRuleCall_3_0_0() { return cBookBookTypeParserRuleCall_3_0_0; }

		//("," book+=BookType)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//book+=BookType
		public Assignment getBookAssignment_3_1_1() { return cBookAssignment_3_1_1; }

		//BookType
		public RuleCall getBookBookTypeParserRuleCall_3_1_1_0() { return cBookBookTypeParserRuleCall_3_1_1_0; }

		//(customer+=CustomerType ("," customer+=CustomerType)*)?
		public Group getGroup_4() { return cGroup_4; }

		//customer+=CustomerType
		public Assignment getCustomerAssignment_4_0() { return cCustomerAssignment_4_0; }

		//CustomerType
		public RuleCall getCustomerCustomerTypeParserRuleCall_4_0_0() { return cCustomerCustomerTypeParserRuleCall_4_0_0; }

		//("," customer+=CustomerType)*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//customer+=CustomerType
		public Assignment getCustomerAssignment_4_1_1() { return cCustomerAssignment_4_1_1; }

		//CustomerType
		public RuleCall getCustomerCustomerTypeParserRuleCall_4_1_1_0() { return cCustomerCustomerTypeParserRuleCall_4_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class AnyGenericConstructElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnyGenericConstruct");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAnyGenericElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAnyGenericTextParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AnyGenericConstruct:
		//	AnyGenericElement | AnyGenericText;
		@Override public ParserRule getRule() { return rule; }

		//AnyGenericElement | AnyGenericText
		public Alternatives getAlternatives() { return cAlternatives; }

		//AnyGenericElement
		public RuleCall getAnyGenericElementParserRuleCall_0() { return cAnyGenericElementParserRuleCall_0; }

		//AnyGenericText
		public RuleCall getAnyGenericTextParserRuleCall_1() { return cAnyGenericTextParserRuleCall_1; }
	}

	public class BookTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BookType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBookKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameID0ParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cAuthorKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAuthorAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAuthorNameTypeParserRuleCall_6_0 = (RuleCall)cAuthorAssignment_6.eContents().get(0);
		private final Keyword cPagesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPagesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPagesInt0ParserRuleCall_8_0 = (RuleCall)cPagesAssignment_8.eContents().get(0);
		private final Keyword cIsbnKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cIsbnAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cIsbnIsbnTypeParserRuleCall_10_0 = (RuleCall)cIsbnAssignment_10.eContents().get(0);
		private final Assignment cBookInfoAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cBookInfoBookInfoTypeParserRuleCall_11_0 = (RuleCall)cBookInfoAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//BookType:
		//	"Book" name=ID0 "{" "title" title=STRING "author" author=NameType "pages" pages=Int0 "isbn" isbn=IsbnType
		//	bookInfo=BookInfoType? "}";
		@Override public ParserRule getRule() { return rule; }

		//"Book" name=ID0 "{" "title" title=STRING "author" author=NameType "pages" pages=Int0 "isbn" isbn=IsbnType
		//bookInfo=BookInfoType? "}"
		public Group getGroup() { return cGroup; }

		//"Book"
		public Keyword getBookKeyword_0() { return cBookKeyword_0; }

		//name=ID0
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID0
		public RuleCall getNameID0ParserRuleCall_1_0() { return cNameID0ParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"title"
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }

		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }

		//"author"
		public Keyword getAuthorKeyword_5() { return cAuthorKeyword_5; }

		//author=NameType
		public Assignment getAuthorAssignment_6() { return cAuthorAssignment_6; }

		//NameType
		public RuleCall getAuthorNameTypeParserRuleCall_6_0() { return cAuthorNameTypeParserRuleCall_6_0; }

		//"pages"
		public Keyword getPagesKeyword_7() { return cPagesKeyword_7; }

		//pages=Int0
		public Assignment getPagesAssignment_8() { return cPagesAssignment_8; }

		//Int0
		public RuleCall getPagesInt0ParserRuleCall_8_0() { return cPagesInt0ParserRuleCall_8_0; }

		//"isbn"
		public Keyword getIsbnKeyword_9() { return cIsbnKeyword_9; }

		//isbn=IsbnType
		public Assignment getIsbnAssignment_10() { return cIsbnAssignment_10; }

		//IsbnType
		public RuleCall getIsbnIsbnTypeParserRuleCall_10_0() { return cIsbnIsbnTypeParserRuleCall_10_0; }

		//bookInfo=BookInfoType?
		public Assignment getBookInfoAssignment_11() { return cBookInfoAssignment_11; }

		//BookInfoType
		public RuleCall getBookInfoBookInfoTypeParserRuleCall_11_0() { return cBookInfoBookInfoTypeParserRuleCall_11_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}

	public class CustomerTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CustomerType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFirstNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFirstNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFirstNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cFirstNameAssignment_3.eContents().get(0);
		private final Keyword cLastNameKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLastNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLastNameSTRINGTerminalRuleCall_5_0 = (RuleCall)cLastNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cBorrowedBookIdKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cBorrowedBookIdAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cBorrowedBookIdEObjectCrossReference_6_1_0 = (CrossReference)cBorrowedBookIdAssignment_6_1.eContents().get(0);
		private final RuleCall cBorrowedBookIdEObjectIDREFParserRuleCall_6_1_0_1 = (RuleCall)cBorrowedBookIdEObjectCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//CustomerType:
		//	"Customer" "{" "firstName" firstName=STRING "lastName" lastName=STRING ("borrowedBookId"
		//	borrowedBookId=[ecore::EObject|IDREF])? "}";
		@Override public ParserRule getRule() { return rule; }

		//"Customer" "{" "firstName" firstName=STRING "lastName" lastName=STRING ("borrowedBookId"
		//borrowedBookId=[ecore::EObject|IDREF])? "}"
		public Group getGroup() { return cGroup; }

		//"Customer"
		public Keyword getCustomerKeyword_0() { return cCustomerKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"firstName"
		public Keyword getFirstNameKeyword_2() { return cFirstNameKeyword_2; }

		//firstName=STRING
		public Assignment getFirstNameAssignment_3() { return cFirstNameAssignment_3; }

		//STRING
		public RuleCall getFirstNameSTRINGTerminalRuleCall_3_0() { return cFirstNameSTRINGTerminalRuleCall_3_0; }

		//"lastName"
		public Keyword getLastNameKeyword_4() { return cLastNameKeyword_4; }

		//lastName=STRING
		public Assignment getLastNameAssignment_5() { return cLastNameAssignment_5; }

		//STRING
		public RuleCall getLastNameSTRINGTerminalRuleCall_5_0() { return cLastNameSTRINGTerminalRuleCall_5_0; }

		//("borrowedBookId" borrowedBookId=[ecore::EObject|IDREF])?
		public Group getGroup_6() { return cGroup_6; }

		//"borrowedBookId"
		public Keyword getBorrowedBookIdKeyword_6_0() { return cBorrowedBookIdKeyword_6_0; }

		//borrowedBookId=[ecore::EObject|IDREF]
		public Assignment getBorrowedBookIdAssignment_6_1() { return cBorrowedBookIdAssignment_6_1; }

		//[ecore::EObject|IDREF]
		public CrossReference getBorrowedBookIdEObjectCrossReference_6_1_0() { return cBorrowedBookIdEObjectCrossReference_6_1_0; }

		//IDREF
		public RuleCall getBorrowedBookIdEObjectIDREFParserRuleCall_6_1_0_1() { return cBorrowedBookIdEObjectIDREFParserRuleCall_6_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ID0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ID0");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ID0 returns type::ID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class NameTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameType");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NameType:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class Int0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Int0");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Int0 returns type::Int:
		//	INT;
		@Override public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}

	public class IsbnTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IsbnType");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IsbnType:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class BookInfoTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BookInfoType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBookInfoTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBookInfoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cAnyAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cAnyAnyGenericElementParserRuleCall_2_0_0 = (RuleCall)cAnyAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cAnyAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cAnyAnyGenericElementParserRuleCall_2_1_1_0 = (RuleCall)cAnyAssignment_2_1_1.eContents().get(0);
		
		//BookInfoType:
		//	{BookInfoType} "BookInfo" (any+=AnyGenericElement ("," any+=AnyGenericElement)*)?;
		@Override public ParserRule getRule() { return rule; }

		//{BookInfoType} "BookInfo" (any+=AnyGenericElement ("," any+=AnyGenericElement)*)?
		public Group getGroup() { return cGroup; }

		//{BookInfoType}
		public Action getBookInfoTypeAction_0() { return cBookInfoTypeAction_0; }

		//"BookInfo"
		public Keyword getBookInfoKeyword_1() { return cBookInfoKeyword_1; }

		//(any+=AnyGenericElement ("," any+=AnyGenericElement)*)?
		public Group getGroup_2() { return cGroup_2; }

		//any+=AnyGenericElement
		public Assignment getAnyAssignment_2_0() { return cAnyAssignment_2_0; }

		//AnyGenericElement
		public RuleCall getAnyAnyGenericElementParserRuleCall_2_0_0() { return cAnyAnyGenericElementParserRuleCall_2_0_0; }

		//("," any+=AnyGenericElement)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//any+=AnyGenericElement
		public Assignment getAnyAssignment_2_1_1() { return cAnyAssignment_2_1_1; }

		//AnyGenericElement
		public RuleCall getAnyAnyGenericElementParserRuleCall_2_1_1_0() { return cAnyAnyGenericElementParserRuleCall_2_1_1_0; }
	}

	public class AnyGenericElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnyGenericElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnyGenericElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElemNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElemNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cElemNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElemValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElemValueSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cElemValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cAnyGenericAttrAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0 = (RuleCall)cAnyGenericAttrAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cAnyGenericAttrAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0 = (RuleCall)cAnyGenericAttrAssignment_4_1_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cAnyGenericElementAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cAnyGenericElementAnyGenericElementParserRuleCall_5_0_0 = (RuleCall)cAnyGenericElementAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cAnyGenericElementAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0 = (RuleCall)cAnyGenericElementAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//AnyGenericElement:
		//	{AnyGenericElement} "{" elemName=STRING? (":" elemValue=STRING)? (anyGenericAttr+=AnyGenericAttribute (","
		//	anyGenericAttr+=AnyGenericAttribute)*)? (anyGenericElement+=AnyGenericElement (","
		//	anyGenericElement+=AnyGenericElement)*)? "}";
		@Override public ParserRule getRule() { return rule; }

		//{AnyGenericElement} "{" elemName=STRING? (":" elemValue=STRING)? (anyGenericAttr+=AnyGenericAttribute (","
		//anyGenericAttr+=AnyGenericAttribute)*)? (anyGenericElement+=AnyGenericElement (","
		//anyGenericElement+=AnyGenericElement)*)? "}"
		public Group getGroup() { return cGroup; }

		//{AnyGenericElement}
		public Action getAnyGenericElementAction_0() { return cAnyGenericElementAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//elemName=STRING?
		public Assignment getElemNameAssignment_2() { return cElemNameAssignment_2; }

		//STRING
		public RuleCall getElemNameSTRINGTerminalRuleCall_2_0() { return cElemNameSTRINGTerminalRuleCall_2_0; }

		//(":" elemValue=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//elemValue=STRING
		public Assignment getElemValueAssignment_3_1() { return cElemValueAssignment_3_1; }

		//STRING
		public RuleCall getElemValueSTRINGTerminalRuleCall_3_1_0() { return cElemValueSTRINGTerminalRuleCall_3_1_0; }

		//(anyGenericAttr+=AnyGenericAttribute ("," anyGenericAttr+=AnyGenericAttribute)*)?
		public Group getGroup_4() { return cGroup_4; }

		//anyGenericAttr+=AnyGenericAttribute
		public Assignment getAnyGenericAttrAssignment_4_0() { return cAnyGenericAttrAssignment_4_0; }

		//AnyGenericAttribute
		public RuleCall getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0() { return cAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0; }

		//("," anyGenericAttr+=AnyGenericAttribute)*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//anyGenericAttr+=AnyGenericAttribute
		public Assignment getAnyGenericAttrAssignment_4_1_1() { return cAnyGenericAttrAssignment_4_1_1; }

		//AnyGenericAttribute
		public RuleCall getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0() { return cAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0; }

		//(anyGenericElement+=AnyGenericElement ("," anyGenericElement+=AnyGenericElement)*)?
		public Group getGroup_5() { return cGroup_5; }

		//anyGenericElement+=AnyGenericElement
		public Assignment getAnyGenericElementAssignment_5_0() { return cAnyGenericElementAssignment_5_0; }

		//AnyGenericElement
		public RuleCall getAnyGenericElementAnyGenericElementParserRuleCall_5_0_0() { return cAnyGenericElementAnyGenericElementParserRuleCall_5_0_0; }

		//("," anyGenericElement+=AnyGenericElement)*
		public Group getGroup_5_1() { return cGroup_5_1; }

		//","
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }

		//anyGenericElement+=AnyGenericElement
		public Assignment getAnyGenericElementAssignment_5_1_1() { return cAnyGenericElementAssignment_5_1_1; }

		//AnyGenericElement
		public RuleCall getAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0() { return cAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AnyGenericAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnyGenericAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttrNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAttrNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cAttrNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAttrValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttrValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cAttrValueAssignment_2.eContents().get(0);
		
		//AnyGenericAttribute:
		//	attrName=STRING "=" attrValue=STRING;
		@Override public ParserRule getRule() { return rule; }

		//attrName=STRING "=" attrValue=STRING
		public Group getGroup() { return cGroup; }

		//attrName=STRING
		public Assignment getAttrNameAssignment_0() { return cAttrNameAssignment_0; }

		//STRING
		public RuleCall getAttrNameSTRINGTerminalRuleCall_0_0() { return cAttrNameSTRINGTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//attrValue=STRING
		public Assignment getAttrValueAssignment_2() { return cAttrValueAssignment_2; }

		//STRING
		public RuleCall getAttrValueSTRINGTerminalRuleCall_2_0() { return cAttrValueSTRINGTerminalRuleCall_2_0; }
	}

	public class AnyGenericTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnyGenericText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnyGenericTextAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTextValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextValueAssignment_1.eContents().get(0);
		
		//AnyGenericText:
		//	{AnyGenericText} textValue=STRING?;
		@Override public ParserRule getRule() { return rule; }

		//{AnyGenericText} textValue=STRING?
		public Group getGroup() { return cGroup; }

		//{AnyGenericText}
		public Action getAnyGenericTextAction_0() { return cAnyGenericTextAction_0; }

		//textValue=STRING?
		public Assignment getTextValueAssignment_1() { return cTextValueAssignment_1; }

		//STRING
		public RuleCall getTextValueSTRINGTerminalRuleCall_1_0() { return cTextValueSTRINGTerminalRuleCall_1_0; }
	}

	public class EObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EObject");
		private final Action cEObjectAction = (Action)rule.eContents().get(1);
		
		//EObject returns ecore::EObject:
		//	{ecore::EObject};
		@Override public ParserRule getRule() { return rule; }

		//{ecore::EObject}
		public Action getEObjectAction() { return cEObjectAction; }
	}

	public class IDREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IDREF");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IDREF returns ecore::EString:
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final LibraryTypeElements pLibraryType;
	private final AnyGenericConstructElements pAnyGenericConstruct;
	private final BookTypeElements pBookType;
	private final CustomerTypeElements pCustomerType;
	private final ID0Elements pID0;
	private final NameTypeElements pNameType;
	private final Int0Elements pInt0;
	private final IsbnTypeElements pIsbnType;
	private final BookInfoTypeElements pBookInfoType;
	private final AnyGenericElementElements pAnyGenericElement;
	private final AnyGenericAttributeElements pAnyGenericAttribute;
	private final AnyGenericTextElements pAnyGenericText;
	private final EObjectElements pEObject;
	private final IDREFElements pIDREF;
	private final EStringElements pEString;
	private final TerminalRule tDATETIME;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Library3GrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLibraryType = new LibraryTypeElements();
		this.pAnyGenericConstruct = new AnyGenericConstructElements();
		this.pBookType = new BookTypeElements();
		this.pCustomerType = new CustomerTypeElements();
		this.pID0 = new ID0Elements();
		this.pNameType = new NameTypeElements();
		this.pInt0 = new Int0Elements();
		this.pIsbnType = new IsbnTypeElements();
		this.pBookInfoType = new BookInfoTypeElements();
		this.pAnyGenericElement = new AnyGenericElementElements();
		this.pAnyGenericAttribute = new AnyGenericAttributeElements();
		this.pAnyGenericText = new AnyGenericTextElements();
		this.pEObject = new EObjectElements();
		this.pIDREF = new IDREFElements();
		this.pEString = new EStringElements();
		this.tDATETIME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DATETIME");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.tuwien.big.xmltext.library3.Library3".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//LibraryType:
	//	{LibraryType} "Library" "{" (book+=BookType ("," book+=BookType)*)? (customer+=CustomerType (","
	//	customer+=CustomerType)*)? "}";
	public LibraryTypeElements getLibraryTypeAccess() {
		return pLibraryType;
	}
	
	public ParserRule getLibraryTypeRule() {
		return getLibraryTypeAccess().getRule();
	}

	//AnyGenericConstruct:
	//	AnyGenericElement | AnyGenericText;
	public AnyGenericConstructElements getAnyGenericConstructAccess() {
		return pAnyGenericConstruct;
	}
	
	public ParserRule getAnyGenericConstructRule() {
		return getAnyGenericConstructAccess().getRule();
	}

	//BookType:
	//	"Book" name=ID0 "{" "title" title=STRING "author" author=NameType "pages" pages=Int0 "isbn" isbn=IsbnType
	//	bookInfo=BookInfoType? "}";
	public BookTypeElements getBookTypeAccess() {
		return pBookType;
	}
	
	public ParserRule getBookTypeRule() {
		return getBookTypeAccess().getRule();
	}

	//CustomerType:
	//	"Customer" "{" "firstName" firstName=STRING "lastName" lastName=STRING ("borrowedBookId"
	//	borrowedBookId=[ecore::EObject|IDREF])? "}";
	public CustomerTypeElements getCustomerTypeAccess() {
		return pCustomerType;
	}
	
	public ParserRule getCustomerTypeRule() {
		return getCustomerTypeAccess().getRule();
	}

	//ID0 returns type::ID:
	//	ID;
	public ID0Elements getID0Access() {
		return pID0;
	}
	
	public ParserRule getID0Rule() {
		return getID0Access().getRule();
	}

	//NameType:
	//	STRING;
	public NameTypeElements getNameTypeAccess() {
		return pNameType;
	}
	
	public ParserRule getNameTypeRule() {
		return getNameTypeAccess().getRule();
	}

	//Int0 returns type::Int:
	//	INT;
	public Int0Elements getInt0Access() {
		return pInt0;
	}
	
	public ParserRule getInt0Rule() {
		return getInt0Access().getRule();
	}

	//IsbnType:
	//	STRING;
	public IsbnTypeElements getIsbnTypeAccess() {
		return pIsbnType;
	}
	
	public ParserRule getIsbnTypeRule() {
		return getIsbnTypeAccess().getRule();
	}

	//BookInfoType:
	//	{BookInfoType} "BookInfo" (any+=AnyGenericElement ("," any+=AnyGenericElement)*)?;
	public BookInfoTypeElements getBookInfoTypeAccess() {
		return pBookInfoType;
	}
	
	public ParserRule getBookInfoTypeRule() {
		return getBookInfoTypeAccess().getRule();
	}

	//AnyGenericElement:
	//	{AnyGenericElement} "{" elemName=STRING? (":" elemValue=STRING)? (anyGenericAttr+=AnyGenericAttribute (","
	//	anyGenericAttr+=AnyGenericAttribute)*)? (anyGenericElement+=AnyGenericElement (","
	//	anyGenericElement+=AnyGenericElement)*)? "}";
	public AnyGenericElementElements getAnyGenericElementAccess() {
		return pAnyGenericElement;
	}
	
	public ParserRule getAnyGenericElementRule() {
		return getAnyGenericElementAccess().getRule();
	}

	//AnyGenericAttribute:
	//	attrName=STRING "=" attrValue=STRING;
	public AnyGenericAttributeElements getAnyGenericAttributeAccess() {
		return pAnyGenericAttribute;
	}
	
	public ParserRule getAnyGenericAttributeRule() {
		return getAnyGenericAttributeAccess().getRule();
	}

	//AnyGenericText:
	//	{AnyGenericText} textValue=STRING?;
	public AnyGenericTextElements getAnyGenericTextAccess() {
		return pAnyGenericText;
	}
	
	public ParserRule getAnyGenericTextRule() {
		return getAnyGenericTextAccess().getRule();
	}

	//EObject returns ecore::EObject:
	//	{ecore::EObject};
	public EObjectElements getEObjectAccess() {
		return pEObject;
	}
	
	public ParserRule getEObjectRule() {
		return getEObjectAccess().getRule();
	}

	//IDREF returns ecore::EString:
	//	ID;
	public IDREFElements getIDREFAccess() {
		return pIDREF;
	}
	
	public ParserRule getIDREFRule() {
		return getIDREFAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//terminal DATETIME:
	//	"0".."9" "0".."9" "0".."9" "0".."9" "-" "0".."1" "0".."9" "-" "0".."3" "0".."9" "T" "0".."2" "0".."9" ":" "0".."5"
	//	"0".."9" ":" "0".."5" "0".."9";
	public TerminalRule getDATETIMERule() {
		return tDATETIME;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
