package com.bims.sb;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PriceProxy extends RestTemplate {

	@Value("${price.service.url}")
	private String priceUrl;

	public String getQuote() {

		URI uri;
		try {
			uri = new URI(priceUrl);

			ResponseEntity<String> result = this.getForEntity(uri, String.class);

			if (result != null) {
				return result.getBody();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Exception in price" + e.getMessage();
		}
		return "No result";

	}

}
