package com.test.eap.statistics;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class Stats {
	public static void main(String[] args) {
		String url = "";
		if (args.length > 0) {
			url = args[0];
		}

		String username = "";
		if (args.length > 1) {
			username = args[1];
		}

		String password = "";
		if (args.length > 2) {
			password = args[2];
		}

		Adapter adapter = new Adapter();
		adapter.initialize(username, password);

		try {
			Summary summary = adapter.getResource(url, new StatsHandler());
			System.out.println(summary);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
