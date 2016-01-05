/**
 */
package RootElement.Schedule.impl;

import RootElement.Schedule.AvailablityMap;
import RootElement.Schedule.RoomSchedule;
import RootElement.Schedule.SchedulePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Schedule.impl.RoomScheduleImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomScheduleImpl extends MinimalEObjectImpl.Container implements RoomSchedule {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailablityMap> schedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.ROOM_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvailablityMap> getSchedule() {
		if (schedule == null) {
			schedule = new EObjectResolvingEList<AvailablityMap>(AvailablityMap.class, this, SchedulePackage.ROOM_SCHEDULE__SCHEDULE);
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int checkAvailable(int roomTypeID, Date checkInDate, Date checkOutDate) {
		AvailablityMap mp ;
		
		EList<AvailablityMap> li = getSchedule();
		if(li.size()>0){			
		
		int min = Integer.MAX_VALUE;
		for (AvailablityMap tmp : li ){
			if(tmp.getRoomType().getRoomTypeID()== roomTypeID){
				Date d = tmp.getDate(); 
				if (d.compareTo(checkInDate)> 0 && d.compareTo(checkOutDate)<0  ){
					if (tmp.getAvailable()<min){
						min = tmp.getAvailable(); 
					}
					
				}
			}
		}
		return min;
		}
		else{
			return 0; 
		}
		
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateAvailable(int roomTypeID, Date checkInDate, Date checkOutDate, int nrOfRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<AvailablityMap> li = getSchedule();
		for (AvailablityMap tmp : li ){
			if(tmp.getRoomType().getRoomTypeID()== roomTypeID){
				Date d = tmp.getDate(); 
				if (d.compareTo(checkInDate)> 0 && d.compareTo(checkOutDate)<0  ){
					tmp.setAvailable(tmp.getAvailable()+nrOfRoom);
					
				}
			}
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.ROOM_SCHEDULE__SCHEDULE:
				return getSchedule();
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
			case SchedulePackage.ROOM_SCHEDULE__SCHEDULE:
				getSchedule().clear();
				getSchedule().addAll((Collection<? extends AvailablityMap>)newValue);
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
			case SchedulePackage.ROOM_SCHEDULE__SCHEDULE:
				getSchedule().clear();
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
			case SchedulePackage.ROOM_SCHEDULE__SCHEDULE:
				return schedule != null && !schedule.isEmpty();
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
			case SchedulePackage.ROOM_SCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE:
				return checkAvailable((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case SchedulePackage.ROOM_SCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT:
				return updateAvailable((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Integer)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomScheduleImpl
