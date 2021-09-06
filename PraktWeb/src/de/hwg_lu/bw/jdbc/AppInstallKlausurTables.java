package de.hwg_lu.bw.jdbc;

import java.sql.*;

public class AppInstallKlausurTables {
	
	PostgreSQLAccess myPGA;
	Connection dbConn;
	String matrikelnr;

	public AppInstallKlausurTables()  throws SQLException {
		this.myPGA = new PostgreSQLAccess();
		this.dbConn = myPGA.getConnection();
		
		String mySchema = myPGA.dbSchema;
		this.matrikelnr = myPGA.dbSchema.substring(mySchema.length() - 6);
		System.out.println(this.matrikelnr);
	}

	public static void main(String[] args)  throws SQLException {
		new AppInstallKlausurTables().doSomething();
	}
	public void doSomething()  throws SQLException {
		this.dropTables();
		this.createTables();
		this.insertTable();
	}
	public void dropTables() throws SQLException {
		String sql;
		sql = "drop table if exists zubehoer" + "_" + this.matrikelnr;
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Tabelle Zubehoer gedropped");
		sql = "drop table if exists warenkorb" + "_" + this.matrikelnr;
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Tabelle Warenkorb gedropped");
	}
	public void createTables() throws SQLException {
		String sql;
		sql = "create table zubehoer" + "_" + this.matrikelnr + " ( "
						+ "zubehoer varchar(256) not null        , "
						+ "pflanze  varchar(256) not null        ,"
						+ "primary key (zubehoer, pflanze)        )";
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Tabelle Zubehoer angelegt");
		sql = "create table warenkorb" + "_" + this.matrikelnr + " ( "
				+ "zubehoer varchar(256) not null primary key"
				+ ")";
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Tabelle Warenkorb angelegt");
	}
	public void insertTable() throws SQLException {
		String sql = "insert into zubehoer" + "_" + this.matrikelnr
				+ " (zubehoer, pflanze) values"
				+ "('Beerenduenger',      'Erdbeerpflanze')     , "
				+ "('Vogelschutznetz',    'Erdbeerpflanze')     , "
				+ "('Balkonkasten',       'Erdbeerpflanze')     , "

				+ "('Pflanzkuebel',       'Harlekinweide')      , "
				+ "('Gartenschere',       'Harlekinweide')      , "
				+ "('Gartenhandschuhe',   'Harlekinweide')      , "

				+ "('Beerenduenger',      'Heidelbeerpflanze')  , "
				+ "('Pflanzkuebel',       'Heidelbeerpflanze')  , "
				+ "('Untersetzer',        'Heidelbeerpflanze')  , "

				+ "('Carnivorenduenger',  'Venusfliegenfalle')  , "
				+ "('Carnivorenerde',     'Venusfliegenfalle')  , "
				+ "('Balkonkasten',       'Venusfliegenfalle')  , "

				+ "('Palmenerde',         'Zimmerpalme')        , "
				+ "('Bewaesserungsmatte', 'Zimmerpalme')        , "
				+ "('Gartenschere',       'Zimmerpalme')          ";
		
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Datensätze eingetragen");
	}

	
	
	
	
	
	

	

}
