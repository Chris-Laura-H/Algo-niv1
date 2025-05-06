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
 *J'appelle les deux variables a et b. J'interroge l'utilisateur sur ces deux valeurs (scanner). Puis je calcul la somme de a et b, et j'affiche le résultat. 
 Si le modulo de 2 est égal à 0, le résultat est pair. Sinon, le résultat est impair.
 *
 *Je déclare les deux variables a et b de type entier. Je déclare une variable de type scannner et je l'affecte au variable a et b.
 * Je déclare une variable résult de type entier. J'affecte à résult a + b. Je fais une condition où je calcul le modulo de résult par 2 et je vérifie s'il est égal à zéro.
 * Si c'est vrai, alors on affiche le message concaténé "Le résultat (" + result + ") est pair.". Si c'est faux, alors on affiche le message concaténé 
 * "Le résultat (" + result + ") est impair.".
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

        if (result % 2 ==0) {
            System.out.println("Le résultat (" + result + ") est pair.");
        } else {
            System.out.println("Le résultat (" + result + ") est impair.");
        }
 
        sc.close(); // Ferme le scanner
       
    }
}