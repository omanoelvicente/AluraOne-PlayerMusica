package br.com.mvicente.boommusic.modelo;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Evidências");
        musica.setDuracaoEmMinutos(2);
        musica.setGenero("Sertanejo");
        musica.setArtista("Xitãozinho & Xororó");
        musica.setAlbum("Cowboy do asfalto");

        System.out.println("Musica: " + musica.getTitulo());
        System.out.println("Gerero: " + musica.getGenero());
        System.out.println("Artista: " + musica.getArtista());

        for (int i = 0; i < 10000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 400; i++) {
            musica.curte();
        }

        System.out.println("Numero de reproduções: " + musica.getNumeroDeReproducoes());
        System.out.println("Numero de curtidas: " + musica.getNumeroDeCurtidas());
        System.out.println("--------------------------");
        Podcast podcast = new Podcast();
        podcast.setTitulo("PodAves");
        podcast.setApresentador("Adriano");
        podcast.setDuracaoEmMinutos(54);

        System.out.println("Podcast: " + podcast.getTitulo());
        System.out.println("Apresentador: " + podcast.getApresentador());
        System.out.println("Duração: " + podcast.getDuracaoEmMinutos() + " minutos");

        for (int i = 0; i < 200; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 94; i++) {
            podcast.curte();
        }

        System.out.println("Numero de reproduções: " + podcast.getNumeroDeReproducoes());
        System.out.println("Numero de curtidas: " + podcast.getNumeroDeCurtidas());


        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}
