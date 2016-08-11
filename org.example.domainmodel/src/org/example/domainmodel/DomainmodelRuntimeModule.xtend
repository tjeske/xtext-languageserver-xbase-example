/*
 * generated by Xtext unknown
 */
package org.example.domainmodel

import org.eclipse.xtext.service.SingletonBinding
import org.example.domainmodel.validation.DomainmodelUniqueClassNameValidator

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DomainmodelRuntimeModule extends AbstractDomainmodelRuntimeModule {
	
	@SingletonBinding(eager = true)
	override bindUniqueClassNameValidator() {
		DomainmodelUniqueClassNameValidator
	}

}
