/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.references.unchanged.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.mydsl.references.unchanged.ui.internal.MyDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MyDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MyDslActivator.getInstance().getInjector(MyDslActivator.ORG_XTEXT_EXAMPLE_MYDSL_REFERENCES_UNCHANGED_MYDSL);
	}
	
}
