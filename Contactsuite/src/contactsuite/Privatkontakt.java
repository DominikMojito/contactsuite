package contactsuite;

import java.util.Date;

/**
 * 
 * @author Eduard Dojan
 *
 */
public class Privatkontakt extends Kontakt {
	
	private String vorname;
	private String nachname;
	
	public Privatkontakt(){
		super();
		vorname = "";
		nachname = "";
	}
	
	public Privatkontakt(int kontaktID, String plz, String strasse, String hausnummer,
			String ort, String email, String telefonnummer, String bildpfad,
			boolean istOeffentlich, Benutzer erstelltVon, Date erstelltAm,
			String vorname, String nachname){
		
		super(kontaktID, plz, strasse, hausnummer, ort, email, telefonnummer,
				bildpfad, istOeffentlich, erstelltVon, erstelltAm);
		
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	

}
