import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
 
    /***--------Donner un nom à votre class -------------------****/
 
public class Lesson2Algo {
 
 
    public static void main(String[] args) {
 
 
          Scanner scanner = new Scanner(System.in);

          System.out.println("Entrez la valeur de a : ");
          int nombre1 = scanner.nextInt();
          
          System.out.println("Entrez la valeur de b : ");
          int nombre2 = scanner.nextInt();

          int somme = nombre1+nombre2;

           // Vérifier si la somme est supérieure à 10
           if (somme > 10) {
            System.out.println("La somme (" + somme + ") est supérieure à 10.");
        } else {
            System.out.println("La somme (" + somme + ") n'est pas supérieure à 10.");
        }

        scanner.close();5
        8
        

 
 
        /***--------  Fin du code  -------------------****/
 
    }
 
}