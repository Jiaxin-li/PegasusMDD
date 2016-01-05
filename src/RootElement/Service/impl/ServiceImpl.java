/**
 */
package RootElement.Service.impl;

import RootElement.Service.Service;
import RootElement.Service.ServicePackage;
import RootElement.Service.ServiceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.impl.ServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceImpl#isConducted <em>Is Conducted</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceImpl#getServicetype <em>Servicetype</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceImpl#getServiceID <em>Service ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected ServiceType serviceType;

	/**
	 * The default value of the '{@link #isConducted() <em>Is Conducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConducted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONDUCTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConducted() <em>Is Conducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConducted()
	 * @generated
	 * @ordered
	 */
	protected boolean isConducted = IS_CONDUCTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicetype() <em>Servicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicetype()
	 * @generated
	 * @ordered
	 */
	protected ServiceType servicetype;

	/**
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected int serviceID = SERVICE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getServiceType() {
		if (serviceType != null && serviceType.eIsProxy()) {
			InternalEObject oldServiceType = (InternalEObject)serviceType;
			serviceType = (ServiceType)eResolveProxy(oldServiceType);
			if (serviceType != oldServiceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
			}
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType basicGetServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(ServiceType newServiceType) {
		ServiceType oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConducted() {
		return isConducted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConducted(boolean newIsConducted) {
		boolean oldIsConducted = isConducted;
		isConducted = newIsConducted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__IS_CONDUCTED, oldIsConducted, isConducted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getServicetype() {
		if (servicetype != null && servicetype.eIsProxy()) {
			InternalEObject oldServicetype = (InternalEObject)servicetype;
			servicetype = (ServiceType)eResolveProxy(oldServicetype);
			if (servicetype != oldServicetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__SERVICETYPE, oldServicetype, servicetype));
			}
		}
		return servicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType basicGetServicetype() {
		return servicetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicetype(ServiceType newServicetype) {
		ServiceType oldServicetype = servicetype;
		servicetype = newServicetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SERVICETYPE, oldServicetype, servicetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceID() {
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(int newServiceID) {
		int oldServiceID = serviceID;
		serviceID = newServiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SERVICE_ID, oldServiceID, serviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE__SERVICE_TYPE:
				if (resolve) return getServiceType();
				return basicGetServiceType();
			case ServicePackage.SERVICE__IS_CONDUCTED:
				return isConducted();
			case ServicePackage.SERVICE__SERVICETYPE:
				if (resolve) return getServicetype();
				return basicGetServicetype();
			case ServicePackage.SERVICE__SERVICE_ID:
				return getServiceID();
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
			case ServicePackage.SERVICE__SERVICE_TYPE:
				setServiceType((ServiceType)newValue);
				return;
			case ServicePackage.SERVICE__IS_CONDUCTED:
				setIsConducted((Boolean)newValue);
				return;
			case ServicePackage.SERVICE__SERVICETYPE:
				setServicetype((ServiceType)newValue);
				return;
			case ServicePackage.SERVICE__SERVICE_ID:
				setServiceID((Integer)newValue);
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
			case ServicePackage.SERVICE__SERVICE_TYPE:
				setServiceType((ServiceType)null);
				return;
			case ServicePackage.SERVICE__IS_CONDUCTED:
				setIsConducted(IS_CONDUCTED_EDEFAULT);
				return;
			case ServicePackage.SERVICE__SERVICETYPE:
				setServicetype((ServiceType)null);
				return;
			case ServicePackage.SERVICE__SERVICE_ID:
				setServiceID(SERVICE_ID_EDEFAULT);
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
			case ServicePackage.SERVICE__SERVICE_TYPE:
				return serviceType != null;
			case ServicePackage.SERVICE__IS_CONDUCTED:
				return isConducted != IS_CONDUCTED_EDEFAULT;
			case ServicePackage.SERVICE__SERVICETYPE:
				return servicetype != null;
			case ServicePackage.SERVICE__SERVICE_ID:
				return serviceID != SERVICE_ID_EDEFAULT;
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
		result.append(" (isConducted: ");
		result.append(isConducted);
		result.append(", serviceID: ");
		result.append(serviceID);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
