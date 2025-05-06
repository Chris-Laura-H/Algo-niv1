/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 *  J'appelle les deux variables a et b. J'interroge l'utilisateur sur ces deux valeurs (scanner). Puis je calcul la somme de a et b, et j'affiche le résultat.
 * Je déclare les deux variables a et b de type entier. Je déclare une variable de type scannner et je l'affecte au variable a et b.
 * Je déclare une variable résult de type entier. J'affecte à résult a + b. J'affiche résult.
 * 
 * 
*/

import java.util.Scanner; // Importe le scanner par java
 
    public class exo1 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Donner deux nombres et la machine va additionner : ");
 
        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
 
        int result = a + b; // La machine calcul les deux variables
 
        System.out.println("le résultat vaut " + result); // Affiche le résultat
 
        sc.close(); // Ferme le scanner
       
    }
}