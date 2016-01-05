/**
 */
package RootElement.Service.impl;

import RootElement.Service.ServicePackage;
import RootElement.Service.ServiceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.impl.ServiceTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceTypeImpl#getServiceTypeName <em>Service Type Name</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceTypeImpl#getServiceTypeID <em>Service Type ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeImpl extends MinimalEObjectImpl.Container implements ServiceType {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTypeName() <em>Service Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceTypeName() <em>Service Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String serviceTypeName = SERVICE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTypeID() <em>Service Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_TYPE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceTypeID() <em>Service Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeID()
	 * @generated
	 * @ordered
	 */
	protected int serviceTypeID = SERVICE_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceTypeName() {
		return serviceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTypeName(String newServiceTypeName) {
		String oldServiceTypeName = serviceTypeName;
		serviceTypeName = newServiceTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_TYPE__SERVICE_TYPE_NAME, oldServiceTypeName, serviceTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceTypeID() {
		return serviceTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTypeID(int newServiceTypeID) {
		int oldServiceTypeID = serviceTypeID;
		serviceTypeID = newServiceTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_TYPE__SERVICE_TYPE_ID, oldServiceTypeID, serviceTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE__PRICE:
				return getPrice();
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_NAME:
				return getServiceTypeName();
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_ID:
				return getServiceTypeID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE__PRICE:
				setPrice((Integer)newValue);
				return;
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_NAME:
				setServiceTypeName((String)newValue);
				return;
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_ID:
				setServiceTypeID((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_NAME:
				setServiceTypeName(SERVICE_TYPE_NAME_EDEFAULT);
				return;
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_ID:
				setServiceTypeID(SERVICE_TYPE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_NAME:
				return SERVICE_TYPE_NAME_EDEFAULT == null ? serviceTypeName != null : !SERVICE_TYPE_NAME_EDEFAULT.equals(serviceTypeName);
			case ServicePackage.SERVICE_TYPE__SERVICE_TYPE_ID:
				return serviceTypeID != SERVICE_TYPE_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (price: ");
		result.append(price);
		result.append(", serviceTypeName: ");
		result.append(serviceTypeName);
		result.append(", serviceTypeID: ");
		result.append(serviceTypeID);
		result.append(')');
		return result.toString();
	}

} //ServiceTypeImpl
