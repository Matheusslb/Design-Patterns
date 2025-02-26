// Implementação concreta para E-mail
public class Email implements MeioDeEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}

