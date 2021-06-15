package observerimplementation;

public class Observer2 extends Observer{
	public Observer2(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
		
	public void update() {
		System.out.println("Hi, comojbhbdfjnsdjng");
	}
}
