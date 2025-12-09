package ObserverFontes.semObserver;

public class UploadServiceSemObserver {

    public void upload(String fileName) {
        System.out.println("Documento " + fileName + " enviado com sucesso!");

        enviarEmail(fileName);
        registrarLog(fileName);
    }

    private void enviarEmail(String fileName) {
        System.out.println("[EMAIL] Enviando e-mail para o usuário sobre o arquivo: " + fileName);
    }

    private void registrarLog(String fileName) {
        System.out.println("[LOG] Registrando evento de upload: " + fileName);
    }
}

