/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expressionb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.expressionb#getTerm <em>Term</em>}</li>
 *   <li>{@link lu.uni.socrates.expressionb#getExpprime <em>Expprime</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getexpressionb()
 * @model
 * @generated
 */
public interface expressionb extends EObject
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(expressionterm)
   * @see lu.uni.socrates.SocratesPackage#getexpressionb_Term()
   * @model containment="true"
   * @generated
   */
  expressionterm getTerm();

  /**
   * Sets the value of the '{@link lu.uni.socrates.expressionb#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(expressionterm value);

  /**
   * Returns the value of the '<em><b>Expprime</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expprime</em>' containment reference.
   * @see #setExpprime(expressionprime)
   * @see lu.uni.socrates.SocratesPackage#getexpressionb_Expprime()
   * @model containment="true"
   * @generated
   */
  expressionprime getExpprime();

  /**
   * Sets the value of the '{@link lu.uni.socrates.expressionb#getExpprime <em>Expprime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expprime</em>' containment reference.
   * @see #getExpprime()
   * @generated
   */
  void setExpprime(expressionprime value);

} // expressionb
