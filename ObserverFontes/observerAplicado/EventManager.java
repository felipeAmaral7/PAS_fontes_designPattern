package ObserverFontes.observerAplicado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<UploadEventType, List<EventListener>> listeners = new HashMap<>();

    public EventManager() {
        for (UploadEventType type : UploadEventType.values()) {
            listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(UploadEventType event, EventListener listener) {
        listeners.get(event).add(listener);
    }

    public void notify(UploadEventType event, String fileName) {
        for (EventListener listener : listeners.get(event)) {
            listener.update(fileName);
        }
    }
}
