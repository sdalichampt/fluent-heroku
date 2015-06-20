package fr.dalichampt.fluentheroku;

import net.codestory.http.WebServer;

public class Application {

	public static void main(String[] args) {
		new WebServer().configure(routes -> routes.get("/", "Hello World")).start();
	}
}
