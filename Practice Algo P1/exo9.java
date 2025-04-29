/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/
import java.util.Scanner; // Importe le scanner par java
 
    public class exo9 {
 
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
 
        if(mdp.equals(mdp2)) {
            System.out.println("Merci" +prenom+ nom+ ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :" +adresse);
            
            System.out.println("Pour vous connecter, renseignez votre email ?");
            String adresse2 = sc.nextLine();
    
            System.out.println("Renseignez votre mot de passe ?");
            String mdp3 = sc.nextLine();
    
            if(mdp2.equals(mdp3) && adresse.equals(adresse2))
                System.out.println("connexion réussie");
    
            else 
                System.out.println("connexion refusée");

        } else {
            System.out.println("inscription annulée");
        }

        


        sc.close(); // Ferme le scanner
       
    }
}