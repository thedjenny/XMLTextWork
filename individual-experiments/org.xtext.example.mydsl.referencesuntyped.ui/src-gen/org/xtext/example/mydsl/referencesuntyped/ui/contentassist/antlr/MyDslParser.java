/*
* generated by Xtext
*/
package org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.referencesuntyped.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOrdersTypeAccess().getGroup(), "rule__OrdersType__Group__0");
					put(grammarAccess.getOrdersTypeAccess().getGroup_5(), "rule__OrdersType__Group_5__0");
					put(grammarAccess.getOrdersTypeAccess().getGroup_10(), "rule__OrdersType__Group_10__0");
					put(grammarAccess.getOrdersTypeAccess().getGroup_15(), "rule__OrdersType__Group_15__0");
					put(grammarAccess.getOrdersTypeAccess().getGroup_20(), "rule__OrdersType__Group_20__0");
					put(grammarAccess.getOrderDetail1Access().getGroup(), "rule__OrderDetail1__Group__0");
					put(grammarAccess.getOrderDetail1Access().getGroup_4(), "rule__OrderDetail1__Group_4__0");
					put(grammarAccess.getOrderDetail1Access().getGroup_5(), "rule__OrderDetail1__Group_5__0");
					put(grammarAccess.getOrderDetail1Access().getGroup_6(), "rule__OrderDetail1__Group_6__0");
					put(grammarAccess.getOrderDetail2Access().getGroup(), "rule__OrderDetail2__Group__0");
					put(grammarAccess.getOrderDetail2Access().getGroup_4(), "rule__OrderDetail2__Group_4__0");
					put(grammarAccess.getOrderRef1Access().getGroup(), "rule__OrderRef1__Group__0");
					put(grammarAccess.getOrderRef1Access().getGroup_3(), "rule__OrderRef1__Group_3__0");
					put(grammarAccess.getOrderRef2Access().getGroup(), "rule__OrderRef2__Group__0");
					put(grammarAccess.getOrderRef2Access().getGroup_3(), "rule__OrderRef2__Group_3__0");
					put(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4(), "rule__OrdersType__Order1Assignment_4");
					put(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1(), "rule__OrdersType__Order1Assignment_5_1");
					put(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9(), "rule__OrdersType__Order2Assignment_9");
					put(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1(), "rule__OrdersType__Order2Assignment_10_1");
					put(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14(), "rule__OrdersType__OrderReference1Assignment_14");
					put(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1(), "rule__OrdersType__OrderReference1Assignment_15_1");
					put(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19(), "rule__OrdersType__OrderReference2Assignment_19");
					put(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1(), "rule__OrdersType__OrderReference2Assignment_20_1");
					put(grammarAccess.getOrderDetail1Access().getNameAssignment_2(), "rule__OrderDetail1__NameAssignment_2");
					put(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1(), "rule__OrderDetail1__CustomerAddressAssignment_4_1");
					put(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1(), "rule__OrderDetail1__CustomerContactAssignment_5_1");
					put(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1(), "rule__OrderDetail1__CustomerNameAssignment_6_1");
					put(grammarAccess.getOrderDetail2Access().getNameAssignment_2(), "rule__OrderDetail2__NameAssignment_2");
					put(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1(), "rule__OrderDetail2__CustomerNameAssignment_4_1");
					put(grammarAccess.getOrderRef1Access().getOrderDetail1Assignment_3_1(), "rule__OrderRef1__OrderDetail1Assignment_3_1");
					put(grammarAccess.getOrderRef2Access().getOrderDetail2Assignment_3_1(), "rule__OrderRef2__OrderDetail2Assignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleOrdersType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
