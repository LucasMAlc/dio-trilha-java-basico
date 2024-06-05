package telefone;
public interface AparelhoTelefonico {
    public static void ligar(String numero) {
        System.out.println("Ligando");
    }

    public static void atender() {
        System.out.println("Atendeu");
    }

    public static void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}