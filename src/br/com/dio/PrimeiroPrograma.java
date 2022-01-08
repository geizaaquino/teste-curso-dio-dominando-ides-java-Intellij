package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        livro livro1 = new livro("O problem dos 3 corpos", 300);
        System.out.println(livro1);
       /* int a = 10;
        int b = 3;
        System.out.println("Hello world " + (a+b));*/
    }
}
class livro{
    private String nome;
    private Integer numPagina;

    public livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}