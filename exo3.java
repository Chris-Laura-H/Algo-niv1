/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo3 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Donner deux nombres et la machine va additionner : ");
 
        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
 
        int result = a + b; // La machine calcul les deux variables

        if(result % 2 ==0)
 
        System.out.println("le résultat est pair " + result); // Affiche le résultat

        Else 
        
        System.out.println("le résultat est impair " + result);
 
        sc.close(); // Ferme le scanner
       
    }
}