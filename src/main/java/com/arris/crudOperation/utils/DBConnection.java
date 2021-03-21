package com.arris.crudOperation.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnection {
	private static final Logger LOGGER = LoggerFactory.getLogger(DBConnection.class);

	static int count = 0;
	private static DBConnection instance = null;

	@Value("${database.url}")
	private String url;

	@Value("${database.driver}")
	private String driver;

	@Value("${database.user}")
	private String username;

	@Value("${database.password}")
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
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

	private DBConnection() {
		count++;
		instance = this;
	}

	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}

		// LOGGER.info("Value of instance after DBConnection() in getInstance()-
		// "+instance);
		return instance;
	}

	public Connection getConnection() {
		try {
			Class.forName(driver);
			Connection lCon = DriverManager.getConnection(url, username, password);
			// LOGGER.info("Connection Object: "+lCon);
			return lCon;

		} catch (SQLException e) {
			LOGGER.error("SQLException: " + e);
			return null;

		} catch (ClassNotFoundException e) {
			LOGGER.error("ClassNotFoundException: " + e);
			return null;

		}
	}
}
