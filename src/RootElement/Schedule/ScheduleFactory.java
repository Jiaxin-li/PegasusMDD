/**
 */
package RootElement.Schedule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Schedule.SchedulePackage
 * @generated
 */
public interface ScheduleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScheduleFactory eINSTANCE = RootElement.Schedule.impl.ScheduleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Availablity Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availablity Map</em>'.
	 * @generated
	 */
	AvailablityMap createAvailablityMap();

	/**
	 * Returns a new object of class '<em>Room Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Schedule</em>'.
	 * @generated
	 */
	RoomSchedule createRoomSchedule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulePackage getSchedulePackage();

} //ScheduleFactory
