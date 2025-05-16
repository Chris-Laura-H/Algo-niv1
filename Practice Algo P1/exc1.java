import java.util.Scanner;

public class exc1{
    public static void main(String[]args) {
        double age;
        double jourage;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrer un âge : ");
        age=clavier.nextDouble();

        if (age < 4) {
        jourage = age * 365; 
        } else {
        jourage = age * 365.25; 
        }

            System.out.print("Nombre de jour :" +jourage);

        clavier.close();
        }
    }

    /*if (annee%4=0&&annee%100!=0||annee%400=0)

    if(a>=3&&a<=8){

    }
    else {
        System.out.print("n'est pas compris entre 3 à 8");
    }*/