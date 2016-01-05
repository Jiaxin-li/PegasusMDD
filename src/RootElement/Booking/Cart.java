/**
 */
package RootElement.Booking;

import RootElement.Account.GuestAccount;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking.Cart#getBookings <em>Bookings</em>}</li>
 *   <li>{@link RootElement.Booking.Cart#getCustomer <em>Customer</em>}</li>
 *   <li>{@link RootElement.Booking.Cart#getCartID <em>Cart ID</em>}</li>
 * </ul>
 *
 * @see RootElement.Booking.BookingPackage#getCart()
 * @model
 * @generated
 */
public interface Cart extends EObject {
	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Booking.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see RootElement.Booking.BookingPackage#getCart_Bookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(GuestAccount)
	 * @see RootElement.Booking.BookingPackage#getCart_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestAccount getCustomer();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Cart#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(GuestAccount value);

	/**
	 * Returns the value of the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cart ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart ID</em>' attribute.
	 * @see #setCartID(int)
	 * @see RootElement.Booking.BookingPackage#getCart_CartID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCartID();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Cart#getCartID <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart ID</em>' attribute.
	 * @see #getCartID()
	 * @generated
	 */
	void setCartID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateSum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='notifyCustomer '"
	 * @generated
	 */
	void notifyCustomer();

} // Cart
