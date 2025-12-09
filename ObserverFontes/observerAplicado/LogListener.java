package ObserverFontes.observerAplicado;

public class LogListener implements EventListener {

    @Override
    public void update(String fileName) {
        System.out.println("[LOG] Registrando upload: " + fileName);
    }
}

