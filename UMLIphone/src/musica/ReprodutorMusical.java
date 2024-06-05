package musica;
public interface ReprodutorMusical {
    public static void tocar() {
        System.out.println("Tocando música");
    }

    public static void pausar() {
        System.out.println("Música pausada");
    }

    public static void selecionarMusica(String musica) {
        System.out.println("Seleciona musica");
    }
}
