/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
 * Demander "Votre prénom", "Votre nom", "Votre adresse", "Votre mot de passe", "confirmer votre mot de passe". Si le mot de passe est bon,
 * afficher "Merci" +prenom+ nom+ ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :" +adresse,
 * sinon afficher "inscription annulée"
 * 
 * 
 * 
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo8 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Votre prénom ?");
        String prenom = sc.nextLine();

        System.out.println("Votre nom ?");
        String nom = sc.nextLine();

        System.out.println("Votre adresse ?");
        String adresse = sc.nextLine();

        System.out.println("votre mot de passe ?");
        String mdp = sc.nextLine();

        System.out.println("confirmer votre mot de passe ?");
        String mdp2 = sc.nextLine();
 
        if(mdp.equals(mdp2))
            System.out.println("Merci" +prenom+ nom+ ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :" +adresse);

        else 
            System.out.println("inscription annulée");

        sc.close(); // Ferme le scanner
       
    }
}