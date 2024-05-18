package formas;

public class RetanguloColorido extends Retangulo {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    public RetanguloColorido(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        int comprimento = texto.length() + 4;
        desenharLinha(comprimento, ANSI_RED);
        System.out.println(ANSI_RED + "| " + texto + " |" + ANSI_RESET);
        desenharLinha(comprimento, ANSI_RED);
    }

    private void desenharLinha(int comprimento, String cor) {
        for (int i = 0; i < comprimento; i++) {
            System.out.print(cor + "-" + ANSI_RESET);
        }
        System.out.println();
    }
}
