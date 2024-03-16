package dao;
import java.util.*;
public class EtudiantDAO {
    private List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant addEtudiant(Etudiant e) {
        try {
            etudiants.add(e);
            System.out.println("Etudiant ajouté !");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public EtudiantDAO(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}