import java.util.Scanner;  // Importation de la classe Scanner pour lire les entrées clavier

public class jalonblanc1bis {
    public static void main(String[] args) {
        
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner clavier = new Scanner(System.in);

       System.out.println("Entrer votre âge");
        int age = clavier.nextInt();

        if (age>=18) {
       System.out.println("Vous êtes majeur");

        } else {
            System.out.println("Vous êtes mineur");    
        }

        // Fermeture du scanner (bonne pratique)
        clavier.close();
    }
}