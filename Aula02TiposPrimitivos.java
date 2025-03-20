package AulasIniciais;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = 25;
        double salarioDouble = 2000.0d;
        float salarioFloat = 2500.0f;
        char caractere = 10;
        char caractereUnicode = '\u0041';
        byte idadeByte = 25;
        short idadeShort = 25;
        long numeroGrande = 100000;
        boolean verdadeiro = true;
        boolean falso = false;

        int casting = (int) 12345678910L;

        String nome = "Gabriel";

        System.out.println("A idade é " + idade+ " anos.");
        System.out.println(casting);
        System.out.println("Oi, meu nome é " + nome);
    }
}
