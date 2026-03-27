import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Etudiant[] etudiants = new Etudiant[2];

        // Saisie
        for (int i = 0; i < 2; i++) {
            System.out.println("Etudiant " + (i + 1));

            System.out.print("Matricule : ");
            String mat = sc.next();

            System.out.print("Nom : ");
            String nom = sc.next();

            System.out.print("Note 1 : ");
            double n1 = sc.nextDouble();

            System.out.print("Note 2 : ");
            double n2 = sc.nextDouble();

            System.out.print("Note 3 : ");
            double n3 = sc.nextDouble();

            etudiants[i] = new Etudiant(mat, nom, n1, n2, n3);
        }

        // Affichage
        System.out.println("\n----- LISTE DES ETUDIANTS -----");
        for (Etudiant e : etudiants) {
            e.afficherEtudiant();
        }

        // Moyenne générale
        double somme = 0;
        for (Etudiant e : etudiants) {
            somme += e.calculerMoyenne();
        }
        double moyenneClasse = somme / etudiants.length;
        System.out.println("Moyenne générale : " + moyenneClasse);

        // Meilleur étudiant
        Etudiant meilleur = etudiants[0];
        for (Etudiant e : etudiants) {
            if (e.calculerMoyenne() > meilleur.calculerMoyenne()) {
                meilleur = e;
            }
        }
        System.out.println("Meilleur étudiant : " + meilleur.nom);

        // Nombre admis
        int admis = 0;
        for (Etudiant e : etudiants) {
            if (e.calculerMoyenne() >= 10) {
                admis++;
            }
        }
        System.out.println("Nombre d'admis : " + admis);
        System.out.print("\nEntrer le matricule à rechercher : ");
        String matRecherche = sc.next();

        boolean trouve = false;

        for (Etudiant e : etudiants) {
            if (e.matricule.equals(matRecherche)) {
                System.out.println("\n--- Etudiant trouvé ---");
                e.afficherEtudiant();
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Aucun étudiant trouvé avec ce matricule.");
        }

        sc.close();
    }
}