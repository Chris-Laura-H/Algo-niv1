/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * Déclarer une variable de type texte
 * 
 * 
 * 
 * 
*/
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class exo7 { /* Nom de la Classe */



    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/


        String english; //  Déclaration d'une variable a de Type Entier */
        
        
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("Do you speak english (Y/N)");

          english = clavier.nextLine(); // Affection de la valeur Scanner de type Text tapé sur le clavier à la variable prenom

          System.out.println("Votre réponse :"+english);

          if (english.equals("Y")) {
            System.out.println("Nice to meet you");
        } else {
            System.out.println("So learn english !");
        }
 
        clavier.close(); // Ferme le scanner
   
    }
}
