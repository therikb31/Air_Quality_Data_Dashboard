package com.properties;

public class SQLQueries {
    public static final String RETRIEVE_GAS = "SELECT * FROM gas ORDER BY ID DESC LIMIT 6";
    public static final String RETRIEVE_LAST_GAS = "SELECT * FROM gas ORDER BY ID DESC LIMIT 1";
	public static final String INSERT_GAS = "INSERT INTO gas(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
}
