/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner; // Importation de Scanner pour lire les entrées de l'utilisateur

public class exo12 {
    public static void main(String[] args) {
        // Création d’un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demande du prix à l'utilisateur
        System.out.println("Votre prix ?");

        // Lecture du prix saisi (nombre à virgule, donc on utilise double)
        double prix = scanner.nextDouble();

        // Demande de la réduction à appliquer en pourcentage
        System.out.println("Votre réduction (en pourcentage %) ?");

        // Lecture du pourcentage de réduction
        double reductionPourcentage = scanner.nextDouble();

        // Calcul du montant de la réduction (prix * pourcentage / 100)
        double montantReduction = prix * reductionPourcentage / 100;

        // Calcul du prix final après réduction
        double prixFinal = prix - montantReduction;

        // Affichage du résultat
        System.out.println("\nPrix après réduction de " + reductionPourcentage + "% :");
        System.out.printf("%.2f\n", prixFinal); // Affiche le prix final avec 2 décimales

        // Fermeture du scanner
        scanner.close();
    }
}
