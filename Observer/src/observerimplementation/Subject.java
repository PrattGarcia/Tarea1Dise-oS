package observerimplementation;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private int state;
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObservers(Observer o) {
		observers.remove(o);
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int value) {
		this.state = state;
		execute();
	}
	
	public void execute() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
