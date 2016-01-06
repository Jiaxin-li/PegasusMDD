/**
 */
package RootElement.Task.impl;

import RootElement.Account.StaffAccount;

import RootElement.Task.Task;
import RootElement.Task.TaskManagement;
import RootElement.Task.TaskPackage;

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
 * An implementation of the model object '<em><b>Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Task.impl.TaskManagementImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link RootElement.Task.impl.TaskManagementImpl#getTaskList <em>Task List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskManagementImpl extends MinimalEObjectImpl.Container implements TaskManagement {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected StaffAccount staff;

	/**
	 * The cached value of the '{@link #getTaskList() <em>Task List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskList()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TASK_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccount getStaff() {
		if (staff != null && staff.eIsProxy()) {
			InternalEObject oldStaff = (InternalEObject)staff;
			staff = (StaffAccount)eResolveProxy(oldStaff);
			if (staff != oldStaff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_MANAGEMENT__STAFF, oldStaff, staff));
			}
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccount basicGetStaff() {
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaff(StaffAccount newStaff) {
		StaffAccount oldStaff = staff;
		staff = newStaff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_MANAGEMENT__STAFF, oldStaff, staff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTaskList() {
		if (taskList == null) {
			taskList = new EObjectResolvingEList<Task>(Task.class, this, TaskPackage.TASK_MANAGEMENT__TASK_LIST);
		}
		return taskList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTask(Task t) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeTask(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.TASK_MANAGEMENT__STAFF:
				if (resolve) return getStaff();
				return basicGetStaff();
			case TaskPackage.TASK_MANAGEMENT__TASK_LIST:
				return getTaskList();
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
			case TaskPackage.TASK_MANAGEMENT__STAFF:
				setStaff((StaffAccount)newValue);
				return;
			case TaskPackage.TASK_MANAGEMENT__TASK_LIST:
				getTaskList().clear();
				getTaskList().addAll((Collection<? extends Task>)newValue);
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
			case TaskPackage.TASK_MANAGEMENT__STAFF:
				setStaff((StaffAccount)null);
				return;
			case TaskPackage.TASK_MANAGEMENT__TASK_LIST:
				getTaskList().clear();
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
			case TaskPackage.TASK_MANAGEMENT__STAFF:
				return staff != null;
			case TaskPackage.TASK_MANAGEMENT__TASK_LIST:
				return taskList != null && !taskList.isEmpty();
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
			case TaskPackage.TASK_MANAGEMENT___ADD_TASK__TASK:
				addTask((Task)arguments.get(0));
				return null;
			case TaskPackage.TASK_MANAGEMENT___REMOVE_TASK__INT:
				return removeTask((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskManagementImpl
