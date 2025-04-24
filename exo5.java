/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo5 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Donner trois nombres et faire l'équation a * b / c: ");
 
        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int result = a * b / c; // La machine calcul les deux variables
 
        System.out.println("le résultat vaut " + result); // Affiche le résultat

        if (result > 10) {
            System.out.println("La somme (" + result + ") est supérieure à 10.");
        } else {
            System.out.println("La somme (" + result + ") n'est pas supérieure à 10.");
        }
 
        sc.close(); // Ferme le scanner
       
    }
}