package com.github.ipan97.hello;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class MariaDBTest {
	private static void testDB() throws SQLException{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:3304/pos");
		dataSource.setUsername("root");
		dataSource.setPassword("d");
		System.out.println("Sukses");

	}

	public static void main(String[] args) {
		System.out.println("Start test Mariadb");
		try {
			testDB();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
