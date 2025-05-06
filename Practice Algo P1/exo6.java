/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * Je déclare deux variables de type texte.  Je déclare le scanner. Je demande à l'utilisateur ""Quel est votre prénom et votre age" 
 * Le système affiche la phrase avec les concaténations "Je m'appelle "+prenom+", j'ai "+age+ " ans" 
 * 
*/

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class exo6 { /* Nom de la Classe */



    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/


        String prenom; //  Déclaration d'une variable a de Type Entier */

        String age; //  Déclaration d'une variable b de Type Entier */
        
        
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("Quel est votre prénom et votre age");

          prenom = clavier.nextLine(); // Affection de la valeur Scanner de type Text tapé sur le clavier à la variable prenom

          age = clavier.nextLine(); // Affection de la valeur Scanner de type Text tapé sur le clavier à la variable nom

        System.out.println("Je m'appelle "+prenom+", j'ai "+age+ " ans" ); /* Afficher la phrase avec les concatenations */

        clavier.close();



      /***--------  Fin du code  -------------------****/

  }

}