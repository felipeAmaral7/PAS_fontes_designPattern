package ObserverFontes.observerAplicado;

public class UploadService {

    public EventManager events;

    public UploadService() {
        this.events = new EventManager();
    }

    public void uploadDocument(String fileName) {
        System.out.println("Documento enviado: " + fileName);

        // Apenas dispara evento — não sabe quem está ouvindo
        events.notify(UploadEventType.UPLOAD_COMPLETED, fileName);
    }
}
