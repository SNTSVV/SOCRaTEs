/*
 * generated by Xtext 2.17.0.M1
 */
package lu.uni.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSocratesValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(lu.uni.socrates.SocratesPackage.eINSTANCE);
		return result;
	}
}