/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner; // Importation de la classe Scanner pour lire les entrées utilisateur

public class exo11 {
    public static void main(String[] args) {
        // Déclaration du solde initial du compte bancaire
        int solde = 3000;

        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage d’un message d’accueil et demande du montant à retirer
        System.out.println("Bonjour, combien voulez-vous retirer ?");

        // Lecture du montant saisi par l'utilisateur
        int montant = scanner.nextInt();

        // Vérifie si le montant demandé est inférieur ou égal au solde disponible
        if (montant <= solde) {
            // Si oui, on effectue le retrait et affiche le nouveau solde
            solde -= montant; // Mise à jour du solde
            System.out.println("Retrait effectué. Nouveau solde : " + solde + " euros");
        } else {
            // Sinon, on affiche un message d'erreur
            System.out.println("Opération refusée, fond insuffisant !");
        }

        // Fermeture du scanner pour éviter les fuites de ressources
        scanner.close();
    }
}

