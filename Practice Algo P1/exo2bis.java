    import java.util.Scanner;

    public class exo2bis {
        public static void main(String[]args){
    
            int a;
            int b;
            int soustraction;
    
            Scanner clavier = new Scanner(System.in);
    
            System.out.println("La valeur de a");
            a = clavier.nextInt();
    
            System.out.println("La valeur de b");
            b = clavier.nextInt();
    
            soustraction = a-b;
    
            System.out.println("a+b= " +soustraction);
    
            clavier.close();
        }
        
    }
