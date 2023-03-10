/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierCode <em>Qualifier Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierRef <em>Qualifier Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRationalValue <em>Rational Value</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternQualifierRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternQualifierRef='(self.qualifierRef=null) or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface QualifiedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Code</em>' attribute.
	 * @see #setQualifierCode(String)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_QualifierCode()
	 * @model
	 * @generated
	 */
	String getQualifierCode();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierCode <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Code</em>' attribute.
	 * @see #getQualifierCode()
	 * @generated
	 */
	void setQualifierCode(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Ref</em>' attribute.
	 * @see #setQualifierRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_QualifierRef()
	 * @model
	 * @generated
	 */
	String getQualifierRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierRef <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Ref</em>' attribute.
	 * @see #getQualifierRef()
	 * @generated
	 */
	void setQualifierRef(String value);

	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' containment reference.
	 * @see #setRealValue(RealValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_RealValue()
	 * @model containment="true"
	 * @generated
	 */
	RealValue getRealValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRealValue <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Value</em>' containment reference.
	 * @see #getRealValue()
	 * @generated
	 */
	void setRealValue(RealValue value);

	/**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference.
	 * @see #setComplexValue(ComplexValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_ComplexValue()
	 * @model containment="true"
	 * @generated
	 */
	ComplexValue getComplexValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getComplexValue <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Value</em>' containment reference.
	 * @see #getComplexValue()
	 * @generated
	 */
	void setComplexValue(ComplexValue value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' containment reference.
	 * @see #setIntegerValue(IntegerValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_IntegerValue()
	 * @model containment="true"
	 * @generated
	 */
	IntegerValue getIntegerValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getIntegerValue <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' containment reference.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(IntegerValue value);

	/**
	 * Returns the value of the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Value</em>' containment reference.
	 * @see #setRationalValue(RationalValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getQualifiedValue_RationalValue()
	 * @model containment="true"
	 * @generated
	 */
	RationalValue getRationalValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRationalValue <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Value</em>' containment reference.
	 * @see #getRationalValue()
	 * @generated
	 */
	void setRationalValue(RationalValue value);

} // QualifiedValue
