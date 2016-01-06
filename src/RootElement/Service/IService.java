/**
 */
package RootElement.Service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Service.ServicePackage#getIService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ServiceTypeIDRequired="true" ServiceTypeIDOrdered="false"
	 * @generated
	 */
	Service getService(int ServiceTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	boolean addService(Service service);

} // IService
