/*
 * generated by Xtext
 */
package at.ac.tuwien.big.amltext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.ac.tuwien.big.amltext.ui.internal.AMLTextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AMLTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AMLTextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AMLTextActivator.getInstance().getInjector(AMLTextActivator.AT_AC_TUWIEN_BIG_AMLTEXT_AMLTEXT);
	}
	
}