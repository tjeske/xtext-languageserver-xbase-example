package org.example.domainmodel.ide;

import java.net.InetSocketAddress;

import com.google.inject.Guice;
import com.google.inject.Injector;

import io.typefox.lsapi.services.LanguageServer;
import io.typefox.lsapi.services.launch.LanguageServerLauncher;

public class RunServer {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CustomServerModule());
		LanguageServer languageServer = injector.getInstance(LanguageServer.class);
		LanguageServerLauncher launcher = LanguageServerLauncher.newLoggingLauncher(languageServer,
				new InetSocketAddress("localhost", 5007));
		launcher.launch();
	}

}
