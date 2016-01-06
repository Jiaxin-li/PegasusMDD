/**
 */
package RootElement.Booking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking.CartManagement#getCarts <em>Carts</em>}</li>
 *   <li>{@link RootElement.Booking.CartManagement#getCurrentCart <em>Current Cart</em>}</li>
 * </ul>
 *
 * @see RootElement.Booking.BookingPackage#getCartManagement()
 * @model
 * @generated
 */
public interface CartManagement extends IBooking {
	/**
	 * Returns the value of the '<em><b>Carts</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Booking.Cart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carts</em>' reference list.
	 * @see RootElement.Booking.BookingPackage#getCartManagement_Carts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Cart> getCarts();

	/**
	 * Returns the value of the '<em><b>Current Cart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Cart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Cart</em>' reference.
	 * @see #setCurrentCart(Cart)
	 * @see RootElement.Booking.BookingPackage#getCartManagement_CurrentCart()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Cart getCurrentCart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" cartRequired="true" cartOrdered="false"
	 * @generated
	 */
	boolean addCart(Cart cart);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" CartIDRequired="true" CartIDOrdered="false"
	 * @generated
	 */
	boolean deleteCart(int CartID);

	/**
	 * Sets the value of the '{@link RootElement.Booking.CartManagement#getCurrentCart <em>Current Cart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Cart</em>' reference.
	 * @see #getCurrentCart()
	 * @generated
	 */
	void setCurrentCart(Cart value);

} // CartManagement
