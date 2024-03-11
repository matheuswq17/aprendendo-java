public class operadores {
    public static void main(String[] args) {

        //Operadores Aritmeticos (+, -, *, /, %, ++, --)
        int x = 10;
        int y = 5;
        int soma = x + y;
        System.out.println(soma);
        int multiplicacao = x * 2;
        System.out.println(multiplicacao);
        float f = 5;
        System.out.println(f / 2);
        int resto = y % 2;      //????
        System.out.println(resto);  //tira ou adiciona uma unidade
        x++;
        System.out.println(x);
        y--;
        System.out.println(y);
    }
}
