package observerimplementation;

public class Observer1 extends Observer{
	public Observer1(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	public void update() {
		System.out.println("Hi, como estas");
	}

}
