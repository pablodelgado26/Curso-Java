package sintaxeBasica;

public class exemplosDeSintaxe {
    public static void main(String[] args) throws Exception {
        // 1- Impressão de texto
        System.out.println("Hello World!");

        // 2- tipos primitivos 
        // Declarando uma variável do tipo inteiro int
        int intVar = 10;
        int anoAtual = 2025;
        System.out.println("O valor e: " + intVar);
        System.out.println("O ano atual e: " + anoAtual);

        // Declarando uma variável do tipo double que contem números decimais
        double doubleVar = 10.5;
        double altura = 1.75;
        System.out.println("O valor e: " + doubleVar);
        System.out.println("A altura e: " + altura);

        // texto => String
        String nome = "João";
        System.out.println("O nome e: " + nome);

        // boolean => true ou false

        boolean verdade = true;
        boolean falso = false;
        System.out.println("O valor e: " + verdade);
        System.out.println("O valor e: " + falso);

        // Operadores básicos
        // aritméticos

        int a = 10;
        int b = 20;
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        double d = 20;
        double c = 10;
        System.out.println("d / c = " + (d / c));
        System.out.println("d % c = " + (d % c));

        // Incremento e decremento

        int contador = 0;

        contador++;

        System.out.println("O valor do contador e: " + contador);

        contador--;

        System.out.println("O valor do contador e: " + contador);

        // operador composto

        System.out.println("Op composta soma:" + (a += 5));
        System.out.println("Op composta subtracao:" + (a -= 5));
        System.out.println("Op composta multiplicacao:" + (a *= 5));



    }
}
