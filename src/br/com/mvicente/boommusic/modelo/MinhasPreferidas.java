package br.com.mvicente.boommusic.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " está entre os mais ouvidos e recomendados no momento");
        } else {
            System.out.println(audio.getTitulo() + " figura entre os mais ouvidos!");
        }
    }
}
