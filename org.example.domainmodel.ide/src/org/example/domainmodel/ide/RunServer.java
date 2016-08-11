package org.example.domainmodel.ide;

import java.net.InetSocketAddress;

import org.eclipse.xtext.ide.server.ProjectManager;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.util.IFileSystemScanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import io.typefox.lsapi.services.LanguageServer;
import io.typefox.lsapi.services.launch.LanguageServerLauncher;

public class RunServer {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ServerModule() {
			@Override
			protected void configure() {
				super.configure();
				bind(ProjectManager.class).to(XbaseProjectManager.class);
				bind(IFileSystemScanner.class).to(XbaseJavaIoFileSystemScanner.class);
			}
		});
		LanguageServer languageServer = injector.getInstance(LanguageServer.class);
		LanguageServerLauncher launcher = LanguageServerLauncher.newLoggingLauncher(languageServer,
				new InetSocketAddress("localhost", 5007));
		launcher.launch();
	}

}
