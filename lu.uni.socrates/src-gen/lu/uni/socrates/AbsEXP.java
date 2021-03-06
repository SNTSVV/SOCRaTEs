/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs EXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.AbsEXP#getExp1 <em>Exp1</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getAbsEXP()
 * @model
 * @generated
 */
public interface AbsEXP extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' containment reference.
   * @see #setExp1(expression)
   * @see lu.uni.socrates.SocratesPackage#getAbsEXP_Exp1()
   * @model containment="true"
   * @generated
   */
  expression getExp1();

  /**
   * Sets the value of the '{@link lu.uni.socrates.AbsEXP#getExp1 <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' containment reference.
   * @see #getExp1()
   * @generated
   */
  void setExp1(expression value);

} // AbsEXP
