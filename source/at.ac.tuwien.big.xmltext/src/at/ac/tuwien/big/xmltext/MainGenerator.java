package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import mypackage.Settings;
import mypackage.XsdToXtextGenerator;

public class MainGenerator {
	{
	}

	
	private static void testLibrary3Example() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd(XsdToXtextGenerator.XSD_FILE_NAME);
		Resource xsdResource = transformer.getResult();
		EcoreToGenericEcoreTransformer simplifiedTransformer = new EcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename(XsdToXtextGenerator.ECORE_FILE_NAME);
		simplifiedTransformer.setXsdEcore(xsdResource);
		Resource ecoreResource = simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		Resource complexXmi = transformer.loadXmlAsXmi("examples/library3.xml");
		transformer.saveInstance(complexXmi, "examples/library3complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/library3.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/library3simpl.xmi");
			serializer.writeOutput(simplifiedXmi, "examples/library3simpl.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
	/*private static void testEClassBasicExample90() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/eclassXML/dictionary.xsd");
		Resource xsdResource = transformer.getResult();
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/dictionarySimple");
		simplifiedTransformer.addXsdEcore("examples/eclassXML/dictionary.xsd");
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.getResult();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/eclassXML/eClass9_1_BASIC_EN_SG_90.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/eclassXML/eClass9_1_BASIC_EN_SG_90_simple.xmi");			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
	private static void testEClassBasicExample27() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/eclassXML/dictionary.xsd");
		Resource xsdResource = transformer.getResult();
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/dictionarySimple");
		simplifiedTransformer.addXsdEcore("examples/eclassXML/dictionary.xsd");
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.getResult();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/eclassXML/eClass9_1_BASIC_EN_SG_27_cleaned.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/eclassXML/eClass9_1_BASIC_EN_SG_27_cleaned_simple2.xmi");			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
	private static void testNamespace() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/namespaceExample.xsd");
		Resource xsdResource = transformer.getResult();
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/namespaceExampleSimple");
		simplifiedTransformer.addXsdEcore("examples/namespaceExample.xsd");
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.getResult();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/namespaceExample.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/namespaceExample_simple.xmi");			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}*/
	
	public static void main(String[] args) {
		testLibrary3Example();
	/*	testEClassBasicExample90();
		testEClassBasicExample27();
		testNamespace();*/
	}
}
