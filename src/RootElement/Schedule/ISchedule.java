/**
 */
package RootElement.Schedule;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISchedule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Schedule.SchedulePackage#getISchedule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISchedule extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	int checkAvailable(int roomTypeID, Date checkInDate, Date checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateRequired="true" checkOutDateOrdered="false" nrOfRoomRequired="true" nrOfRoomOrdered="false"
	 * @generated
	 */
	boolean updateAvailable(int roomTypeID, Date checkInDate, Date checkOutDate, int nrOfRoom);

} // ISchedule
