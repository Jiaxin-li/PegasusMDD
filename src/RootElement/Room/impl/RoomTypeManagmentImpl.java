/**
 */
package RootElement.Room.impl;

import RootElement.Room.RoomPackage;
import RootElement.Room.RoomType;
import RootElement.Room.RoomTypeManagment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link RootElement.Room.impl.RoomTypeManagmentImpl#getRoomtypes <em>Roomtypes</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomTypeManagmentImpl#getRoomtype <em>Roomtype</em>}</li>
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
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomtypes;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

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
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject)roomtype;
			roomtype = (RoomType)eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE, oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE, oldRoomtype, roomtype));
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE:
				if (resolve) return getRoomtype();
				return basicGetRoomtype();
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE:
				setRoomtype((RoomType)newValue);
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE:
				setRoomtype((RoomType)null);
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
			case RoomPackage.ROOM_TYPE_MANAGMENT__ROOMTYPE:
				return roomtype != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomTypeManagmentImpl
