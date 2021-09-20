package de.hwg_lu.bw4s.beans;

import java.sql.*;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;
import de.hwg_lu.bw.jdbc.NoConnectionException;


public class FanshopBean {

	Vector<Artikel> artikelListe;

	public FanshopBean() throws NoConnectionException, SQLException {
		this.artikelListe= new Vector<Artikel>();
		this.getArtikelFromDB();
	}
	
	public void getArtikelFromDB() throws NoConnectionException, SQLException {
		this.artikelListe.clear();
		String sql = "select anr, aname, preis from artikel";
		System.out.println(sql);
		ResultSet dbRes = new PostgreSQLAccess().getConnection().prepareStatement(sql).executeQuery();
		
		while(dbRes.next()) {
			int myAnr   = dbRes.getInt("anr");
			String myAname = dbRes.getString(2);
			double myPreis   = dbRes.getDouble("preis");

			Artikel myArtikel = new Artikel (myAnr, myAname, myPreis);
			this.artikelListe.add(myArtikel);
		}

	}
	
	/*public String getHtmlFromArtikel() {
		String html="";
		
		for (Artikel myArtikel : this.artikelListe) {
			
			html +=   myArtikel.toKaestchen() + "<br>";
		}
		return html;
	}*/
	
	public void bestellungSpeichern(String kunde, String[] bestArt) throws SQLException {
		String sql = "insert into bestellung (kunde) values (?)";
		System.out.println(sql);
		PreparedStatement prep = new PostgreSQLAccess().getConnection().prepareStatement(sql);
		prep.setString(1, kunde);
		prep.executeUpdate();
	}
	public void erzeugeRechnungen() {
		
	}
	public void erzeugeXML() {
		
	}
}
