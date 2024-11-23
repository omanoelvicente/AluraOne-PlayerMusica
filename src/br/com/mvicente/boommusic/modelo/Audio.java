package br.com.mvicente.boommusic.modulo;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int numeroDeCurtidas;
    private int numeroDeReproducoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public int getNumeroDeReproducoes() {
        return numeroDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public void curte() {
        numeroDeCurtidas++;
    }


    public void reproduzir() {
        numeroDeReproducoes++;
    }

    public void pausar() {
        System.out.println("Pausado...");
    }

    public void avancar() {
        System.out.println("Avançar...");
    }

    public void retroceder() {
        System.out.println("Retroceder...");
    }

}
