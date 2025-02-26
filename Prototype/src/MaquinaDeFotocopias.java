// Classe MaquinaDeFotocopias (Cliente)
class MaquinaDeFotocopias {
    // Método para copiar um documento
    public Documento copiar(Documento documento) {
        return documento.clone(); // Usa o método clone() para criar uma cópia
    }
}
