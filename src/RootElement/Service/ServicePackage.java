/**
 */
package RootElement.Service;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see RootElement.Service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Service.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = RootElement.Service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Service.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.impl.ServiceImpl
	 * @see RootElement.Service.impl.ServicePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Is Conducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_CONDUCTED = 1;

	/**
	 * The feature id for the '<em><b>Servicetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICETYPE = 2;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_ID = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Service.impl.ServiceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.impl.ServiceTypeImpl
	 * @see RootElement.Service.impl.ServicePackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Service Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SERVICE_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Service Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SERVICE_TYPE_ID = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Service.IService <em>IService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.IService
	 * @see RootElement.Service.impl.ServicePackageImpl#getIService()
	 * @generated
	 */
	int ISERVICE = 2;

	/**
	 * The number of structural features of the '<em>IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___GET_SERVICE__INT = 0;

	/**
	 * The number of operations of the '<em>IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Service.IServiceType <em>IService Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.IServiceType
	 * @see RootElement.Service.impl.ServicePackageImpl#getIServiceType()
	 * @generated
	 */
	int ISERVICE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>IService Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE___ADD_SERVICE_TYPE__STRING_INT = 0;

	/**
	 * The operation id for the '<em>Delete Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE___DELETE_SERVICE_TYPE__INT = 1;

	/**
	 * The operation id for the '<em>Edit Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE___EDIT_SERVICE_TYPE__INT = 2;

	/**
	 * The operation id for the '<em>Validate Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE___VALIDATE_SERVICE_TYPE__INT = 3;

	/**
	 * The number of operations of the '<em>IService Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_TYPE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link RootElement.Service.impl.ServiceManagementImpl <em>Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.impl.ServiceManagementImpl
	 * @see RootElement.Service.impl.ServicePackageImpl#getServiceManagement()
	 * @generated
	 */
	int SERVICE_MANAGEMENT = 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT__SERVICES = ISERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_FEATURE_COUNT = ISERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT___GET_SERVICE__INT = ISERVICE___GET_SERVICE__INT;

	/**
	 * The number of operations of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_OPERATION_COUNT = ISERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.Service.impl.ServiceTypeManagmentImpl <em>Type Managment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Service.impl.ServiceTypeManagmentImpl
	 * @see RootElement.Service.impl.ServicePackageImpl#getServiceTypeManagment()
	 * @generated
	 */
	int SERVICE_TYPE_MANAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Service Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT__SERVICE_TYPES = ISERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT__SERVICETYPE = ISERVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT_FEATURE_COUNT = ISERVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT___ADD_SERVICE_TYPE__STRING_INT = ISERVICE_TYPE___ADD_SERVICE_TYPE__STRING_INT;

	/**
	 * The operation id for the '<em>Delete Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT___DELETE_SERVICE_TYPE__INT = ISERVICE_TYPE___DELETE_SERVICE_TYPE__INT;

	/**
	 * The operation id for the '<em>Edit Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT___EDIT_SERVICE_TYPE__INT = ISERVICE_TYPE___EDIT_SERVICE_TYPE__INT;

	/**
	 * The operation id for the '<em>Validate Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT___VALIDATE_SERVICE_TYPE__INT = ISERVICE_TYPE___VALIDATE_SERVICE_TYPE__INT;

	/**
	 * The number of operations of the '<em>Type Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_MANAGMENT_OPERATION_COUNT = ISERVICE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see RootElement.Service.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Service.Service#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Type</em>'.
	 * @see RootElement.Service.Service#getServiceType()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Service.Service#isConducted <em>Is Conducted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Conducted</em>'.
	 * @see RootElement.Service.Service#isConducted()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_IsConducted();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Service.Service#getServicetype <em>Servicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicetype</em>'.
	 * @see RootElement.Service.Service#getServicetype()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Servicetype();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Service.Service#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see RootElement.Service.Service#getServiceID()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceID();

	/**
	 * Returns the meta object for class '{@link RootElement.Service.ServiceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see RootElement.Service.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Service.ServiceType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RootElement.Service.ServiceType#getPrice()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Price();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Service.ServiceType#getServiceTypeName <em>Service Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type Name</em>'.
	 * @see RootElement.Service.ServiceType#getServiceTypeName()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_ServiceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Service.ServiceType#getServiceTypeID <em>Service Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type ID</em>'.
	 * @see RootElement.Service.ServiceType#getServiceTypeID()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_ServiceTypeID();

	/**
	 * Returns the meta object for class '{@link RootElement.Service.IService <em>IService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService</em>'.
	 * @see RootElement.Service.IService
	 * @generated
	 */
	EClass getIService();

	/**
	 * Returns the meta object for the '{@link RootElement.Service.IService#getService(int) <em>Get Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service</em>' operation.
	 * @see RootElement.Service.IService#getService(int)
	 * @generated
	 */
	EOperation getIService__GetService__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Service.IServiceType <em>IService Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService Type</em>'.
	 * @see RootElement.Service.IServiceType
	 * @generated
	 */
	EClass getIServiceType();

	/**
	 * Returns the meta object for the '{@link RootElement.Service.IServiceType#addServiceType(java.lang.String, int) <em>Add Service Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service Type</em>' operation.
	 * @see RootElement.Service.IServiceType#addServiceType(java.lang.String, int)
	 * @generated
	 */
	EOperation getIServiceType__AddServiceType__String_int();

	/**
	 * Returns the meta object for the '{@link RootElement.Service.IServiceType#deleteServiceType(int) <em>Delete Service Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Service Type</em>' operation.
	 * @see RootElement.Service.IServiceType#deleteServiceType(int)
	 * @generated
	 */
	EOperation getIServiceType__DeleteServiceType__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Service.IServiceType#editServiceType(int) <em>Edit Service Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Service Type</em>' operation.
	 * @see RootElement.Service.IServiceType#editServiceType(int)
	 * @generated
	 */
	EOperation getIServiceType__EditServiceType__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Service.IServiceType#validateServiceType(int) <em>Validate Service Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Service Type</em>' operation.
	 * @see RootElement.Service.IServiceType#validateServiceType(int)
	 * @generated
	 */
	EOperation getIServiceType__ValidateServiceType__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Service.ServiceManagement <em>Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management</em>'.
	 * @see RootElement.Service.ServiceManagement
	 * @generated
	 */
	EClass getServiceManagement();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Service.ServiceManagement#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see RootElement.Service.ServiceManagement#getServices()
	 * @see #getServiceManagement()
	 * @generated
	 */
	EReference getServiceManagement_Services();

	/**
	 * Returns the meta object for class '{@link RootElement.Service.ServiceTypeManagment <em>Type Managment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Managment</em>'.
	 * @see RootElement.Service.ServiceTypeManagment
	 * @generated
	 */
	EClass getServiceTypeManagment();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Service.ServiceTypeManagment#getServiceTypes <em>Service Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Types</em>'.
	 * @see RootElement.Service.ServiceTypeManagment#getServiceTypes()
	 * @see #getServiceTypeManagment()
	 * @generated
	 */
	EReference getServiceTypeManagment_ServiceTypes();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Service.ServiceTypeManagment#getServicetype <em>Servicetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicetype</em>'.
	 * @see RootElement.Service.ServiceTypeManagment#getServicetype()
	 * @see #getServiceTypeManagment()
	 * @generated
	 */
	EReference getServiceTypeManagment_Servicetype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link RootElement.Service.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.impl.ServiceImpl
		 * @see RootElement.Service.impl.ServicePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_TYPE = eINSTANCE.getService_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Is Conducted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IS_CONDUCTED = eINSTANCE.getService_IsConducted();

		/**
		 * The meta object literal for the '<em><b>Servicetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICETYPE = eINSTANCE.getService_Servicetype();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_ID = eINSTANCE.getService_ServiceID();

		/**
		 * The meta object literal for the '{@link RootElement.Service.impl.ServiceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.impl.ServiceTypeImpl
		 * @see RootElement.Service.impl.ServicePackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__PRICE = eINSTANCE.getServiceType_Price();

		/**
		 * The meta object literal for the '<em><b>Service Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__SERVICE_TYPE_NAME = eINSTANCE.getServiceType_ServiceTypeName();

		/**
		 * The meta object literal for the '<em><b>Service Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__SERVICE_TYPE_ID = eINSTANCE.getServiceType_ServiceTypeID();

		/**
		 * The meta object literal for the '{@link RootElement.Service.IService <em>IService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.IService
		 * @see RootElement.Service.impl.ServicePackageImpl#getIService()
		 * @generated
		 */
		EClass ISERVICE = eINSTANCE.getIService();

		/**
		 * The meta object literal for the '<em><b>Get Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE___GET_SERVICE__INT = eINSTANCE.getIService__GetService__int();

		/**
		 * The meta object literal for the '{@link RootElement.Service.IServiceType <em>IService Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.IServiceType
		 * @see RootElement.Service.impl.ServicePackageImpl#getIServiceType()
		 * @generated
		 */
		EClass ISERVICE_TYPE = eINSTANCE.getIServiceType();

		/**
		 * The meta object literal for the '<em><b>Add Service Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_TYPE___ADD_SERVICE_TYPE__STRING_INT = eINSTANCE.getIServiceType__AddServiceType__String_int();

		/**
		 * The meta object literal for the '<em><b>Delete Service Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_TYPE___DELETE_SERVICE_TYPE__INT = eINSTANCE.getIServiceType__DeleteServiceType__int();

		/**
		 * The meta object literal for the '<em><b>Edit Service Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_TYPE___EDIT_SERVICE_TYPE__INT = eINSTANCE.getIServiceType__EditServiceType__int();

		/**
		 * The meta object literal for the '<em><b>Validate Service Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_TYPE___VALIDATE_SERVICE_TYPE__INT = eINSTANCE.getIServiceType__ValidateServiceType__int();

		/**
		 * The meta object literal for the '{@link RootElement.Service.impl.ServiceManagementImpl <em>Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.impl.ServiceManagementImpl
		 * @see RootElement.Service.impl.ServicePackageImpl#getServiceManagement()
		 * @generated
		 */
		EClass SERVICE_MANAGEMENT = eINSTANCE.getServiceManagement();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MANAGEMENT__SERVICES = eINSTANCE.getServiceManagement_Services();

		/**
		 * The meta object literal for the '{@link RootElement.Service.impl.ServiceTypeManagmentImpl <em>Type Managment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Service.impl.ServiceTypeManagmentImpl
		 * @see RootElement.Service.impl.ServicePackageImpl#getServiceTypeManagment()
		 * @generated
		 */
		EClass SERVICE_TYPE_MANAGMENT = eINSTANCE.getServiceTypeManagment();

		/**
		 * The meta object literal for the '<em><b>Service Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE_MANAGMENT__SERVICE_TYPES = eINSTANCE.getServiceTypeManagment_ServiceTypes();

		/**
		 * The meta object literal for the '<em><b>Servicetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE_MANAGMENT__SERVICETYPE = eINSTANCE.getServiceTypeManagment_Servicetype();

	}

} //ServicePackage
