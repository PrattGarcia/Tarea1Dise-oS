package observerimplementation;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private String state;
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObservers(Observer o) {
		observers.remove(o);
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String value) {
		this.state = state;
		execute();
	}
	
	public void execute() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
