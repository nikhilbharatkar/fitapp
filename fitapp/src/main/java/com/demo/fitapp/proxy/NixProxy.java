package com.demo.fitapp.proxy;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.fitapp.beans.NixFoodBean;
import com.demo.fitapp.config.NixConfig;

@Component
public class NixProxy {
	private final NixConfig config;
	private final RestTemplate template;

	@Autowired
	public NixProxy(NixConfig config, RestTemplate template) {
		this.config = config;
		this.template = template;
	}
	
	public NixFoodBean.Food getNutritionalDetailsByFoodName(String foodName) {
		String request = String.format("%s%s?x-app-id=%s&x-app-key=%s",config.getBaseUrl(),"natural/nutrients" , config.getAppKey(), config.getAppId());
		Map<String, String> map = new HashMap<>();;
		map.put("locale", "en_US");
		map.put("query", foodName);
		
		HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(map);
		
		return template.exchange(request, HttpMethod.POST, requestEntity, NixFoodBean.class)
		        .getBody()
		        .getFoods()
		        .stream()
			    .findFirst()
			    .orElse(new NixFoodBean.Food());       
	}	
	
	static class Request {
		String query;
		String locale;
		public String getQuery() {
			return query;
		}
		public void setQuery(String query) {
			this.query = query;
		}
		public String getLocale() {
			return locale;
		}
		public void setLocale(String locale) {
			this.locale = locale;
		}
	}
}
