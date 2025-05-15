import java.util.Scanner; // Importation de la classe Scanner pour lire les entrées utilisateur

public class jalonblanc3 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire depuis l'entrée standard (le clavier)
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer le prix HT (Hors Taxe)
        System.out.print("Entrez le prix HT (€) : ");
        double prixHT = scanner.nextDouble(); // Lecture du prix HT (nombre décimal)

        // Demande à l'utilisateur d'entrer le taux de TVA en pourcentage
        System.out.print("Entrez le taux de TVA (%) : ");
        double tauxTVA = scanner.nextDouble(); // Lecture du taux de TVA (ex: 20 pour 20%)

        // Calcul du montant de la TVA
        double montantTVA = prixHT * tauxTVA / 100;

        // Calcul du prix TTC (prix HT + TVA)
        double prixTTC = prixHT + montantTVA;

        // Affichage du résultat
        System.out.println("Montant de la TVA : " + montantTVA + " €");
        System.out.println("Prix TTC : " + prixTTC + " €");

        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}