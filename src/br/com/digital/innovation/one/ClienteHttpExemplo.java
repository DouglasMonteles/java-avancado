package br.com.digital.innovation.one;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ClienteHttpExemplo {
	
	static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
		
		@Override
		public Thread newThread(Runnable runnable) {
			Thread thread = new Thread(runnable);
			System.out.println("Nova Thread criada" + (thread.isDaemon() ? "deamon" : "") + " Thread Group: " + thread.getThreadGroup());
			return thread;
		}
	});

	public static void main(String[] args) throws IOException, InterruptedException {
		
		connect();
		connectAkanaiHttpClient();

	}
	
	private static void connectAkanaiHttpClient() {
		System.out.println("Running Http/1.1 exemple...");
		
		try {
			HttpClient client = HttpClient.newBuilder()
					.version(HttpClient.Version.HTTP_1_1)
					.proxy(ProxySelector.getDefault())
					.build();
			
			long start = System.currentTimeMillis();
			
			HttpRequest mainRequest = HttpRequest.newBuilder()
					.uri(URI.create("https://http2.akamai.com/demo/h2_demo.frame.html"))
					.build();
			
			HttpResponse<String> response = client.send(mainRequest, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Status code: " + response.statusCode());
			System.out.println("Response headers: " + response.headers());
			String responseBody = response.body();
			System.out.println("Response body: " + response.body());
			
			System.out.println(start);
			
			responseBody
					.lines()
					.filter(line -> line.trim().startsWith("<img height"))
					.map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
					.forEach(image -> System.out.println(image));;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void connect() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
				.build();
		
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Headers response: " + response.headers());
		System.out.println(response.body());
	}

}
