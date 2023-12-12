import java.util.*;

public class Main{
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        // lowerCamelCase
        System.out.println("Digite uma Idade");
        int minhaIdade;
        minhaIdade = in.nextInt();
        System.out.println("Digite outra Idade");
        int tuaIdade;
        tuaIdade = in.nextInt();
        int totalIdades = minhaIdade + tuaIdade;

        System.out.println("Total das Idades e: " + totalIdades);
    }
}