// Classe Principal para testar o padrão Bridge
public class Main {
    public static void main(String[] args) {
        // Enviando uma mensagem por e-mail
        System.out.println("\n");
        Mensagem mensagemEmail = new MensagemTexto(new Email());
        mensagemEmail.enviarMensagem("Olá, isso é um e-mail!");


        Mensagem mensagemSMS = new MensagemTexto(new SMS());
        mensagemSMS.enviarMensagem("Olá, isso é um SMS!");
    }
}
