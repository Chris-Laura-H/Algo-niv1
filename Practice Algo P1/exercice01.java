import java.util.Scanner;

public class exercice01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int var1;
        int var2;
        int result;

        System.out.println("Var1 :");
        var1 = clavier.nextInt();
        System.out.println("Var2 :");
        var2 = clavier.nextInt();

        result = var1+var2;

        System.out.println("La somme de "+var1+" et "+var2+" vaut "+result);

        result++;
        result--;

        if(!(result<=10)){ 

             
            System.out.println(result+" est supérieur 10");
    
            }else{
    
                System.out.println(result+" est inférieur ou égal à 10");

            }
    
    
            clavier.close();

    }
}
