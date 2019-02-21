package org.example.domainmodel.ide
 
//import com.google.inject.Guice
//import io.typefox.lsapi.services.json.MessageJsonHandler
//import io.typefox.lsapi.services.json.StreamMessageReader
//import io.typefox.lsapi.services.json.StreamMessageWriter
//import io.typefox.lsapi.services.transport.io.ConcurrentMessageReader
//import io.typefox.lsapi.services.transport.server.LanguageServerEndpoint
//import java.io.ByteArrayInputStream
//import java.io.ByteArrayOutputStream
//import java.io.FileOutputStream
//import java.io.InputStream
//import java.io.OutputStream
//import java.io.PrintStream
//import java.sql.Timestamp
//import java.util.concurrent.Executors
//import javax.inject.Inject
//import org.eclipse.xtext.ide.server.LanguageServerImpl
//import java.io.File
import com.google.inject.Guice
import com.google.inject.Inject
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream
import java.io.PrintWriter
import java.sql.Timestamp
import org.eclipse.lsp4j.jsonrpc.Launcher
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.ServerModule
import org.eclipse.xtext.ide.server.ServerLauncher

class RunEmbeddedServer extends org.eclipse.xtext.ide.server.ServerLauncher {
	
    private static boolean IS_DEBUG = false
 
 	def static void main(String[] args) {
		launch(ServerLauncher.name, args, new ServerModule, new CustomServerModule)
	}
//    def static void main(String[] args) {
//        IS_DEBUG = args.exists[it == 'debug']
//        val stdin = System.in
//        val stdout = System.out
//        redirectStandardStreams()
//        val launcher = Guice.createInjector(new CustomServerModule).getInstance(RunEmbeddedServer)
//        launcher.start(stdin, stdout)
//    }
// 
//    @Inject LanguageServerImpl languageServer
// 
//    def void start(InputStream in, OutputStream out) {
//        System.err.println("Starting Xtext Language Server.")
//        val messageAcceptor2 = new LanguageServerEndpoint(languageServer, Executors.newCachedThreadPool)
//        val MessageJsonHandler handler = new MessageJsonHandler()
//        val reader = new ConcurrentMessageReader(new StreamMessageReader(in, handler), Executors.newCachedThreadPool)
//        val writer = new StreamMessageWriter(out, handler)
//        messageAcceptor2.connect(reader, writer)
//        System.err.println("started.")
//        reader.join
//        while (true) {
//            Thread.sleep(10_000l)
//        }
//    }
// 
//    def static redirectStandardStreams() {
//        System.err.println(new File(".").absoluteFile.toPath)
//        System.setIn(new ByteArrayInputStream(newByteArrayOfSize(0)))
//        val id = RunEmbeddedServer.name + "-" + new Timestamp(System.currentTimeMillis)
//        if (IS_DEBUG) {
//            val stdFileOut = new FileOutputStream("out-" + id + ".log")
//            System.setOut(new PrintStream(stdFileOut))
//            val stdFileErr = new FileOutputStream("error-" + id + ".log")
//            System.setErr(new PrintStream(stdFileErr))
//        } else {
//            System.setOut(new PrintStream(new ByteArrayOutputStream()))
//            System.setErr(new PrintStream(new ByteArrayOutputStream()))
//        }
//    }
     
}