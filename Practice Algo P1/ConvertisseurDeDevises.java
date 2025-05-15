/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

public class ConvertisseurDeDevises {

    public static void main(String[] args) {
        
        // Créer un objet Scanner pour obtenir les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Afficher une invite pour demander la devise d'entrée
        System.out.print("Quel est votre monnaie ?\n");
        String deviseSource = scanner.nextLine().toUpperCase();  // Lire la devise source en majuscule

        // Vérifier si la devise source est valide (EUR, USD, GBP)
        if (!deviseSource.equals("EUR") && !deviseSource.equals("USD") && !deviseSource.equals("GBP")) {
            System.out.println("Devise non valide !");
            return;  // Terminer l'exécution si la devise est invalide
        }

        // Afficher une invite pour demander le montant
        System.out.print("Quel est votre montant ?\n");
        double montantSource = scanner.nextDouble();  // Lire le montant à convertir

        // Vérifier que le montant est positif et valide
        if (montantSource < 0) {
            System.out.println("Le montant doit être positif !");
            return;  // Terminer l'exécution si le montant est négatif
        }

        // Afficher une invite pour demander la devise de sortie
        System.out.print("Vous voulez la convertir en quelle devise ?\n");
        scanner.nextLine();  // Consommer le reste de la ligne avant de lire la nouvelle entrée
        String deviseCible = scanner.nextLine().toUpperCase();  // Lire la devise cible en majuscule

        // Vérifier si la devise cible est valide
        if (!deviseCible.equals("EUR") && !deviseCible.equals("USD") && !deviseCible.equals("GBP")) {
            System.out.println("Devise non valide !");
            return;  // Terminer l'exécution si la devise cible est invalide
        }

        // Vérifier que la devise source et la devise cible ne sont pas identiques
        if (deviseSource.equals(deviseCible)) {
            System.out.println("Impossible de convertir la même devise !");
            return;  // Terminer l'exécution si les devises sont identiques
        }

        // Taux de conversion fictifs pour les exemples
        double tauxEURtoUSD = 1.1382;  // Taux de conversion EUR -> USD
        double tauxEURtoGBP = 0.8764;  // Taux de conversion EUR -> GBP
        double tauxUSDtoEUR = 0.8798;  // Taux de conversion USD -> EUR
        double tauxUSDtoGBP = 0.7703;  // Taux de conversion USD -> GBP
        double tauxGBPtoEUR = 1.1415;  // Taux de conversion GBP -> EUR
        double tauxGBPtoUSD = 1.2982;  // Taux de conversion GBP -> USD

        double montantConverti = 0.0;  // Variable pour stocker le montant converti

        // Convertir le montant en fonction des devises source et cible
        if (deviseSource.equals("EUR")) {
            if (deviseCible.equals("USD")) {
                montantConverti = montantSource * tauxEURtoUSD;
            } else if (deviseCible.equals("GBP")) {
                montantConverti = montantSource * tauxEURtoGBP;
            }
        } else if (deviseSource.equals("USD")) {
            if (deviseCible.equals("EUR")) {
                montantConverti = montantSource * tauxUSDtoEUR;
            } else if (deviseCible.equals("GBP")) {
                montantConverti = montantSource * tauxUSDtoGBP;
            }
        } else if (deviseSource.equals("GBP")) {
            if (deviseCible.equals("EUR")) {
                montantConverti = montantSource * tauxGBPtoEUR;
            } else if (deviseCible.equals("USD")) {
                montantConverti = montantSource * tauxGBPtoUSD;
            }
        }

        // Afficher le résultat de la conversion avec 2 décimales
        System.out.printf("Résultat : %.2f %s\n", montantConverti, deviseCible);
        
        // Fermer le scanner pour éviter les fuites de mémoire
        scanner.close();
    }
}

