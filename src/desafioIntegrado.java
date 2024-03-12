import java.util.Scanner;

public class desafioIntegrado {

    public static void main(String[] args) {

        //Scanner e usado para ler as informacoes do teclado
        Scanner leitor = new Scanner(System.in);


        //Calcular a media de um aluno
        System.out.println("Digite a nota 1");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite a nota 2");
        float nota2 = leitor.nextFloat();

        float media= (nota1 + nota2)/2;
        System.out.println("A media e " + media);

        leitor.close();
    }
}
