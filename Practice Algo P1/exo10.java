/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * Déclarer le scanner, déclarer la valeur d'un entier score = 0. Démarrer la série de question.
 * Question1. Si la réponse est "y", alors on rajoute un à score (score++) et on dit 
 * Bonne réponse, vous avez un point., sinon c'est Mauvaise réponse. Cela est répété 4 autre fois.
 * A la fin, le système affiche Vous avez " +score+ " points.
 * 
 * 
 * 
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo10 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Est que pile est pile ?");
        String reponse1 = sc.nextLine();

        if (reponse1.equals("y")){
            score= score +1;
            System.out.println("Bonne réponse, vous avez un point.");
        }
        else {System.out.println("Mauvaise réponse");}

        System.out.println("Est que face est face ?");
        String reponse2 = sc.nextLine();

        if (reponse2.equals("y")){
            score++;
            System.out.println("Bonne réponse, vous avez un point.");
        }
        else {System.out.println("Mauvaise réponse");}

        System.out.println("Est que a est a ?");
        String reponse3 = sc.nextLine();

        if (reponse3.equals("y")){
            score++;
            System.out.println("Bonne réponse, vous avez un point.");
        }
        else {System.out.println("Mauvaise réponse");}

        System.out.println("Est que b est b ?");
        String reponse4 = sc.nextLine();

        if (reponse4.equals("y")){
            score++;
            System.out.println("Bonne réponse, vous avez un point.");
        }
        else {System.out.println("Mauvaise réponse");}

        System.out.println("Est que c est c ?");
        String reponse5 = sc.nextLine();
        
        if (reponse5.equals("y")){
            score++;
            System.out.println("Bonne réponse, vous avez un point.");
        }
        else {System.out.println("Mauvaise réponse");}

        System.out.println("Vous avez " +score+ " points.");


        sc.close(); // Ferme le scanner
       
    }
}   