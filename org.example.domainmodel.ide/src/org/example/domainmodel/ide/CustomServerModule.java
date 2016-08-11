package org.example.domainmodel.ide;

import org.eclipse.xtext.ide.server.ProjectManager;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.util.IFileSystemScanner;

public final class CustomServerModule extends ServerModule {
	@Override
	protected void configure() {
		super.configure();
		bind(ProjectManager.class).to(XbaseProjectManager.class);
		bind(IFileSystemScanner.class).to(XbaseJavaIoFileSystemScanner.class);
	}
}