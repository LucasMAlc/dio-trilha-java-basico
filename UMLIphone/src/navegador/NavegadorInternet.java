package navegador;
public interface NavegadorInternet {
    public static void exibirPagina(String url) {
        System.out.println("Exibe Página");
    }

    public static void adicionarPagina() {
        System.out.println("Adiciona Página");
    }

    public static void atualizarPagina() {
        System.out.println("Atualiza Página");
    }

}