package dz.ibnrochd.master14;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import antlr.collections.List;
import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	LigneConsultationRepository ligne_consultationRepository;
	TraitementRepository traitementRepository;
	ConsultationRepository consultationRepository;
	RendezVousRepository rendezVousRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
//        patientRepository.findAll().forEach(p->{ System.out.println(p.getNom());});	
//      	System.out.println("--------------------------");
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis afficher leurs prénoms
//		patientRepository.findByNom("Yahi").forEach(p->{ System.out.println(p.getPrenom());});	
//		System.out.println("--------------------------");
		
//		patientRepository.searchByNom("Yahi").forEach(p->{ System.out.println(p.getPrenom());});	
//		System.out.println("--------------------------");
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
//		Patient p = new Patient(0, "riad", "riadi", "M", new Date(), "077777777", "Alger");
//		patientRepository.save(p);
//		System.out.println("patient créé");
//		System.out.println("--------------------------");
				
		// TODO : rechercher la consultation ayant id=3 
//	    Consultation c = consultationRepository.findById(3).orElse(null);
//		System.out.println("recherche lancée");
//		System.out.println("--------------------------");

//		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
//		if (c != null) {
//			c.getLigneConsultations().forEach(
//					ligne->{System.out.println(ligne.getTraitement().getNom());});
//		} else System.out.println("consultation non trouvée");
		
	}

}
