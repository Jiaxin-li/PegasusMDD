/**
 */
package RootElement.Service.impl;

import RootElement.Account.StaffAccount;
import RootElement.Service.ServicePackage;
import RootElement.Service.ServiceType;
import RootElement.Service.ServiceTypeManagment;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Managment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.impl.ServiceTypeManagmentImpl#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link RootElement.Service.impl.ServiceTypeManagmentImpl#getServicetype <em>Servicetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeManagmentImpl extends MinimalEObjectImpl.Container implements ServiceTypeManagment {
	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> serviceTypes = new BasicEList<ServiceType>();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeManagmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_TYPE_MANAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICE_TYPES);
		}
		return serviceTypes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE, oldServicetype, servicetype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE, oldServicetype, servicetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean addServiceType(String ServiceTypeName, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		ServiceType st = new ServiceTypeImpl();
		st.setServiceTypeName(ServiceTypeName);
		st.setPrice(price);
		st.setServiceTypeID(serviceTypes.size());
		serviceTypes.add(st);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean deleteServiceType(int serviceTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ServiceType> rtl = getServiceTypes();
		int index =0;
		for (ServiceType rt : rtl){
			if(rt.getServiceTypeID() == serviceTypeID){
				rtl.remove(index);
				return true;
			}
			index ++;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean editServiceType(int ServiceTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean validateServiceType(int serviceTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ServiceType> rtl = getServiceTypes();
		for (ServiceType rt : rtl){
			if(rt.getServiceTypeID() == serviceTypeID){
				return true;
			}
			
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICE_TYPES:
				return getServiceTypes();
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE:
				if (resolve) return getServicetype();
				return basicGetServicetype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICE_TYPES:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends ServiceType>)newValue);
				return;
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE:
				setServicetype((ServiceType)newValue);
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
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICE_TYPES:
				getServiceTypes().clear();
				return;
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE:
				setServicetype((ServiceType)null);
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
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICE_TYPES:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ServicePackage.SERVICE_TYPE_MANAGMENT__SERVICETYPE:
				return servicetype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.SERVICE_TYPE_MANAGMENT___ADD_SERVICE_TYPE__STRING_INT:
				return addServiceType((String)arguments.get(0), (Integer)arguments.get(1));
			case ServicePackage.SERVICE_TYPE_MANAGMENT___DELETE_SERVICE_TYPE__INT:
				return deleteServiceType((Integer)arguments.get(0));
			case ServicePackage.SERVICE_TYPE_MANAGMENT___EDIT_SERVICE_TYPE__INT:
				return editServiceType((Integer)arguments.get(0));
			case ServicePackage.SERVICE_TYPE_MANAGMENT___VALIDATE_SERVICE_TYPE__INT:
				return validateServiceType((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceTypeManagmentImpl
