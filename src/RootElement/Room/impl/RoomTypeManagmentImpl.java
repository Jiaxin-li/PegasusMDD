/**
 */
package RootElement.Room.impl;

import RootElement.Room.RoomPackage;
import RootElement.Room.RoomType;
import RootElement.Room.RoomTypeManagment;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link RootElement.Room.impl.RoomTypeManagmentImpl#getRoomtypes <em>Roomtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeManagmentImpl extends MinimalEObjectImpl.Container implements RoomTypeManagment {
	/**
	 * The cached value of the '{@link #getRoomtypes() <em>Roomtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtypes()
	 * @ordered
	 */
	protected EList<RoomType> roomtypes = new BasicEList<RoomType>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeManagmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomPackage.Literals.ROOM_TYPE_MANAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomtypes() {
		if (roomtypes == null) {
			roomtypes = new EObjectResolvingEList<RoomType>(RoomType.class, this, RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPES);
		}
		return roomtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public int addRoomType(String RoomTypeName, int price, int nrOfBeds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		RoomType rt = new RoomTypeImpl();
		rt.setRoomTypeName(RoomTypeName);
		rt.setPrice(price);
		rt.setNumberOfBeds(nrOfBeds);
		int roomTypeID = roomtypes.size();
		rt.setRoomTypeID(roomTypeID);
		roomtypes.add(rt);
		return roomTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editRoomType(int roomTypeID, String RoomTypeName, int price, int nrOfBeds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean editRoomType(int roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean validateRoomType(int RoomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<RoomType> rtl = getRoomtypes();
		for (RoomType rt : rtl){
			if(rt.getRoomTypeID() == RoomTypeID){
				return true;
			}
			
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean deleteRoomType(int roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<RoomType> rtl = getRoomtypes();
		int index =0;
		for (RoomType rt : rtl){
			if(rt.getRoomTypeID() == roomTypeID){
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
	 */
	public RoomType getRoomType(int introomTypeID) {
		return roomtypes.get(introomTypeID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPES:
				return getRoomtypes();
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPES:
				getRoomtypes().clear();
				getRoomtypes().addAll((Collection<? extends RoomType>)newValue);
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPES:
				getRoomtypes().clear();
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPES:
				return roomtypes != null && !roomtypes.isEmpty();
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
			case RoomPackage.ROOM_TYPE_MANAGMENT___ADD_ROOM_TYPE__STRING_INT_INT:
				return addRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case RoomPackage.ROOM_TYPE_MANAGMENT___EDIT_ROOM_TYPE__INT_STRING_INT_INT:
				return editRoomType((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case RoomPackage.ROOM_TYPE_MANAGMENT___VALIDATE_ROOM_TYPE__INT:
				return validateRoomType((Integer)arguments.get(0));
			case RoomPackage.ROOM_TYPE_MANAGMENT___DELETE_ROOM_TYPE__INT:
				return deleteRoomType((Integer)arguments.get(0));
			case RoomPackage.ROOM_TYPE_MANAGMENT___GET_ROOM_TYPE__INT:
				return getRoomType((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomTypeManagmentImpl
