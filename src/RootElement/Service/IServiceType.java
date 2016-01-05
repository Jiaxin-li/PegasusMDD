/**
 */
package RootElement.Service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Service.ServicePackage#getIServiceType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IServiceType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ServiceTypeNameRequired="true" ServiceTypeNameOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	boolean addServiceType(String ServiceTypeName, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" serviceTypeIDRequired="true" serviceTypeIDOrdered="false"
	 * @generated
	 */
	boolean deleteServiceType(int serviceTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ServiceTypeIDRequired="true" ServiceTypeIDOrdered="false"
	 * @generated
	 */
	boolean editServiceType(int ServiceTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" serviceTypeIDRequired="true" serviceTypeIDOrdered="false"
	 * @generated
	 */
	boolean validateServiceType(int serviceTypeID);

} // IServiceType
