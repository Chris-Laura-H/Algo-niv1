/*Quelqu'un peu me le traduire en Java :
 
J’ai une brique de lait (centi-litre) une quantité x
J’ai un baquet de céréal (gramme) une quantité x
J’ai un Bol (centi-litre) quantité vide
 
 
Si ma brique de lait est vide ou si mon paquet de céréal est vide
 
Alors je ne peux pas prendre mon petit déjeuner (Message)
 
Sinon
 
Je peux prendre mon petit déjeuner (Message)
J’ajoute le lait et les céréales dans le bol
 
Mon petit déjeuner est prêt (Message)

Déclaration de variable :  int (Type) cereal (Variable)*/

import java.util.Scanner; 

    public class petitdejeuner {
 
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Quantité de lait");

        int lait = clavier.nextInt();

        System.out.println("Quantité céréale");

        int cereal = clavier.nextInt();
        int bol = 0;
        if (lait > 0 && cereal > 0 ) {
            System.out.println("Alors je ne peux pas prendre mon petit déjeuner");}
        else{
            System.out.println("Je peux prendre mon petit déjeuner");}

            bol=lait+cereal;

            clavier.close(); 

    }
}