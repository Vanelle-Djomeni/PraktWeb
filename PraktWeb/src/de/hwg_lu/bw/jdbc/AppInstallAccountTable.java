package de.hwg_lu.bw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppInstallAccountTable {
	
	Connection dbConn;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AppInstallAccountTable myApplication = new AppInstallAccountTable();
		myApplication.dbConn = new PostgreSQLAccess().getConnection();
		myApplication.doSomething();
	}
	
//	public void createConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("org.postgresql.Driver");
//		System.out.println("JDBC-Treiberklasse geladen");
//		this.dbConn = DriverManager.getConnection("jdbc:postgresql://143.93.200.243:5432/BWUEBDB",
//									"user1",
//									"pgusers"
//									);
//		System.out.println("JDBC-Connection hergestellt");
//	}
	
	public void doSomething() throws SQLException, ClassNotFoundException{
//		dropAccountTable();
//		createAccountTable();
//		insertFirstAccount();
//		insertSecondAccountStatisch();
//		insertThirdAccountFromVariables();
//		insertFourthAccountFromVariablesRetro();
//		insertSeveralAccounts();
		showAllAccounts();
		
	} 
	
	public void showAllAccounts() throws SQLException {
		String sql = "select userid, password, active, admin, username, email from account";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		ResultSet dbRes = prep.executeQuery();
		
		while(dbRes.next()) {
			System.out.print(dbRes.getString("userid"));
			System.out.print(dbRes.getString("password"));
			System.out.print(dbRes.getString("active"));
			System.out.print(dbRes.getString("admin"));
			System.out.print(dbRes.getString("username"));
			System.out.println(dbRes.getString("email"));
		}
	}
	
	
	public void insertSeveralAccounts() throws SQLException {
		//Folgendes wäre die Variante mit ganz viel SQL
//				String sql = "INSERT INTO account "
//						+ "(userid, password, active, admin, username, email) "
//						+ "values "
//						+ "('testus5', 'geheim', 'Y', 'N', 'Testuser 5', 't5@abc.de'), "
//						+ "('testus6', 'geheim', 'Y', 'N', 'Testuser 6', 't6@abc.de'), "
//						+ "('testus7', 'geheim', 'Y', 'N', 'Testuser 7', 't7@abc.de'), "
//						+ "('testus8', 'geheim', 'Y', 'N', 'Testuser 8', 't8@abc.de')";
//				System.out.println(sql);
//				dbConn.prepareStatement(sql).executeUpdate();
//				System.out.println("testus5 bis testus8 inserted");

				String userid = "testus";
				String password = "geheim";
				String active = "Y";
				String admin = "Y";
				String username = "Testuser ";
				String email = "t#@abc.de";

				String sql = "INSERT INTO account "
						+ "(userid, password, active, admin, username, email) "
						+ "values "
						+ "(?,?,?,?,?,?)";
				System.out.println(sql);
				PreparedStatement prepStat = this.dbConn.prepareStatement(sql);
				
				for (int index = 5; index <= 8; index++) {
					prepStat.setString(1, userid + index);
					prepStat.setString(2, password);
					prepStat.setString(3, active);
					prepStat.setString(4, admin);
					prepStat.setString(5, username + index);
					prepStat.setString(6, email.replace("#", String.valueOf(index)));
					prepStat.executeUpdate();
					System.out.println("testus" + index + " inserted");
				}
			}
	
	public void insertFourthAccountFromVariablesRetro() throws SQLException {
		String userid = "testus4";
		String password = "geheim";
		String active = "Y";
		String admin = "Y";
		String username = "Testuser 4";
		String email = "t4@abc.de";

		String sql = "INSERT INTO account "
				+ "(userid, password, active, admin, username, email) "
				+ "values "
				+ "('" + userid + "', '" + password + "', '" + active + "', '"
				+ admin + "', '" + username + "', '" + email + "')";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("User-Account testus4 erfolgreich inserted");
	}
	
	
	public void insertThirdAccountFromVariables() throws SQLException {
		String sql = "INSERT INTO account "
				+ "(userid, password, active, admin, username, email) "
				+ "values "
				+ "(?,?,?,?,?,?)";
		System.out.println(sql);

		String userid = "testus3";
		String password = "geheim";
		String active = "Y";
		String admin = "Y";
		String username = "Testuser 3";
		String email = "t3@abc.de";
		
		PreparedStatement prepStat = this.dbConn.prepareStatement(sql);
		prepStat.setString(1, userid);
		prepStat.setString(2, password);
		prepStat.setString(3, active);
		prepStat.setString(4, admin);
		prepStat.setString(5, username);
		prepStat.setString(6, email);
		prepStat.executeUpdate();
		System.out.println("User-Account testus3 erfolgreich inserted");
	}
	 
	
	public void insertSecondAccountStatisch() throws SQLException{
		String sql = "INSERT INTO account "
				+ "(userid, password, active, admin, username, email) "
				+ "values "
				+ "('testus2', 'geheim', 'Y', 'N', 'Testuser 2', 't2@abc.de')";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("User-Account testus2 erfolgreich inserted");
	}

	
	public void insertFirstAccount() throws SQLException {
		String sql ="INSERT INTO account"
				+ "(userid, password, active, admin, username, email)"
				+ "values"
				+ "(?,?,?,?,?,?)";
		System.out.println(sql);
		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		prep.setString(1, "testus1");
		prep.setString(2, "geheim");
		prep.setString(3, "Y");
		prep.setString(4, "N");
		prep.setString(5, "Testuser 1");
		prep.setString(6, "t1@abc.de");
		prep.executeUpdate();
		System.out.println("User-Account testus1 erfolgreich inserted");
				
	}
	
	public   void createAccountTable() throws SQLException {
		String sql = "CREATE TABLE account("
				+ "	  userid CHAR(16) NOT NULL PRIMARY KEY,	"
				+ "  password CHAR(32) NOT NULL,	"
				+ "  active CHAR(1) NOT NULL DEFAULT 'Y',	"
				+ "  admin CHAR(1) NOT NULL DEFAULT 'N',	"
				+ "  username VARCHAR(256) NOT NULL, "
				+ " email VARCHAR(256) NOT NULL	"
				+ "  ) ";
		
		System.out.println(sql);
		// JDBC macht immer 2 Schritte (wenn man den SQL-Befehl als String schon hat):
		//erst ein "Statement" - Statement, PreparedStatement
		//dann execute -executeUpdate() , executeQuery(), execute()
		
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.executeUpdate();
		System.out.println("Table account erfolgreich erzeugt");
		
	}
	
	public   void dropAccountTable() throws SQLException {
		String sql = "DROP TABLE IF EXISTS ACCOUNT ";
		
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table existiert nicht mehr");
		
	}
	
	public void showAllAccounts1() throws SQLException{
		String sql = "select userid, password, active, admin, username, email " +
						"from account";
		System.out.println(sql);
		Statement stmt = this.dbConn.createStatement();
		ResultSet dbRes = stmt.executeQuery(sql);
		
//		dbRes.next(); //auf die erste Zeile, return true (gefunden) oder false (nicht gefunden)
		while(dbRes.next()){
			String myUserid   = dbRes.getString("userid");
			String myPassword = dbRes.getString("password");
			String myActive   = dbRes.getString("active");
			String myAdmin    = dbRes.getString("admin");
			String myUsername = dbRes.getString("username");
			String myEmail    = dbRes.getString("email");
			System.out.println(myUserid + myPassword + myActive + myAdmin + myUsername + myEmail);
		}
		
	}
	public void dropAccountTable1(Connection dbConn) throws SQLException{
		String sql = "drop table bw440_654321.account";
		System.out.println(sql);
		Statement stmt = this.dbConn.createStatement();
		try{
			stmt.executeUpdate(sql);
			System.out.println("Tabelle account gedroppt");
		}catch(SQLException se){
			System.out.println("Tabelle account konnte nicht gedroppt werden weil sie nicht da war");
		}
	}
		

	public void insertSeveralAccounts1() throws SQLException{
		String sql = "insert into bw440_654321.account "
				+ "(userid, password, active, admin, username, email) "
				+ "values"
				+ "(?,?,?,?,?,?)";
		System.out.println(sql);

		String userid = "testus";
		String password = "geheim";
		String active = "Y";
		String admin = "N";
		String username = "Testuser ";
		String email = "testusx@abc.de";

		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		for (int myNumber = 5; myNumber <= 10; myNumber++){
			String myNumberString = Integer.toString(myNumber);
			prep.setString(1, userid + myNumberString);
			prep.setString(2, password);
			prep.setString(3, active);
			prep.setString(4, admin);
			prep.setString(5, username + myNumberString);
			prep.setString(6, email.replace("x", myNumberString));
			prep.executeUpdate();
			
			System.out.println("Account testus " + myNumberString + " angelegt");

			
		}
	}

}
