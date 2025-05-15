import java.util.Scanner;  // Importation de la classe Scanner pour lire les entrées utilisateur

public class jalonblanc2 {
    public static void main(String[] args) {
        
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Initialisation des soldes de départ des comptes A et B
        double compteA = 3000.0;
        double compteB = 500.0;

        // Affichage des soldes avant le transfert
        System.out.println("Solde initial :");
        System.out.println("Compte A : " + compteA + " euros");
        System.out.println("Compte B : " + compteB + " euros");

        // Demander à l'utilisateur combien il veut transférer de A vers B
        System.out.print("Entrez le montant à transférer du compte A vers le compte B : ");
        double montant = scanner.nextDouble();

        // Vérification si le compte A a assez d'argent pour effectuer le transfert
        if (montant > 0 && montant <= compteA) {
            // Effectuer le transfert
            compteA -= montant;  // Retirer le montant du compte A
            compteB += montant;  // Ajouter le montant au compte B

            // Affichage des nouveaux soldes après le transfert
            System.out.println("Transfert réussi !");
            System.out.println("Nouveaux soldes :");
            System.out.println("Compte A : " + compteA + " euros");
            System.out.println("Compte B : " + compteB + " euros");
        } else {
            // Si le montant est invalide (négatif ou supérieur au solde de A)
            System.out.println("Transfert impossible : montant invalide ou solde insuffisant.");
        }

        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}