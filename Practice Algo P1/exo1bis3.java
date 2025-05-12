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
 * 
 *
 * 
*/

import java.util.Scanner;

public class exo1bis3 {
    public static void main(String[] args) {

    Scanner clavier = new Scanner(System.in);
    
    System.out.println("Donner une valeur a");
    int a = clavier.nextInt();

    System.out.println("Donner une valeur b");
    int b;

    int result = a + b;
    System.out.println("Le résultat est "+result);

    clavier.close();



}
}