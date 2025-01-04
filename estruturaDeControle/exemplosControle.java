package estruturaDeControle;

public class exemplosControle {
    public static void main(String[] args) {

        // 1- if, else e else if (condicionais)

        // if
        int idade = 10;

        if(idade >= 18) {
            System.out.println("voce e maior de idade");
        } else {
            System.out.println("voce e menor de idade");
        }

        // if e else
        double nota = 10;

        if(nota >= 7) {
            System.out.println("voce foi aprovado");
        } else {
            System.out.println("voce foi reprovado");
        }

        // if, else if e else

        int hora = 14;

        if(hora < 12) {
            System.out.println("Bom dia");
        } else if(hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }  

        // 2- operadores de comparação ==, !=, >, <, >=, <=

        // = atribuição
        // == comparação

        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b)); // comparação
        System.out.println("a != b: " + (a != b)); // diferença
        System.out.println("a > b: " + (a > b)); // maior
        System.out.println("a < b: " + (a < b)); // menor
        System.out.println("a >= b: " + (a >= b)); // maior ou igual
        System.out.println("a <= b: " + (a <= b)); // menor ou igual

        // 3- operadores lógicos 
        
        /*
        
        &&(and) => op1 && op2 => boolean => true se ambos forem verdadeiros
        
        ||(or) => op1 || op2 => boolean => true se um dos dois for verdadeiro
        
        !(not) => !valor => altera o valor para ao contrário do que era antes => true vira false e vice-versa

        */

        boolean temDinheiro = true;
        boolean temTempo = true;

        if(temDinheiro && temTempo) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("nao pode viajar");
        }

        // 4- loops - while e for 

        // loop => Repete algo até uma condição ser atingida, evita repetição de código (vira "automático")

        int contador = 1;

        while (contador <= 5) {
            System.out.println("contador: " + contador);
            contador++;
        }

        for(int i = 1; i <= 5; i++) {
            System.out.println("contador: " + i);
        } 

        // exemplos práticos de loop

        // analise numérica

        int[] numeros ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somaPar = 0;
        int somaImpar = 0;

        for(int num : numeros){
            if (num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
                
            }
            // identificar se o número é múltiplo de 3

            if(num % 3 == 0) {
                System.out.println("O numero " + num + " e multiplo de 3");
            }

            if (num > 5 && num < 8) {
                System.out.println("O numero " + num + " esta entre 5 e 8");
                
            }
        }
        System.out.println("soma dos pares: " + somaPar);
        System.out.println("soma dos impares: " + somaImpar);

        // break => interrompe o loop
        // continue => pula a iteração atual

        // vars temporários dos loops, eles podem repetir o nome 
        
        for(int i = 0; i < 10; i++) {
            
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
            
        }
    }
}
