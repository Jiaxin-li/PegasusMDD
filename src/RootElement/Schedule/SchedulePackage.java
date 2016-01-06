/**
 */
package RootElement.Schedule;

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
 * @see RootElement.Schedule.ScheduleFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Schedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Schedule.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Schedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulePackage eINSTANCE = RootElement.Schedule.impl.SchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Schedule.impl.AvailablityMapImpl <em>Availablity Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Schedule.impl.AvailablityMapImpl
	 * @see RootElement.Schedule.impl.SchedulePackageImpl#getAvailablityMap()
	 * @generated
	 */
	int AVAILABLITY_MAP = 0;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLITY_MAP__ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLITY_MAP__AVAILABLE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLITY_MAP__DATE = 2;

	/**
	 * The number of structural features of the '<em>Availablity Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLITY_MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Availablity Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLITY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Schedule.ISchedule <em>ISchedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Schedule.ISchedule
	 * @see RootElement.Schedule.impl.SchedulePackageImpl#getISchedule()
	 * @generated
	 */
	int ISCHEDULE = 1;

	/**
	 * The number of structural features of the '<em>ISchedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEDULE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Update Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT = 1;

	/**
	 * The number of operations of the '<em>ISchedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEDULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Schedule.impl.RoomScheduleImpl <em>Room Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Schedule.impl.RoomScheduleImpl
	 * @see RootElement.Schedule.impl.SchedulePackageImpl#getRoomSchedule()
	 * @generated
	 */
	int ROOM_SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SCHEDULE__SCHEDULE = ISCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SCHEDULE_FEATURE_COUNT = ISCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE = ISCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Update Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT = ISCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT;

	/**
	 * The number of operations of the '<em>Room Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SCHEDULE_OPERATION_COUNT = ISCHEDULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Schedule.AvailablityMap <em>Availablity Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availablity Map</em>'.
	 * @see RootElement.Schedule.AvailablityMap
	 * @generated
	 */
	EClass getAvailablityMap();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Schedule.AvailablityMap#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see RootElement.Schedule.AvailablityMap#getRoomType()
	 * @see #getAvailablityMap()
	 * @generated
	 */
	EReference getAvailablityMap_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Schedule.AvailablityMap#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see RootElement.Schedule.AvailablityMap#getAvailable()
	 * @see #getAvailablityMap()
	 * @generated
	 */
	EAttribute getAvailablityMap_Available();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Schedule.AvailablityMap#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see RootElement.Schedule.AvailablityMap#getDate()
	 * @see #getAvailablityMap()
	 * @generated
	 */
	EAttribute getAvailablityMap_Date();

	/**
	 * Returns the meta object for class '{@link RootElement.Schedule.RoomSchedule <em>Room Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Schedule</em>'.
	 * @see RootElement.Schedule.RoomSchedule
	 * @generated
	 */
	EClass getRoomSchedule();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Schedule.RoomSchedule#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule</em>'.
	 * @see RootElement.Schedule.RoomSchedule#getSchedule()
	 * @see #getRoomSchedule()
	 * @generated
	 */
	EReference getRoomSchedule_Schedule();

	/**
	 * Returns the meta object for class '{@link RootElement.Schedule.ISchedule <em>ISchedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISchedule</em>'.
	 * @see RootElement.Schedule.ISchedule
	 * @generated
	 */
	EClass getISchedule();

	/**
	 * Returns the meta object for the '{@link RootElement.Schedule.ISchedule#checkAvailable(int, java.util.Date, java.util.Date) <em>Check Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Available</em>' operation.
	 * @see RootElement.Schedule.ISchedule#checkAvailable(int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getISchedule__CheckAvailable__int_Date_Date();

	/**
	 * Returns the meta object for the '{@link RootElement.Schedule.ISchedule#updateAvailable(int, java.util.Date, java.util.Date, int) <em>Update Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Available</em>' operation.
	 * @see RootElement.Schedule.ISchedule#updateAvailable(int, java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getISchedule__UpdateAvailable__int_Date_Date_int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduleFactory getScheduleFactory();

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
		 * The meta object literal for the '{@link RootElement.Schedule.impl.AvailablityMapImpl <em>Availablity Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Schedule.impl.AvailablityMapImpl
		 * @see RootElement.Schedule.impl.SchedulePackageImpl#getAvailablityMap()
		 * @generated
		 */
		EClass AVAILABLITY_MAP = eINSTANCE.getAvailablityMap();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABLITY_MAP__ROOM_TYPE = eINSTANCE.getAvailablityMap_RoomType();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLITY_MAP__AVAILABLE = eINSTANCE.getAvailablityMap_Available();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLITY_MAP__DATE = eINSTANCE.getAvailablityMap_Date();

		/**
		 * The meta object literal for the '{@link RootElement.Schedule.impl.RoomScheduleImpl <em>Room Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Schedule.impl.RoomScheduleImpl
		 * @see RootElement.Schedule.impl.SchedulePackageImpl#getRoomSchedule()
		 * @generated
		 */
		EClass ROOM_SCHEDULE = eINSTANCE.getRoomSchedule();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_SCHEDULE__SCHEDULE = eINSTANCE.getRoomSchedule_Schedule();

		/**
		 * The meta object literal for the '{@link RootElement.Schedule.ISchedule <em>ISchedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Schedule.ISchedule
		 * @see RootElement.Schedule.impl.SchedulePackageImpl#getISchedule()
		 * @generated
		 */
		EClass ISCHEDULE = eINSTANCE.getISchedule();

		/**
		 * The meta object literal for the '<em><b>Check Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE = eINSTANCE.getISchedule__CheckAvailable__int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Update Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT = eINSTANCE.getISchedule__UpdateAvailable__int_Date_Date_int();

	}

} //SchedulePackage
