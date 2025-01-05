// Novos objetos para poder fazer ações no programa com eles
// interações com objetos 

// classe => objeto
// objeto => classe
// Criar um objeto = instancia 

public class pessoa {

    //Atributos = características

    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private double altura;
    private double peso;
    
    //  função construtora 
    public pessoa () {
        this.nome = "Desconhecido";
        this.idade = 0;
        this.sexo = "Desconhecido";
        this.nacionalidade = "Desconhecido";
        this.altura = 0;
        this.peso = 0;
    }
        

    // função construtora com atributos

    public pessoa(String nome, int idade, String sexo, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }


    // Métodos = ações
    // setters = definir
    // getters = obter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    // calcular o IMC

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    // classificar o IMC
    //  jeito simples de classificar o IMC 
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade grau 1";
        if (imc < 40) return "Obesidade grau 2";
        return "Obesidade grau 3";
    }

    // jeito complexo de classificar o IMC

    public String classificarIMC2() {
        double imc = calcularIMC();
        if (imc < 18.5){
            return "abaixo do peso";
        } else if (imc < 25){
            return "peso normal";
        } else if (imc < 30){
            return "sobrepeso";
        } else if (imc < 35){
            return "obesidade grau 1";
        } else if (imc < 40){
            return "obesidade grau 2";
        } else {
            return "obesidade grau 3";
        }
    }

    // apresentar os dados da pessoa

    public String apresentar() {
        return "Ola meu nome e " + nome + " tenho " + idade + " anos, sou do sexo " + sexo + " sou " + nacionalidade + " tenho " + altura + " de altura e peso " + peso;
    }
}
