package de.hwg_lu.bw4s.beans;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class AccountBean {

	String userid;
	String password;
	String active;
	String username;
	String email;
	
	Connection dbConn;
		
	public AccountBean() {
//		this.dbConn = new PostgreSQLAccess().getConnection();
		this.userid = "";
		this.password = "";
		this.active = "";
		this.username = "";
		this.email = "";
	}
	
	public boolean insertAccountIfNotExists() throws SQLException {
		//true = Datensatz exxistierte noch nicht ud wurde geschrieben
		//false = Datensatz existierte schon und wurde nicht geschrieben
		this.prepareAttritutesForDB();
		
		// esrt prüfen, ob existiert
		// wenn ja , dann return false
		// wenn nein, dann insert ohne weitere Prüfung und return true
	
		boolean accountExists= this.checkAccountExists();
		if (accountExists) return false;
		else {
			this.insertAccountNoCheck();
			return true;
		}
	}
	
	public boolean checkAccountExists2() throws SQLException {
		// true= this.userid wurde gefunden
		// false= this.userid wurden nicht gefunden
		String sql = "select count(*) from account where userid = ?";
		this.dbConn = new PostgreSQLAccess().getConnection();
		PreparedStatement prep= this.dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		ResultSet dbRes = prep.executeQuery();
		// dbRes enthält 1 Zeile, 1 Spalte mit Inhalt 0 oder 1
//		boolean gefunden= false;
//	    dbRes.next();
//		int anzLines = dbRes.getInt(1);
//		if (anzLines > 0) gefunden=true;
//		return gefunden;
		dbRes.next();
		return(dbRes.getInt(0) > 0);
	}
	
	
	
	public boolean checkAccountExists1() throws SQLException {
		// true= this.userid wurde gefunden
		// false= this.userid wurden nicht gefunden
		String sql = "select userid from account" ;
		this.dbConn = new PostgreSQLAccess().getConnection();
		PreparedStatement prep= this.dbConn.prepareStatement(sql);
		//prep.setString(1, this.userid); ON A PA BESOIN DE CA; CA DONNE UN FEHLER
		ResultSet dbRes = prep.executeQuery();
		boolean gefunden = false;
		while (dbRes.next()) {
			String currentUserid= dbRes.getString("userid").trim()	;
			if  (currentUserid.equals(this.userid)) {
				gefunden= true;
				break; // IMPORTANT
			}
			
		}
		return gefunden;
	}
	
	public boolean checkAccountExists() throws SQLException {
		// true= this.userid wurde gefunden
		// false= this.userid wurden nicht gefunden
		String sql = "select userid from account where userid = ?";
		this.dbConn = new PostgreSQLAccess().getConnection();
		PreparedStatement prep= this.dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		ResultSet dbRes = prep.executeQuery();
		boolean gefunden = dbRes.next();
		return gefunden;
	}
	
	public void prepareAttritutesForDB() {
		if(this.userid == null) this.userid = "";
		if(this.password == null) this.password = "";
		if(this.username == null) this.username = "";
		if(this.email == null) this.email = "";
		if(this.active == null) this.active = "";
		
		// Wir schneiden ab, in der Praxis würde man eine Exception werfen
		if(this.userid.length() > 16) this.userid = this.userid.substring(0, 16);
		if(this.password.length() > 32) this.password = this.password.substring(0, 32);
		if(this.username.length() > 256) this.username = this.username.substring(0, 256);
		if(this.email.length() > 256) this.email = this.email.substring(0, 256);
		if(this.active.toLowerCase().equals("yes") ||
				this.active.equalsIgnoreCase("y") || 
				this.active.equals("ja") ||
				this.active.equals("j")) this.active="Y";
				else this.active="N";
	}
	
	public void insertAccountNoCheck() throws SQLException {
		String sql= "insert into account (userid, password, active, username, email) "
				+ " values(?, ?, ?, ?, ?)";
		this.dbConn= new PostgreSQLAccess().getConnection();
		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		prep.setString(2, this.password);
		prep.setString(3, this.active);
		prep.setString(5, this.username);
		prep.setString(6, this.email);
		prep.executeUpdate();
		System.out.println("Account " + this.userid + " erfolgreich angelegt");
	
		
	}
	
	public String toString(){
		String s = "AccountBean mit ";
				s+= "userid: "   + this.getUserid() + ", ";
				s+= "password: " + this.getPassword() + ", ";
				s+= "active: "   + this.getActive() + ", ";
				s+= "username: " + this.getUsername() + ", ";
				s+= "email: "    + this.getEmail();				
		return s;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
