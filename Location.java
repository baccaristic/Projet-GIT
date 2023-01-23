import location.Voiture;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/**
 * 
 */
public class Location {

   
	

	

	public Location(int numClient, String matricule, String dateDebut, String dateFin,float prixDeLocation ,String typePayement) {
		super();
		this.numClient = numClient;
		this.matricule = matricule;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixDeLocation = prixDeLocation;
		this.typePayement = typePayement;
	}




	/**
     * Default constructor
     */
    public Location() {
    }

    /**
     * 
     */
    private int numClient;

   

	/**
     * 
     */
   
    private String matricule;

    /**
     * 
     */
   
    private String dateDebut;

    /**
     * 
     */
    private String dateFin;

    /**
     * 
     */
    private float prixDeLocation;

    /**
     * 
     */
    
    
    
    private String typePayement;





	public String getDateDebut() {
		return dateDebut;
	}

	


	public String getMatricule() {
		return matricule;
	}




	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}




	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	
	

	public String getTypePayement() {
		return typePayement;
	}

	public void setTypePayement(String typePayement) {
		this.typePayement = typePayement;
	}
	 public int getNumClient() {
			return numClient;
		}

		public void setNumClient(int numClient) {
			this.numClient = numClient;
		}




		public float getPrixDeLocation() {
			return prixDeLocation;
		}




		public void setPrixDeLocation(float prixDeLocation) {
			this.prixDeLocation = prixDeLocation;
		}
		
	
}