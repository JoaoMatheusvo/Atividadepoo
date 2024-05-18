package formas;

public class MainRet {
    public static void main(String[] args) {
        Retangulo simples = new RetanguloSimples("Texto Simples");
        simples.desenhar();
        
        Retangulo duplas = new RetanguloLinhasDuplas("Texto com Linhas Duplas");
        duplas.desenhar();
        
        Retangulo asciiArt = new RetanguloASCIIArt("Arte ASCII");
        asciiArt.desenhar();
        
        Retangulo colorido = new RetanguloColorido("Texto Colorido");
        colorido.desenhar();
    }
}
