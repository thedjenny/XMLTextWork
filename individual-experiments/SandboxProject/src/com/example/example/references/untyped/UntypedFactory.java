/**
 */
package com.example.example.references.untyped;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.example.references.untyped.UntypedPackage
 * @generated
 */
public interface UntypedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UntypedFactory eINSTANCE = com.example.example.references.untyped.impl.UntypedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Order Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Detail1</em>'.
	 * @generated
	 */
	OrderDetail1 createOrderDetail1();

	/**
	 * Returns a new object of class '<em>Order Detail2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Detail2</em>'.
	 * @generated
	 */
	OrderDetail2 createOrderDetail2();

	/**
	 * Returns a new object of class '<em>Order Ref1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Ref1</em>'.
	 * @generated
	 */
	OrderRef1 createOrderRef1();

	/**
	 * Returns a new object of class '<em>Order Ref2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Ref2</em>'.
	 * @generated
	 */
	OrderRef2 createOrderRef2();

	/**
	 * Returns a new object of class '<em>Orders Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orders Type</em>'.
	 * @generated
	 */
	OrdersType createOrdersType();

	/**
	 * Returns a new object of class '<em>Common Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Identifier Type</em>'.
	 * @generated
	 */
	CommonIdentifierType createCommonIdentifierType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UntypedPackage getUntypedPackage();

} //UntypedFactory
