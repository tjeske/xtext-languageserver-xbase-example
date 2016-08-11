package org.example.domainmodel.ide;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ide.server.ProjectManager;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.impl.ProjectDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.workspace.IProjectConfig;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

import com.google.inject.Provider;

public class XbaseProjectManager extends ProjectManager {
	
	private URLClassLoader classpathURIContext;

	@Override
	public void initialize(ProjectDescription description, IProjectConfig projectConfig,
			Procedure2<? super URI, ? super Iterable<Issue>> acceptor,
			IExternalContentProvider openedDocumentsContentProvider,
			Provider<Map<String, ResourceDescriptionsData>> indexProvider, CancelIndicator cancelIndicator) {
		super.initialize(description, projectConfig, acceptor, openedDocumentsContentProvider, indexProvider, cancelIndicator);
		List<URL> urls = new ArrayList<>();
		
		try {
			urls.add(new URL("file:///Users/dietrich/.gradle/caches/modules-2/files-2.1/org.eclipse.xtext/org.eclipse.xtext.xbase.lib/2.11.0-SNAPSHOT/1cf846eca597abc8581e9a9443212f9f5d135589/org.eclipse.xtext.xbase.lib-2.11.0-SNAPSHOT.jar"));
			urls.add(new URL("file:///Users/dietrich/.gradle/caches/modules-2/files-2.1/org.eclipse.xtend/org.eclipse.xtend.lib.macro/2.11.0-SNAPSHOT/81277af86cc72635a16f0017f3e3ed65194dc4c3/org.eclipse.xtend.lib.macro-2.11.0-SNAPSHOT.jar"));
			urls.add(new URL("file:///Users/dietrich/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/18.0/cce0823396aa693798f8882e64213b1772032b09/guava-18.0.jar"));
			urls.add(new URL("file:///Users/dietrich/.gradle/caches/modules-2/files-2.1/com.google.inject/guice/3.0/9d84f15fe35e2c716a02979fb62f50a29f38aefa/guice-3.0.jar"));
			urls.add(new URL("file:///Users/dietrich/.gradle/caches/modules-2/files-2.1/javax.inject/javax.inject/1/6975da39a7040257bd51d21a231b76c915872d38/javax.inject-1.jar"));
		} catch (MalformedURLException e) {
			//TODO
		}
		
		
		classpathURIContext = new URLClassLoader(urls.toArray(new URL[urls.size()]), null);
	}
	
	@Override
	protected XtextResourceSet createFreshResourceSet(ResourceDescriptionsData newIndex) {
		// TODO Auto-generated method stub
		XtextResourceSet resourceSet = super.createFreshResourceSet(newIndex);
		resourceSet.setClasspathURIContext(classpathURIContext);
		return resourceSet;
	}

}
