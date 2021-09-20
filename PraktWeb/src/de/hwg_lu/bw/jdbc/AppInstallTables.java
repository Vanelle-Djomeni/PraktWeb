package de.hwg_lu.bw.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppInstallTables {

	Connection dbConn;
	
	public static void main(String[] args) throws SQLException {
		AppInstallTables myApplication = new AppInstallTables();
		myApplication.dbConn = new PostgreSQLAccess().getConnection();
		myApplication.dropTables();
		myApplication.createTables();
		myApplication.insertIntoArtikel();
		
	}
	
	public   void dropTables() throws SQLException {
		String sql;
		
		sql = "DROP TABLE IF EXISTS Artikel ";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Artikel existiert nicht mehr");
		
		sql = "DROP TABLE IF EXISTS Bestellung ";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Bestellung existiert nicht mehr");
		
		sql = "DROP TABLE IF EXISTS Rechnung";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Rechnung existiert nicht mehr");
		
	}
	
	public   void createTables() throws SQLException {
		String sql;
		
		sql = "CREATE TABLE Artikel("
				+ " anr integer NOT NULL PRIMARY KEY,"
				+ "  aname VARCHAR(128) NOT NULL, "
				+ " preis decimal(9,2) NOT NULL	"
				+ "  ) ";
		
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Table artikel erfolgreich erzeugt");

		sql = "CREATE TABLE Bestellung("
				+ " bnr integer NOT NULL PRIMARY KEY,	"
				+ "  kunde VARCHAR(128) NOT NULL, "
				+ " datum date default current_date	"
				+ "  ) ";
		
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Table Bestellung erfolgreich erzeugt");
		
		sql = "CREATE TABLE Rechnung("
				+ " rnr serial NOT NULL PRIMARY KEY,	"
				+ "  kunde VARCHAR(128) NOT NULL, "
				+ " artikel text not null "
				+ "  ) ";
		
		System.out.println(sql);
		dbConn.createStatement().executeUpdate(sql);
		System.out.println("Table Rechnung erfolgreich erzeugt");	
	}
	
	public void insertIntoArtikel() throws SQLException{
		String sql = "INSERT INTO artikel "
				+ "(anr, aname, preis) "
				+ "values"
				/*DRESSES*/
				+ "(1, 'Mesh Bodycon Dress', 27.99),"
				+ "(2, 'Cargo Oversized Dress', 23.00),"
				+ "(3, 'Floral Print Dress', 15.00),"
				+ "(4, 'White Blazer Dress', 30.00),"
				+ "(5, 'Shape Pink Dress', 21.00),"
				+ "(6, 'Orange Bodycon Dress', 17.99),"
				+ "(7, 'White Anglaise Dress', 25.00),"
				
				/*SHOES*/
				+ "(8, 'Clear Heeled Sandals', 21.00),"
				+ "(9, 'Orange Stilletto Sandals', 20.75),"
				+ "(10, 'Point Sock Boots', 27.75),"
				+ "(11, 'Point Crocodile Boots', 31.00),"
				+ "(12, 'Lace-up Front Boots', 32.50),"
				+ "(13, 'Lace-up Front Shoes', 30.00),"
				+ "(14, 'Faux Leather Sandals', 15.00),"
				
				/*TOPS*/
				+ "(15, 'Ribbeb Slim Sweater', 14.50),"
				+ "(16, 'Khaki Sleeve Blouse', 17.50),"
				+ "(17, 'Pleated Nude Blouse', 22.00),"
				+ "(18, 'Mock Tank Top', 10.00),"
				+ "(19, 'Satin Hem Blouse', 15.00),"
				+ "(20, 'Floral Print Top', 13.00),"
				+ "(21, ' Hem Crop Blouse', 17.00),"
				
				/*BAGS*/
				+ "(22, 'Tan Ruched Bag', 19.50),"
				+ "(23, 'Tan Oversized Bag', 21.75),"
				+ "(24, 'Plain Pattern Bag', 23.99),"
				+ "(25, 'White Textured Bag', 21.50),"
				+ "(26, 'Pink Texture Bag', 14.50),"
				+ "(27, 'Pink Croc Bag', 11.75),"
				+ "(28, 'Yellow Embossed Bag', 16.50),"
				
				/*BOTTOMS*/
				+ "(29, 'High Skinny Jeans', 19.00),"
				+ "(30, 'Solid Pleated Skirt', 14.59),"
				+ "(31, 'Back Wrap Skirt', 15.99),"
				+ "(32, 'Draped Trim Skirt', 13.45),"
				+ "(33, ' Slant Waist Sweatpants', 14.00),"
				+ "(34, 'Split Hem Jeans', 25.00),"
				+ "(35, 'Pocket Leather Pants', 20.00)";
		System.out.println(sql);
		dbConn.prepareStatement(sql).executeUpdate();
		System.out.println("Alle Artikel wurden erfolgreich eingefügt");
	}
	
}