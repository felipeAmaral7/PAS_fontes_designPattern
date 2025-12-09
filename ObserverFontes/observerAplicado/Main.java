package ObserverFontes.observerAplicado;

public class Main {

    public static void main(String[] args) {

        UploadService upload = new UploadService();

        // Inscrevendo listeners
        upload.events.subscribe(UploadEventType.UPLOAD_COMPLETED, new EmailNotificationListener());
        upload.events.subscribe(UploadEventType.UPLOAD_COMPLETED, new LogListener());

        // Execução
        upload.uploadDocument("tese_final.pdf");
    }
}

