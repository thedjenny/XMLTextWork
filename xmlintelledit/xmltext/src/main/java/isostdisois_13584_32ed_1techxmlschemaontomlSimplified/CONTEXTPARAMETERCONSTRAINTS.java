/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTEXTPARAMETERCONSTRAINTS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMETERCONSTRAINTS#getIntegrityConstraints <em>Integrity Constraints</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONTEXTPARAMETERCONSTRAINTS()
 * @model
 * @generated
 */
public interface CONTEXTPARAMETERCONSTRAINTS extends EObject {
	/**
	 * Returns the value of the '<em><b>Integrity Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrity Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Constraints</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONTEXTPARAMETERCONSTRAINTS_IntegrityConstraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<INTEGRITYCONSTRAINT> getIntegrityConstraints();

} // CONTEXTPARAMETERCONSTRAINTS
