/**
 */
package RootElement.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.Task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Task.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = RootElement.Task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Task.impl.TaskManagementImpl <em>Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Task.impl.TaskManagementImpl
	 * @see RootElement.Task.impl.TaskPackageImpl#getTaskManagement()
	 * @generated
	 */
	int TASK_MANAGEMENT = 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT__STAFF = 0;

	/**
	 * The feature id for the '<em><b>Task List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT__TASK_LIST = 1;

	/**
	 * The number of structural features of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT___ADD_TASK__TASK = 0;

	/**
	 * The operation id for the '<em>Remove Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT___REMOVE_TASK__INT = 1;

	/**
	 * The number of operations of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MANAGEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Task.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Task.impl.TaskImpl
	 * @see RootElement.Task.impl.TaskPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_ID = 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link RootElement.Task.TaskManagement <em>Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management</em>'.
	 * @see RootElement.Task.TaskManagement
	 * @generated
	 */
	EClass getTaskManagement();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Task.TaskManagement#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Staff</em>'.
	 * @see RootElement.Task.TaskManagement#getStaff()
	 * @see #getTaskManagement()
	 * @generated
	 */
	EReference getTaskManagement_Staff();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Task.TaskManagement#getTaskList <em>Task List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task List</em>'.
	 * @see RootElement.Task.TaskManagement#getTaskList()
	 * @see #getTaskManagement()
	 * @generated
	 */
	EReference getTaskManagement_TaskList();

	/**
	 * Returns the meta object for the '{@link RootElement.Task.TaskManagement#addTask(RootElement.Task.Task) <em>Add Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Task</em>' operation.
	 * @see RootElement.Task.TaskManagement#addTask(RootElement.Task.Task)
	 * @generated
	 */
	EOperation getTaskManagement__AddTask__Task();

	/**
	 * Returns the meta object for the '{@link RootElement.Task.TaskManagement#removeTask(int) <em>Remove Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Task</em>' operation.
	 * @see RootElement.Task.TaskManagement#removeTask(int)
	 * @generated
	 */
	EOperation getTaskManagement__RemoveTask__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see RootElement.Task.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Task.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see RootElement.Task.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Task.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RootElement.Task.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the '{@link RootElement.Task.Task#setDescription() <em>Set Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Description</em>' operation.
	 * @see RootElement.Task.Task#setDescription()
	 * @generated
	 */
	EOperation getTask__SetDescription();

	/**
	 * Returns the meta object for the '{@link RootElement.Task.Task#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see RootElement.Task.Task#getID()
	 * @generated
	 */
	EOperation getTask__GetID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.Task.impl.TaskManagementImpl <em>Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Task.impl.TaskManagementImpl
		 * @see RootElement.Task.impl.TaskPackageImpl#getTaskManagement()
		 * @generated
		 */
		EClass TASK_MANAGEMENT = eINSTANCE.getTaskManagement();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MANAGEMENT__STAFF = eINSTANCE.getTaskManagement_Staff();

		/**
		 * The meta object literal for the '<em><b>Task List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MANAGEMENT__TASK_LIST = eINSTANCE.getTaskManagement_TaskList();

		/**
		 * The meta object literal for the '<em><b>Add Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_MANAGEMENT___ADD_TASK__TASK = eINSTANCE.getTaskManagement__AddTask__Task();

		/**
		 * The meta object literal for the '<em><b>Remove Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_MANAGEMENT___REMOVE_TASK__INT = eINSTANCE.getTaskManagement__RemoveTask__int();

		/**
		 * The meta object literal for the '{@link RootElement.Task.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Task.impl.TaskImpl
		 * @see RootElement.Task.impl.TaskPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Set Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_DESCRIPTION = eINSTANCE.getTask__SetDescription();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_ID = eINSTANCE.getTask__GetID();

	}

} //TaskPackage
