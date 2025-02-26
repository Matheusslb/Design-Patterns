// Classe principal para testar o código
public class PrototypeExample {
    public static void main(String[] args) {
        // Cria um documento original
        Documento documentoOriginal = new Documento("Texto importante");

        // Cria uma máquina de fotocópias
        MaquinaDeFotocopias maquina = new MaquinaDeFotocopias();

        // Faz uma cópia do documento original
        Documento fotocopia = maquina.copiar(documentoOriginal);

        // Altera o conteúdo da cópia (opcional)
        fotocopia.setConteudo("Cópia do texto importante");

        // Exibe os documentos
        System.out.println("Documento Original: " + documentoOriginal.getConteudo());
        System.out.println("Fotocópia: " + fotocopia.getConteudo());
    }
}
