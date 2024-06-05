package poo_exam;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 Etudiant etudiant = new Etudiant("ZAWISLAK", "Adam", 78130, new Date(), "Licence CNAM");
	        etudiant.montrerDetails();
	        
	        Cours cours = new Cours("POO", "Adam ZAWISLAK", 7, 11);
	        cours.montrerDetails();
	        
	        Enseignant enseignant = new Enseignant("ZAWISLAK", "Adam", 78130, "SISR", 2500.0);
	        enseignant.montrerDetails();
	    }

	}

