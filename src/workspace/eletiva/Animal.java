package workspace.eletiva;

public class Animal {
    public String nome;
    public int idade;
    public char sexo;
    public double altura;
    public boolean andando;
    public Animal(String nome, int idade, char sexo, double altura, boolean andando) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.andando = andando;
    }

    public String pegarNome() {
        return this.nome;
    }

    public void andar() {
        this.andando = !this.andando;
        System.out.println(this.andando);
    }

    public void completarAniversario() {
        this.idade += 1;
        System.out.println(this.idade);
    }
}
