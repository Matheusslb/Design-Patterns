public abstract class Mensagem {
    protected MeioDeEnvio meioDeEnvio;

    // Construtor recebe o meio de envio
    public Mensagem(MeioDeEnvio meioDeEnvio) {
        this.meioDeEnvio = meioDeEnvio;
    }
    public abstract void enviarMensagem(String mensagem);
}
