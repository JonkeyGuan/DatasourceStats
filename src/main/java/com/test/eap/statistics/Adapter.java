package com.test.eap.statistics;

import java.io.IOException;
import java.net.URL;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;

public class Adapter {

	private String username;
	private String password;

	public void initialize(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public <T> T getResource(String requestsUrl, ResponseHandler<T> handler)
			throws ClientProtocolException, IOException {
		T result = null;

		URL url = new URL(requestsUrl);
		HttpHost targetHost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
		HttpClient httpClient = HttpClients.createDefault();
		HttpClientContext context = HttpClientContext.create();

		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
		AuthCache authCache = new BasicAuthCache();
		DigestScheme digestScheme = new DigestScheme();
		digestScheme.overrideParamter("realm", "");
		digestScheme.overrideParamter("nonce", "");
		authCache.put(targetHost, digestScheme);

		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);

		HttpGet httpGet = new HttpGet(requestsUrl);

		System.out.println("Executing request " + httpGet.getRequestLine());

		result = httpClient.execute(targetHost, httpGet, handler, context);

		return result;
	}

}
