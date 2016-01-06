/**
 */
package RootElement.Payment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.Payment.PaymentFactory
 * @model kind="package"
 * @generated
 */
public interface PaymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Payment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Payment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Payment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentPackage eINSTANCE = RootElement.Payment.impl.PaymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Payment.IPayment <em>IPayment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Payment.IPayment
	 * @see RootElement.Payment.impl.PaymentPackageImpl#getIPayment()
	 * @generated
	 */
	int IPAYMENT = 0;

	/**
	 * The number of structural features of the '<em>IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Initiate Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAYMENT___INITIATE_PAYMENT__INT = 0;

	/**
	 * The operation id for the '<em>Commence Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAYMENT___COMMENCE_PAYMENT = 1;

	/**
	 * The number of operations of the '<em>IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAYMENT_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link RootElement.Payment.IPayment <em>IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPayment</em>'.
	 * @see RootElement.Payment.IPayment
	 * @generated
	 */
	EClass getIPayment();

	/**
	 * Returns the meta object for the '{@link RootElement.Payment.IPayment#initiatePayment(int) <em>Initiate Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Payment</em>' operation.
	 * @see RootElement.Payment.IPayment#initiatePayment(int)
	 * @generated
	 */
	EOperation getIPayment__InitiatePayment__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Payment.IPayment#commencePayment() <em>Commence Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commence Payment</em>' operation.
	 * @see RootElement.Payment.IPayment#commencePayment()
	 * @generated
	 */
	EOperation getIPayment__CommencePayment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentFactory getPaymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.Payment.IPayment <em>IPayment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Payment.IPayment
		 * @see RootElement.Payment.impl.PaymentPackageImpl#getIPayment()
		 * @generated
		 */
		EClass IPAYMENT = eINSTANCE.getIPayment();

		/**
		 * The meta object literal for the '<em><b>Initiate Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPAYMENT___INITIATE_PAYMENT__INT = eINSTANCE.getIPayment__InitiatePayment__int();

		/**
		 * The meta object literal for the '<em><b>Commence Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPAYMENT___COMMENCE_PAYMENT = eINSTANCE.getIPayment__CommencePayment();

	}

} //PaymentPackage
