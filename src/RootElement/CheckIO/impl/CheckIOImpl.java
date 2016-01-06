/**
 */
package RootElement.CheckIO.impl;

import RootElement.Account.GuestAccountMangement;
import RootElement.Account.StaffAccount;
import RootElement.Booking.Booking;
import RootElement.Booking.CartManagement;

import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOPackage;
import RootElement.CheckIO.RoomBinder;
import RootElement.Room.Room;
import RootElement.Room.RoomManagement;
import RootElement.Service.Service;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Check IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getRoombinder <em>Roombinder</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getStaffs <em>Staffs</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getBindedRooms <em>Binded Rooms</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getCartManagement <em>Cart Management</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getGuestManagement <em>Guest Management</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckIOImpl extends MinimalEObjectImpl.Container implements CheckIO {
	/**
	 * The cached value of the '{@link #getRoombinder() <em>Roombinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombinder()
	 * @generated
	 * @ordered
	 */
	protected RoomBinder roombinder;

	/**
	 * The cached value of the '{@link #getStaffs() <em>Staffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffs()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffAccount> staffs;

	/**
	 * The cached value of the '{@link #getBindedRooms() <em>Binded Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindedRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBinder> bindedRooms;

	/**
	 * The cached value of the '{@link #getCartManagement() <em>Cart Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartManagement()
	 * @generated
	 * @ordered
	 */
	protected CartManagement cartManagement;

	/**
	 * The cached value of the '{@link #getRoomManagement() <em>Room Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomManagement()
	 * @generated
	 * @ordered
	 */
	protected RoomManagement roomManagement;

	/**
	 * The cached value of the '{@link #getGuestManagement() <em>Guest Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestManagement()
	 * @generated
	 * @ordered
	 */
	protected GuestAccountMangement guestManagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckIOPackage.Literals.CHECK_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBinder getRoombinder() {
		if (roombinder != null && roombinder.eIsProxy()) {
			InternalEObject oldRoombinder = (InternalEObject)roombinder;
			roombinder = (RoomBinder)eResolveProxy(oldRoombinder);
			if (roombinder != oldRoombinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.CHECK_IO__ROOMBINDER, oldRoombinder, roombinder));
			}
		}
		return roombinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBinder basicGetRoombinder() {
		return roombinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoombinder(RoomBinder newRoombinder) {
		RoomBinder oldRoombinder = roombinder;
		roombinder = newRoombinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.CHECK_IO__ROOMBINDER, oldRoombinder, roombinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffAccount> getStaffs() {
		if (staffs == null) {
			staffs = new EObjectResolvingEList<StaffAccount>(StaffAccount.class, this, CheckIOPackage.CHECK_IO__STAFFS);
		}
		return staffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBinder> getBindedRooms() {
		if (bindedRooms == null) {
			bindedRooms = new EObjectResolvingEList<RoomBinder>(RoomBinder.class, this, CheckIOPackage.CHECK_IO__BINDED_ROOMS);
		}
		return bindedRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartManagement getCartManagement() {
		if (cartManagement != null && cartManagement.eIsProxy()) {
			InternalEObject oldCartManagement = (InternalEObject)cartManagement;
			cartManagement = (CartManagement)eResolveProxy(oldCartManagement);
			if (cartManagement != oldCartManagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.CHECK_IO__CART_MANAGEMENT, oldCartManagement, cartManagement));
			}
		}
		return cartManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartManagement basicGetCartManagement() {
		return cartManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartManagement(CartManagement newCartManagement) {
		CartManagement oldCartManagement = cartManagement;
		cartManagement = newCartManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.CHECK_IO__CART_MANAGEMENT, oldCartManagement, cartManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagement getRoomManagement() {
		if (roomManagement != null && roomManagement.eIsProxy()) {
			InternalEObject oldRoomManagement = (InternalEObject)roomManagement;
			roomManagement = (RoomManagement)eResolveProxy(oldRoomManagement);
			if (roomManagement != oldRoomManagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT, oldRoomManagement, roomManagement));
			}
		}
		return roomManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagement basicGetRoomManagement() {
		return roomManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomManagement(RoomManagement newRoomManagement) {
		RoomManagement oldRoomManagement = roomManagement;
		roomManagement = newRoomManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT, oldRoomManagement, roomManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccountMangement getGuestManagement() {
		if (guestManagement != null && guestManagement.eIsProxy()) {
			InternalEObject oldGuestManagement = (InternalEObject)guestManagement;
			guestManagement = (GuestAccountMangement)eResolveProxy(oldGuestManagement);
			if (guestManagement != oldGuestManagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT, oldGuestManagement, guestManagement));
			}
		}
		return guestManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccountMangement basicGetGuestManagement() {
		return guestManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestManagement(GuestAccountMangement newGuestManagement) {
		GuestAccountMangement oldGuestManagement = guestManagement;
		guestManagement = newGuestManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT, oldGuestManagement, guestManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean payOrder(int amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int generateTotal(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int total = 0;
		EList<RoomBinder> rbl = getBindedRooms();
		for (RoomBinder rb : rbl ){
			if(rb.getBookingID() == bookingID ){
				int serviceTotal  = 0;
				for (Service s : rb.getServices() ){
					serviceTotal += s.getServicetype().getPrice();
				}
				total += rb.getRoom().getRoomType().getPrice()+ serviceTotal;
			}			
	}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public String getPaymentResult(int response) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return "paid";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean CheckOut(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(cartManagement.validateBooking(bookingId)){
			int total = this.generateTotal(bookingId);
				if(this.payOrder(total)){
					cartManagement.getBooking(bookingId).setIsPaid(true);
					return true;
				}
			return false;
		
		}
		else{
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean CheckIn(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(cartManagement.validateBooking(bookingID)){
			Booking booking = cartManagement.getBooking(bookingID);
			int tid = booking.getRoomTypeID();
			Room r = roomManagement.getAvailiableRoom(tid);
			roombinder = new RoomBinderImpl();
			roombinder.setBookingID(bookingID);
			roombinder.setRoom(r);
			this.bindedRooms.add(roombinder);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				if (resolve) return getRoombinder();
				return basicGetRoombinder();
			case CheckIOPackage.CHECK_IO__STAFFS:
				return getStaffs();
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				return getBindedRooms();
			case CheckIOPackage.CHECK_IO__CART_MANAGEMENT:
				if (resolve) return getCartManagement();
				return basicGetCartManagement();
			case CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT:
				if (resolve) return getRoomManagement();
				return basicGetRoomManagement();
			case CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT:
				if (resolve) return getGuestManagement();
				return basicGetGuestManagement();
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				setRoombinder((RoomBinder)newValue);
				return;
			case CheckIOPackage.CHECK_IO__STAFFS:
				getStaffs().clear();
				getStaffs().addAll((Collection<? extends StaffAccount>)newValue);
				return;
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				getBindedRooms().clear();
				getBindedRooms().addAll((Collection<? extends RoomBinder>)newValue);
				return;
			case CheckIOPackage.CHECK_IO__CART_MANAGEMENT:
				setCartManagement((CartManagement)newValue);
				return;
			case CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT:
				setRoomManagement((RoomManagement)newValue);
				return;
			case CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT:
				setGuestManagement((GuestAccountMangement)newValue);
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				setRoombinder((RoomBinder)null);
				return;
			case CheckIOPackage.CHECK_IO__STAFFS:
				getStaffs().clear();
				return;
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				getBindedRooms().clear();
				return;
			case CheckIOPackage.CHECK_IO__CART_MANAGEMENT:
				setCartManagement((CartManagement)null);
				return;
			case CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT:
				setRoomManagement((RoomManagement)null);
				return;
			case CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT:
				setGuestManagement((GuestAccountMangement)null);
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				return roombinder != null;
			case CheckIOPackage.CHECK_IO__STAFFS:
				return staffs != null && !staffs.isEmpty();
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				return bindedRooms != null && !bindedRooms.isEmpty();
			case CheckIOPackage.CHECK_IO__CART_MANAGEMENT:
				return cartManagement != null;
			case CheckIOPackage.CHECK_IO__ROOM_MANAGEMENT:
				return roomManagement != null;
			case CheckIOPackage.CHECK_IO__GUEST_MANAGEMENT:
				return guestManagement != null;
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
			case CheckIOPackage.CHECK_IO___PAY_ORDER__INT:
				return payOrder((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___GENERATE_TOTAL__INT:
				return generateTotal((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___GET_PAYMENT_RESULT__INT:
				return getPaymentResult((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___CHECK_OUT__INT:
				return CheckOut((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___CHECK_IN__INT:
				return CheckIn((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CheckIOImpl
