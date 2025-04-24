import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

 
    /***--------Donner un nom à votre class -------------------****/
 
public class Lesson1Algo {
 
 
    public static void main(String[] args) {
 
          /***--------  Début du code  -------------------****/
 
 
 
          Scanner clavier = new Scanner(System.in);

          System.out.print("Entrez votre nom : ");
        
          String nom = clavier.nextLine();
 
          System.out.println("Bonjour" + nom);
 
          clavier.close();
 
 
        /***--------  Fin du code  -------------------****/
 
    }
 
}