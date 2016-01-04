/**
 */
package RootElement.Booking.impl;

import RootElement.Booking.BookingPackage;
import RootElement.Booking.Cart;
import RootElement.Booking.CartManagement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link RootElement.Booking.impl.CartManagementImpl#getCart <em>Cart</em>}</li>
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
	 * The cached value of the '{@link #getCart() <em>Cart</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCart()
	 * @generated
	 * @ordered
	 */
	protected EList<Cart> cart;

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
	public EList<Cart> getCart() {
		if (cart == null) {
			cart = new EObjectResolvingEList<Cart>(Cart.class, this, BookingPackage.CART_MANAGEMENT__CART);
		}
		return cart;
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
			case BookingPackage.CART_MANAGEMENT__CART:
				return getCart();
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
			case BookingPackage.CART_MANAGEMENT__CART:
				getCart().clear();
				getCart().addAll((Collection<? extends Cart>)newValue);
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
			case BookingPackage.CART_MANAGEMENT__CART:
				getCart().clear();
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
			case BookingPackage.CART_MANAGEMENT__CART:
				return cart != null && !cart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CartManagementImpl
