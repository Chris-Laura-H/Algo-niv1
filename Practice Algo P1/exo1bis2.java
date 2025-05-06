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
*/
import java.util.Scanner;

public class exo1bis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntrer un entier : ");
        int a = sc.nextInt();
        
        System.out.println("\nEntrer un deuxième entier : ");
        int b = sc.nextInt();

        int result= a + b;
        System.out.println("\nRésultat vaut : " +result);

        sc.close();
    }

}
