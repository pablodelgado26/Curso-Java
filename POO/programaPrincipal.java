public class programaPrincipal {
    public static void main(String[] args) {

        // criar uma pessoa = estanciar(new)
        // tipo da classe + nome do objeto = new + construtor
        // sem atributos
        pessoa pessoa1 = new pessoa();

        // setar o nome da pessoa pessoa1.setNome("Joao");

        pessoa1.setNome("Joao");
        pessoa1.setIdade(20);
        pessoa1.setSexo("Masculino");
        pessoa1.setNacionalidade("Brasileiro");
        pessoa1.setAltura(1.80);
        pessoa1.setPeso(80.0);

        // pegar o nome da pessoa System.out.println(pessoa1.getNome());

        System.out.println(
                "Nome: " + pessoa1.getNome() +
                        "\nIdade: " + pessoa1.getIdade() +
                        "\nSexo: " + pessoa1.getSexo() +
                        "\nNacionalidade: " + pessoa1.getNacionalidade() +
                        "\nAltura: " + pessoa1.getAltura() +
                        "\nPeso: " + pessoa1.getPeso());

        // com atributos

        pessoa pessoa2 = new pessoa("maria", 25, "Feminino", "Brasileira", 1.70, 60.0);

        System.out.println(
                "Nome: " + pessoa2.getNome() +
                        "\nIdade: " + pessoa2.getIdade() +
                        "\nSexo: " + pessoa2.getSexo() +
                        "\nNacionalidade: " + pessoa2.getNacionalidade() +
                        "\nAltura: " + pessoa2.getAltura() +
                        "\nPeso: " + pessoa2.getPeso());

        // calcular o IMC
        System.out.println("IMC: " + pessoa2.calcularIMC());

        // classificar a pessoa pelo IMC simples somente com if 

        System.out.println("Classificacao: " + pessoa2.classificarIMC());

        // classificar a pessoa pelo IMC com if else

        System.out.println("Classificacao: " + pessoa2.classificarIMC2());

        // Apresentar pessoa mais fácil de ler

        System.out.println(pessoa2.apresentar());
        System.out.println(pessoa1.apresentar());
    }
}
