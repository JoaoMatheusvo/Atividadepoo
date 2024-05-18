package formas;

public class RetanguloASCIIArt extends Retangulo {
    public RetanguloASCIIArt(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        int comprimento = texto.length() + 4;
        desenharLinha(comprimento);
        System.out.println("* " + texto + " *");
        desenharLinha(comprimento);
    }

    private void desenharLinha(int comprimento) {
        for (int i = 0; i < comprimento; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
