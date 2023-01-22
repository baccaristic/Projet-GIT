public class Voiture {
	
	public String carteGrise;
	public int numVoiture ;
	public String type;
	public String marque ;
	public String matricule;
	public  double prixVoiture ;
	public boolean louee;
      
	
	// Attibuts deduits des relations
	private Agence agence;
	
    public Voiture(int numVoiture , String carteGrise, String type, String marque, String matricule, double prixVoiture, boolean louee) {
			super();
			this.numVoiture = numVoiture;
			this.carteGrise = carteGrise;
			this.type = type;
			this.marque = marque;
			this.matricule = matricule;
			this.prixVoiture = prixVoiture;
			this.louee = louee;
	    	}

	public Voiture(int numVoiture ,String carteGrise, String type, String marque, String matricule, boolean louee, Agence agence , double prixVoiture) {
		super();
		this.numVoiture = numVoiture;
		this.carteGrise = carteGrise;
		this.type = type;
		this.marque = marque;
		this.matricule = matricule;
		this.louee = louee;
		this.agence = agence;
		this.prixVoiture = prixVoiture ; 
	     }
    
	public int getNumVoiture() {
		return numVoiture;
	}

	public void setNumVoiture(int numVoiture) {
		this.numVoiture = numVoiture;
	}

	public Agence getAgence() {
		return agence;
	}


	public void setAgence(Agence agence) {
		this.agence = agence;
	}


	public String getCarteGrise() {
		return carteGrise;
	}

	public void setCarteGrise(String carteGrise) {
		this.carteGrise = carteGrise;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public boolean isLouee() {
		return louee;
	}

	public void setLouee(boolean louee) {
		this.louee = louee;
	}
	
	public double getPrixVoiture() {
		return prixVoiture;
	}


	public void setPrixVoiture(double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	
}