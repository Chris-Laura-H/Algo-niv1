import java.util.Scanner;  // Importation de la classe Scanner pour lire les entrées clavier

public class jalonblanc1 {
    public static void main(String[] args) {
        
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner clavier = new Scanner(System.in);

        // Demander à l'utilisateur de saisir son âge
        System.out.print("Veuillez entrer votre âge : ");
        
        // Lecture de l’âge saisi au clavier
        int age = clavier.nextInt();

        // Vérification de l'âge pour déterminer si la personne est majeure ou mineure
        if (age < 18) {
            // Si l'âge est inférieur à 18, la personne est mineure
            System.out.println("Vous êtes mineur.");
        } else {
            // Sinon, la personne est majeure
            System.out.println("Vous êtes majeur.");
        }

        // Fermeture du scanner (bonne pratique)
        clavier.close();
    }
}
