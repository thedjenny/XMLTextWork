package at.ac.tuwien.big.xtext.equalizer.impl;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;

public class XtextModelCorrespondance implements ModelCorrespondance {
	
	private Resource res;
	
	public XtextModelCorrespondance(Resource res) {
		this.res = res;
	}

	@Override
	public EObject getModelObject(EObject xtext) {
		// TODO Auto-generated method stub
		return asdfnull;
	}

	@Override
	public EObject getXtextObject(EObject modelObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public void refresh() {
		
	}

}
