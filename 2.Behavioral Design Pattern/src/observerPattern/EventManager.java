package observerPattern;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class EventManager {

	private Map<String, List<EventListener>> listeners = new HashMap<>();

	public EventManager(String... operations) {
		for (String operationName : operations) {
			listeners.put(operationName, new ArrayList<>());
		}
	}

	public void subscribe(String eventType, EventListener eventListener) {
		List<EventListener> users = this.listeners.get(eventType);
		users.add(eventListener);
	}

	public void unsubscribe(String eventType, EventListener eventListener) {
		List<EventListener> users = this.listeners.get(eventType);
		users.remove(eventListener);
	}

	public void notify(String eventType, File file) {
		List<EventListener> users = this.listeners.get(eventType);
		for(EventListener user : users) {
			user.update(eventType,file);
		}
	}

}
