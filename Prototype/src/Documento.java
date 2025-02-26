// Classe Documento (Prototype)
class Documento implements Cloneable {
    private String conteudo;

    // Construtor
    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    // Método para clonar o documento
    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone(); // Clona o objeto
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar o documento", e);
        }
    }

    // Getter e Setter
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Documento: " + conteudo;
    }
}
