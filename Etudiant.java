public class Etudiant {

    // Attributs
    String matricule;
    String nom;
    double note1;
    double note2;
    double note3;

    // Constructeur
    public Etudiant(String matricule, String nom, double note1, double note2, double note3) {
        this.matricule = matricule;
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    // Calcul moyenne
    public double calculerMoyenne() {
        return (note1 + note2 + note3) / 3;
    }

    // Mention
    public String mention() {
        double moy = calculerMoyenne();

        if (moy >= 16)
            return "Excellent";
        else if (moy >= 14)
            return "Très Bien";
        else if (moy >= 12)
            return "Bien";
        else if (moy >= 10)
            return "Passable";
        else
            return "Ajourné";
    }

    // Affichage
    public void afficherEtudiant() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Moyenne : " + calculerMoyenne());
        System.out.println("Mention : " + mention());
        System.out.println("----------------------------");
    }

    // Modifier les notes
    public void modifierNotes(double n1, double n2, double n3) {
        this.note1 = n1;
        this.note2 = n2;
        this.note3 = n3;
    }
}