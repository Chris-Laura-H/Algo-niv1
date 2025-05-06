/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/


import java.util.Scanner; // Importation de la classe Scanner pour lire l'entrée de l'utilisateur

public class exo13 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage du message demandant la taille en centimètres
        System.out.print("Donner une taille en centimètre ? ");
        
        // Lecture de la taille en centimètres saisie par l'utilisateur
        int tailleCm = scanner.nextInt(); // La taille est stockée comme un entier

        // Conversion de la taille en centimètres en mètres (en double)
        double tailleM = tailleCm / 100.0; // Conversion en mètres (1 mètre = 100 centimètres)

        // Affichage du résultat sous forme de message
        System.out.println(tailleCm + " cm vaut " + tailleM + " m");

        // Fermeture du scanner pour libérer les ressources
        scanner.close();
    }
}