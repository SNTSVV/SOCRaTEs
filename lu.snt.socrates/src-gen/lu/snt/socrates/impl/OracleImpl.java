/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates.impl;

import lu.snt.socrates.ConstantsDefinition;
import lu.snt.socrates.Oracle;
import lu.snt.socrates.Requirement;
import lu.snt.socrates.Signalsdefinition;
import lu.snt.socrates.SocratesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oracle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getPath <em>Path</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getReqname <em>Reqname</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getSigndef <em>Signdef</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getConstantDefinitions <em>Constant Definitions</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.OracleImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OracleImpl extends MinimalEObjectImpl.Container implements Oracle
{
  /**
   * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected static final String MODEL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected String modelName = MODEL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getReqname() <em>Reqname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqname()
   * @generated
   * @ordered
   */
  protected static final String REQNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReqname() <em>Reqname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqname()
   * @generated
   * @ordered
   */
  protected String reqname = REQNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSigndef() <em>Signdef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigndef()
   * @generated
   * @ordered
   */
  protected Signalsdefinition signdef;

  /**
   * The cached value of the '{@link #getConstantDefinitions() <em>Constant Definitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantDefinitions()
   * @generated
   * @ordered
   */
  protected ConstantsDefinition constantDefinitions;

  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected Requirement requirement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OracleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SocratesPackage.Literals.ORACLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModelName()
  {
    return modelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModelName(String newModelName)
  {
    String oldModelName = modelName;
    modelName = newModelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__MODEL_NAME, oldModelName, modelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReqname()
  {
    return reqname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReqname(String newReqname)
  {
    String oldReqname = reqname;
    reqname = newReqname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__REQNAME, oldReqname, reqname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signalsdefinition getSigndef()
  {
    return signdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSigndef(Signalsdefinition newSigndef, NotificationChain msgs)
  {
    Signalsdefinition oldSigndef = signdef;
    signdef = newSigndef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__SIGNDEF, oldSigndef, newSigndef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSigndef(Signalsdefinition newSigndef)
  {
    if (newSigndef != signdef)
    {
      NotificationChain msgs = null;
      if (signdef != null)
        msgs = ((InternalEObject)signdef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__SIGNDEF, null, msgs);
      if (newSigndef != null)
        msgs = ((InternalEObject)newSigndef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__SIGNDEF, null, msgs);
      msgs = basicSetSigndef(newSigndef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__SIGNDEF, newSigndef, newSigndef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstantsDefinition getConstantDefinitions()
  {
    return constantDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantDefinitions(ConstantsDefinition newConstantDefinitions, NotificationChain msgs)
  {
    ConstantsDefinition oldConstantDefinitions = constantDefinitions;
    constantDefinitions = newConstantDefinitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__CONSTANT_DEFINITIONS, oldConstantDefinitions, newConstantDefinitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstantDefinitions(ConstantsDefinition newConstantDefinitions)
  {
    if (newConstantDefinitions != constantDefinitions)
    {
      NotificationChain msgs = null;
      if (constantDefinitions != null)
        msgs = ((InternalEObject)constantDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__CONSTANT_DEFINITIONS, null, msgs);
      if (newConstantDefinitions != null)
        msgs = ((InternalEObject)newConstantDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__CONSTANT_DEFINITIONS, null, msgs);
      msgs = basicSetConstantDefinitions(newConstantDefinitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__CONSTANT_DEFINITIONS, newConstantDefinitions, newConstantDefinitions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement getRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirement(Requirement newRequirement, NotificationChain msgs)
  {
    Requirement oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__REQUIREMENT, oldRequirement, newRequirement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequirement(Requirement newRequirement)
  {
    if (newRequirement != requirement)
    {
      NotificationChain msgs = null;
      if (requirement != null)
        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__REQUIREMENT, null, msgs);
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.ORACLE__REQUIREMENT, null, msgs);
      msgs = basicSetRequirement(newRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.ORACLE__REQUIREMENT, newRequirement, newRequirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SocratesPackage.ORACLE__SIGNDEF:
        return basicSetSigndef(null, msgs);
      case SocratesPackage.ORACLE__CONSTANT_DEFINITIONS:
        return basicSetConstantDefinitions(null, msgs);
      case SocratesPackage.ORACLE__REQUIREMENT:
        return basicSetRequirement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SocratesPackage.ORACLE__MODEL_NAME:
        return getModelName();
      case SocratesPackage.ORACLE__PATH:
        return getPath();
      case SocratesPackage.ORACLE__REQNAME:
        return getReqname();
      case SocratesPackage.ORACLE__SIGNDEF:
        return getSigndef();
      case SocratesPackage.ORACLE__CONSTANT_DEFINITIONS:
        return getConstantDefinitions();
      case SocratesPackage.ORACLE__REQUIREMENT:
        return getRequirement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocratesPackage.ORACLE__MODEL_NAME:
        setModelName((String)newValue);
        return;
      case SocratesPackage.ORACLE__PATH:
        setPath((String)newValue);
        return;
      case SocratesPackage.ORACLE__REQNAME:
        setReqname((String)newValue);
        return;
      case SocratesPackage.ORACLE__SIGNDEF:
        setSigndef((Signalsdefinition)newValue);
        return;
      case SocratesPackage.ORACLE__CONSTANT_DEFINITIONS:
        setConstantDefinitions((ConstantsDefinition)newValue);
        return;
      case SocratesPackage.ORACLE__REQUIREMENT:
        setRequirement((Requirement)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SocratesPackage.ORACLE__MODEL_NAME:
        setModelName(MODEL_NAME_EDEFAULT);
        return;
      case SocratesPackage.ORACLE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case SocratesPackage.ORACLE__REQNAME:
        setReqname(REQNAME_EDEFAULT);
        return;
      case SocratesPackage.ORACLE__SIGNDEF:
        setSigndef((Signalsdefinition)null);
        return;
      case SocratesPackage.ORACLE__CONSTANT_DEFINITIONS:
        setConstantDefinitions((ConstantsDefinition)null);
        return;
      case SocratesPackage.ORACLE__REQUIREMENT:
        setRequirement((Requirement)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SocratesPackage.ORACLE__MODEL_NAME:
        return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
      case SocratesPackage.ORACLE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case SocratesPackage.ORACLE__REQNAME:
        return REQNAME_EDEFAULT == null ? reqname != null : !REQNAME_EDEFAULT.equals(reqname);
      case SocratesPackage.ORACLE__SIGNDEF:
        return signdef != null;
      case SocratesPackage.ORACLE__CONSTANT_DEFINITIONS:
        return constantDefinitions != null;
      case SocratesPackage.ORACLE__REQUIREMENT:
        return requirement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (modelName: ");
    result.append(modelName);
    result.append(", path: ");
    result.append(path);
    result.append(", reqname: ");
    result.append(reqname);
    result.append(')');
    return result.toString();
  }

} //OracleImpl