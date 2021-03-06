/*
 * generated by Xtext 2.19.0
 */
package lu.uni.ui;

import com.google.inject.Injector;
import lu.uni.socrates.ui.internal.SocratesActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SocratesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(SocratesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		SocratesActivator activator = SocratesActivator.getInstance();
		return activator != null ? activator.getInjector(SocratesActivator.LU_UNI_SOCRATES) : null;
	}

}
