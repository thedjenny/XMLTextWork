package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.EClassReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OclExtractor;
import java.io.File;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class OCL2ScopeGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    final String ecorePackageName = "at.ac.tuwien.big.forms";
    final String packageName = (ecorePackageName + ".form.scoping");
    final String validatorPackage = (ecorePackageName + ".form.validation.ocl");
    final Map<EClassReference, Map<EClass, Set<String>>> referencesToConstraintsMap = OclExtractor.getScopingOCLExpressions(resource);
    final String fileName = "FormScopeProviderBase";
    String _replaceAll = packageName.replaceAll("\\.", "\\/");
    String _plus = (_replaceAll + "/");
    String _plus_1 = (_plus + fileName);
    String _plus_2 = (_plus_1 + ".java");
    final File file = new File(_plus_2);
    String _string = file.toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EReference;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.resource.IEObjectDescription;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.scoping.IScope;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.scoping.Scopes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(fileName);
    _builder.append(" extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final Map<String, Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>>> map = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>> referencesMap;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>> eClassesMap;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>> evaluators;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Set<Map.Entry<EClassReference, Map<EClass, Set<String>>>> _entrySet = referencesToConstraintsMap.entrySet();
      for(final Map.Entry<EClassReference, Map<EClass, Set<String>>> entry : _entrySet) {
        _builder.append("\t\t");
        _builder.append("referencesMap = map.computeIfAbsent(\"");
        String _name = entry.getKey().getEClass().getName();
        _builder.append(_name, "\t\t");
        _builder.append("\", key -> new HashMap<>());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("eClassesMap = referencesMap.computeIfAbsent(\"");
        String _name_1 = entry.getKey().getEReference().getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("\", key -> new HashMap<>());");
        _builder.newLineIfNotEmpty();
        {
          Set<Map.Entry<EClass, Set<String>>> _entrySet_1 = entry.getValue().entrySet();
          for(final Map.Entry<EClass, Set<String>> relevantEntry : _entrySet_1) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("evaluators = eClassesMap.computeIfAbsent(\"");
            String _name_2 = relevantEntry.getKey().getName();
            _builder.append(_name_2, "\t\t\t");
            _builder.append("\", key -> new HashSet<>());");
            _builder.newLineIfNotEmpty();
            {
              Set<String> _value = relevantEntry.getValue();
              for(final String constraintName : _value) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("evaluators.add(");
                _builder.append(validatorPackage, "\t\t\t\t");
                _builder.append(".");
                _builder.append(constraintName, "\t\t\t\t");
                _builder.append("BooleanExpressionEvaluator.INSTANCE);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IScope getScope(EObject context, EReference reference) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IScope scope = super.getScope(context, reference);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Workaround by Bill");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("StackTraceElement[] els = new Exception().getStackTrace();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < els.length; ++i) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (\"resolveLazyCrossReferences\".equals(els[i].getMethodName())) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return scope;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>> referencesMap;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>> eClassesMap;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>> evaluators;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("referencesMap = map.get(context.eClass().getName());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (referencesMap != null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("eClassesMap = referencesMap.get(reference.getName());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (eClassesMap != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("java.util.List<java.util.Map.Entry<EObject, at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[]>> parents = new java.util.ArrayList<>();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("EObject currentObject = context;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("while (currentObject != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("evaluators = eClassesMap.get(currentObject.eClass().getName());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (evaluators != null && !evaluators.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("parents.add(new java.util.AbstractMap.SimpleEntry<>(currentObject, evaluators.toArray(new at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[evaluators.size()])));");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("currentObject = currentObject.eContainer();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (!parents.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("java.util.Iterator<IEObjectDescription> iter = scope.getAllElements().iterator();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("java.util.List<EObject> results = new ArrayList<EObject>();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("final Object original = context.eGet(reference, false);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("final boolean deliver = context.eDeliver();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("context.eSetDeliver(false);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("// Mutate and check validations");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("while (iter.hasNext()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("final IEObjectDescription oDesc = iter.next();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("context.eSet(reference, original);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("final EObject o = org.eclipse.emf.ecore.util.EcoreUtil.resolve(oDesc.getEObjectOrProxy(), context);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("context.eSet(reference, o);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("PARENTS: for (java.util.Map.Entry<EObject, at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[]> entry : parents) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("final EObject parent = entry.getKey();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("for (at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator evaluator : entry.getValue()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("if (!evaluator.isValid(parent)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("break PARENTS;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("results.add(o);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("context.eSet(reference, original);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("context.eSetDeliver(deliver);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Avoid filtering out all elements and instead deliver the original scope");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (results.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("return scope;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("return Scopes.scopeFor(results);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return scope;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_string, _builder);
  }
}