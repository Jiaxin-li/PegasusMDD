/**
 */
package RootElement.CheckIO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.CheckIO.CheckIOPackage
 * @generated
 */
public interface CheckIOFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckIOFactory eINSTANCE = RootElement.CheckIO.impl.CheckIOFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Binder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Binder</em>'.
	 * @generated
	 */
	RoomBinder createRoomBinder();

	/**
	 * Returns a new object of class '<em>Check IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check IO</em>'.
	 * @generated
	 */
	CheckIO createCheckIO();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CheckIOPackage getCheckIOPackage();

} //CheckIOFactory
