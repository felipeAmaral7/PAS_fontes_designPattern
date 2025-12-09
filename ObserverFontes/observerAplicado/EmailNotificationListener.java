package ObserverFontes.observerAplicado;

public class EmailNotificationListener implements EventListener {

    @Override
    public void update(String fileName) {
        System.out.println("[EMAIL] Enviando e-mail de confirmação do upload: " + fileName);
    }
}
