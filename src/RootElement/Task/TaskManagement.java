/**
 */
package RootElement.Task;

import RootElement.Account.StaffAccount;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Task.TaskManagement#getStaff <em>Staff</em>}</li>
 *   <li>{@link RootElement.Task.TaskManagement#getTaskList <em>Task List</em>}</li>
 * </ul>
 *
 * @see RootElement.Task.TaskPackage#getTaskManagement()
 * @model
 * @generated
 */
public interface TaskManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference.
	 * @see #setStaff(StaffAccount)
	 * @see RootElement.Task.TaskPackage#getTaskManagement_Staff()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffAccount getStaff();

	/**
	 * Sets the value of the '{@link RootElement.Task.TaskManagement#getStaff <em>Staff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff</em>' reference.
	 * @see #getStaff()
	 * @generated
	 */
	void setStaff(StaffAccount value);

	/**
	 * Returns the value of the '<em><b>Task List</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task List</em>' reference list.
	 * @see RootElement.Task.TaskPackage#getTaskManagement_TaskList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Task> getTaskList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tRequired="true" tOrdered="false"
	 * @generated
	 */
	void addTask(Task t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	boolean removeTask(int id);

} // TaskManagement
