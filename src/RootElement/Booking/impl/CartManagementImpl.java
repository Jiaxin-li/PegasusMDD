/**
 */
package RootElement.Booking.impl;

import RootElement.Booking.Booking;
import RootElement.Booking.BookingPackage;
import RootElement.Booking.Cart;
import RootElement.Booking.CartManagement;

import RootElement.Room.RoomTypeManagment;
import RootElement.Schedule.RoomSchedule;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking.impl.CartManagementImpl#getCarts <em>Carts</em>}</li>
 *   <li>{@link RootElement.Booking.impl.CartManagementImpl#getRoomTypeManagement <em>Room Type Management</em>}</li>
 *   <li>{@link RootElement.Booking.impl.CartManagementImpl#getRoomSchedule <em>Room Schedule</em>}</li>
 *   <li>{@link RootElement.Booking.impl.CartManagementImpl#getCurrentCart <em>Current Cart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartManagementImpl extends MinimalEObjectImpl.Container implements CartManagement {
	/**
	 * The cached value of the '{@link #getCarts() <em>Carts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarts()
	 * @generated
	 * @ordered
	 */
	protected EList<Cart> carts;

	/**
	 * The cached value of the '{@link #getRoomTypeManagement() <em>Room Type Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeManagement()
	 * @generated
	 * @ordered
	 */
	protected RoomTypeManagment roomTypeManagement;

	/**
	 * The cached value of the '{@link #getRoomSchedule() <em>Room Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomSchedule()
	 * @generated
	 * @ordered
	 */
	protected RoomSchedule roomSchedule;

	/**
	 * The cached value of the '{@link #getCurrentCart() <em>Current Cart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCart()
	 * @generated
	 * @ordered
	 */
	protected Cart currentCart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.CART_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cart> getCarts() {
		if (carts == null) {
			carts = new EObjectResolvingEList<Cart>(Cart.class, this, BookingPackage.CART_MANAGEMENT__CARTS);
		}
		return carts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeManagment getRoomTypeManagement() {
		if (roomTypeManagement != null && roomTypeManagement.eIsProxy()) {
			InternalEObject oldRoomTypeManagement = (InternalEObject)roomTypeManagement;
			roomTypeManagement = (RoomTypeManagment)eResolveProxy(oldRoomTypeManagement);
			if (roomTypeManagement != oldRoomTypeManagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT, oldRoomTypeManagement, roomTypeManagement));
			}
		}
		return roomTypeManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeManagment basicGetRoomTypeManagement() {
		return roomTypeManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeManagement(RoomTypeManagment newRoomTypeManagement) {
		RoomTypeManagment oldRoomTypeManagement = roomTypeManagement;
		roomTypeManagement = newRoomTypeManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT, oldRoomTypeManagement, roomTypeManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomSchedule getRoomSchedule() {
		if (roomSchedule != null && roomSchedule.eIsProxy()) {
			InternalEObject oldRoomSchedule = (InternalEObject)roomSchedule;
			roomSchedule = (RoomSchedule)eResolveProxy(oldRoomSchedule);
			if (roomSchedule != oldRoomSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE, oldRoomSchedule, roomSchedule));
			}
		}
		return roomSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomSchedule basicGetRoomSchedule() {
		return roomSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomSchedule(RoomSchedule newRoomSchedule) {
		RoomSchedule oldRoomSchedule = roomSchedule;
		roomSchedule = newRoomSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE, oldRoomSchedule, roomSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cart getCurrentCart() {
		if (currentCart != null && currentCart.eIsProxy()) {
			InternalEObject oldCurrentCart = (InternalEObject)currentCart;
			currentCart = (Cart)eResolveProxy(oldCurrentCart);
			if (currentCart != oldCurrentCart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.CART_MANAGEMENT__CURRENT_CART, oldCurrentCart, currentCart));
			}
		}
		return currentCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cart basicGetCurrentCart() {
		return currentCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean deleteBooking(int bookingID) {
		if(currentCart == null){
			return false;
		}
		try {	
			EList<Booking> bookings = currentCart.getBookings();
			bookings.remove(getBooking(bookingID));
		} catch (Exception e) {
			return false;
		}
		return true;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Booking getBooking(int bookingID) {
		if(currentCart == null){
			throw new RuntimeException();
		}
		EList<Booking> bookings = currentCart.getBookings();
		return bookings.get(bookingID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateBooking(int BookingID) {
		try{
			getBooking(BookingID);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean addCart(Cart cart) {
		int numberOfCarts = carts.size();
		int cartID = numberOfCarts - 1;
		cart.setCartID(cartID);
		try {
			carts.add(cart);	
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean deleteCart(int CartID) {
		try{
			carts.remove(CartID);
		}catch (Exception e){
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCart(Cart newCurrentCart) {
		Cart oldCurrentCart = currentCart;
		currentCart = newCurrentCart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.CART_MANAGEMENT__CURRENT_CART, oldCurrentCart, currentCart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addBooking(int roomTypeID, Date checkInDate, Date checkOutDate, int nrOfRooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean editBooking(int bookingID, int roomTypeID, Date checkInDate, Date checkOutDate, int nrOfRooms) {
		/*
		if (nrOfRooms <= 0) return false;
		
		if (checkInDate > checkOutDate || checkOutDate < checkInDate) return false;
		
		if (checkInDate < now() || checkOutDate < now()) return false;
		
		if(! validateBooking(bookingID)) return false;
		
		if (! roomTypeID.exists()) return false;
		
		Booking booking = getBooking(bookingID);
		int nrOfRoomsOld = booking.getRooms();
		AvailablityMap.updateAvailablity(roomTypeID, checkIn, checkOut, -1 * nrOfRoomsOld);
		
	
		if (! AvailablityMap.checkAvailability(roomTypeID, checkIn, checkOut, nrOfRooms)) return false;
		
		if (! AvailablityMap.updateAvailablity(roomTypeID, checkIn, checkOut, -1 * nrOfRooms)) return false;
		return true;
		
		*/
		
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
			case BookingPackage.CART_MANAGEMENT__CARTS:
				return getCarts();
			case BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT:
				if (resolve) return getRoomTypeManagement();
				return basicGetRoomTypeManagement();
			case BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE:
				if (resolve) return getRoomSchedule();
				return basicGetRoomSchedule();
			case BookingPackage.CART_MANAGEMENT__CURRENT_CART:
				if (resolve) return getCurrentCart();
				return basicGetCurrentCart();
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
			case BookingPackage.CART_MANAGEMENT__CARTS:
				getCarts().clear();
				getCarts().addAll((Collection<? extends Cart>)newValue);
				return;
			case BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT:
				setRoomTypeManagement((RoomTypeManagment)newValue);
				return;
			case BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE:
				setRoomSchedule((RoomSchedule)newValue);
				return;
			case BookingPackage.CART_MANAGEMENT__CURRENT_CART:
				setCurrentCart((Cart)newValue);
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
			case BookingPackage.CART_MANAGEMENT__CARTS:
				getCarts().clear();
				return;
			case BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT:
				setRoomTypeManagement((RoomTypeManagment)null);
				return;
			case BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE:
				setRoomSchedule((RoomSchedule)null);
				return;
			case BookingPackage.CART_MANAGEMENT__CURRENT_CART:
				setCurrentCart((Cart)null);
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
			case BookingPackage.CART_MANAGEMENT__CARTS:
				return carts != null && !carts.isEmpty();
			case BookingPackage.CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT:
				return roomTypeManagement != null;
			case BookingPackage.CART_MANAGEMENT__ROOM_SCHEDULE:
				return roomSchedule != null;
			case BookingPackage.CART_MANAGEMENT__CURRENT_CART:
				return currentCart != null;
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
			case BookingPackage.CART_MANAGEMENT___ADD_BOOKING__INT_DATE_DATE_INT:
				return addBooking((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Integer)arguments.get(3));
			case BookingPackage.CART_MANAGEMENT___EDIT_BOOKING__INT_INT_DATE_DATE_INT:
				return editBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3), (Integer)arguments.get(4));
			case BookingPackage.CART_MANAGEMENT___DELETE_BOOKING__INT:
				return deleteBooking((Integer)arguments.get(0));
			case BookingPackage.CART_MANAGEMENT___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case BookingPackage.CART_MANAGEMENT___VALIDATE_BOOKING__INT:
				return validateBooking((Integer)arguments.get(0));
			case BookingPackage.CART_MANAGEMENT___ADD_CART__CART:
				return addCart((Cart)arguments.get(0));
			case BookingPackage.CART_MANAGEMENT___DELETE_CART__INT:
				return deleteCart((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CartManagementImpl
