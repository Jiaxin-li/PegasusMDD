/**
 */
package RootElement.Payment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPayment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Payment.PaymentPackage#getIPayment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPayment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean initiatePayment(int amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void commencePayment();

} // IPayment
