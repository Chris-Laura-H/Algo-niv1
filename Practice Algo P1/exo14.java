/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/


import java.util.Scanner; // Import de la classe Scanner pour lire l'entrée de l'utilisateur

public class exo14 {
    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage du message d'invite à l'utilisateur
        System.out.println("Donner une valeur A OU B ET NON C");

        // Lecture de la valeur de A (booléen) saisie par l'utilisateur
        boolean A = Boolean.parseBoolean(scanner.nextLine()); // Convertit une chaîne en booléen (true/false)

        // Lecture de la valeur de B (booléen)
        boolean B = Boolean.parseBoolean(scanner.nextLine());

        // Lecture de la valeur de C (booléen)
        boolean C = Boolean.parseBoolean(scanner.nextLine());

        // Application de l'expression : A OU (B ET NON C)
        boolean resultat = A || (B && !C);

        // Affichage du résultat final de l'expression
        System.out.println("Résultat : " + resultat);

        // Fermeture du scanner
        scanner.close();
    }
}