/**
 */
package RootElement.CheckIO.impl;

import RootElement.CheckIO.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckIOFactoryImpl extends EFactoryImpl implements CheckIOFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CheckIOFactory init() {
		try {
			CheckIOFactory theCheckIOFactory = (CheckIOFactory)EPackage.Registry.INSTANCE.getEFactory(CheckIOPackage.eNS_URI);
			if (theCheckIOFactory != null) {
				return theCheckIOFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CheckIOFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIOFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CheckIOPackage.ROOM_BINDER: return createRoomBinder();
			case CheckIOPackage.CHECK_IO: return createCheckIO();
			case CheckIOPackage.INVOICE: return createInvoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBinder createRoomBinder() {
		RoomBinderImpl roomBinder = new RoomBinderImpl();
		return roomBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIO createCheckIO() {
		CheckIOImpl checkIO = new CheckIOImpl();
		return checkIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIOPackage getCheckIOPackage() {
		return (CheckIOPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CheckIOPackage getPackage() {
		return CheckIOPackage.eINSTANCE;
	}

} //CheckIOFactoryImpl
