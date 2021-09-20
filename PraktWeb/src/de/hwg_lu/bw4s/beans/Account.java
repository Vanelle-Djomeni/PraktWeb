package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class Account {

	String userid;
	String password;
	String active;
	String username;
	String email;
	
	// Ein Acoount-Objekt steht jeweils für einen Account-Datensatz aus der Tabelle
	// Die Klasse Account ist keine Bean!!! Kein Konstruktor ohne Parameter
	// Account kann nicht in <jsp:useBean id="" class="" scope="" /> verwendet werdem
	public Account(String userid, String password, String active, String username, String email) {
		super();
		this.userid = userid;
		this.password = password;
		this.active = active;
		this.username = username;
		this.email = email;
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
