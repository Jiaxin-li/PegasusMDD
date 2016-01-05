/**
 */
package RootElement.Schedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Schedule.RoomSchedule#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see RootElement.Schedule.SchedulePackage#getRoomSchedule()
 * @model
 * @generated
 */
public interface RoomSchedule extends ISchedule {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Schedule.AvailablityMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference list.
	 * @see RootElement.Schedule.SchedulePackage#getRoomSchedule_Schedule()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AvailablityMap> getSchedule();

} // RoomSchedule
