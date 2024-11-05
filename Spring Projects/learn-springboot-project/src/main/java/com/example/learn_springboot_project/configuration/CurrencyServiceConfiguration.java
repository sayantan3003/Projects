package com.example.learn_springboot_project.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

// Note- Do not create any constructor
@ConfigurationProperties(prefix = "currency-service")
@Service
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CurrencyServiceConfiguration [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}

/*
 * public record CurrencyServiceConfiguration(String url, String username,
 * String password) {
 * 
 * }
 */
