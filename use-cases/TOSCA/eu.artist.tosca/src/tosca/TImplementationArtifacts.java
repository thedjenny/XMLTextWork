/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImplementation Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TImplementationArtifacts#getImplementationArtifact <em>Implementation Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTImplementationArtifacts()
 * @model
 * @generated
 */
public interface TImplementationArtifacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Implementation Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.ImplementationArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Artifact</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTImplementationArtifacts_ImplementationArtifact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImplementationArtifactType> getImplementationArtifact();

} // TImplementationArtifacts
