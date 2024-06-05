package poo_exam;

public class Cours {
	private String titre;
	private String formateur;
	private int duree;
	private int placesRestantes;
	
	public Cours(String titre, String formateur, int duree, int placesRestantes) {
	    this.titre = titre;
	    this.formateur = formateur;
	    this.duree = duree;
	    this.placesRestantes = placesRestantes;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getFormateur() {
		return formateur;
	}
	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
	public int getDureeEnHeures() {
		return duree;
	}
	public void setDureeEnHeures(int dureeEnHeures) {
		this.duree = dureeEnHeures;
	}
	public int getPlacesRestantes() {
		return placesRestantes;
	}
	
	public void montrerDetails() {
		System.out.println("Titre: " + titre);
        System.out.println("Formateur: " + formateur);
        System.out.println("Durée (en heures): " + duree);
        System.out.println("Places restantes: " + placesRestantes);
    } 
		        
}
