/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo4 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Donner deux nombres et la machine va additionner : ");
 
        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
 
        int result = a + b; // La machine calcul les deux variables

        if (result % 2 ==0) {
            System.out.println("Le résultat (" + result + ") est bien divisible par 2.");
        } else {
            System.out.println("Le résultat (" + result + ") est n'est pas divisible par 2.");
        }
 
        sc.close(); // Ferme le scanner
   
    }
}