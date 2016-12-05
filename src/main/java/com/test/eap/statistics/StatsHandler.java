package com.test.eap.statistics;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StatsHandler implements ResponseHandler<Summary> {

	public Summary handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
		StatusLine statusLine = response.getStatusLine();
		HttpEntity entity = response.getEntity();
		if (statusLine.getStatusCode() >= 300) {
			throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
		}
		if (entity == null) {
			throw new ClientProtocolException("Response contains no content");
		}

		System.out.println(response.getStatusLine());
		String content = EntityUtils.toString(entity);

		Gson gson = new GsonBuilder().create();
		return gson.fromJson(content, Summary.class);
	}

}
