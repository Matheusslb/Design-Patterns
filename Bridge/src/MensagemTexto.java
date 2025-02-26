public class MensagemTexto extends Mensagem {
    // Construtor que recebe o MeioDeEnvio
    public MensagemTexto(MeioDeEnvio meioDeEnvio) {
        super(meioDeEnvio);
    }

    // Método que envia a mensagem
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.print("Mensagem de texto: ");
        meioDeEnvio.enviar(mensagem);  // Delegando para o meio de envio
    }
}
