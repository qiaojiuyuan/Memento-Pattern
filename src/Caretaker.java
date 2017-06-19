/**
 * 备忘录管理者，用于与上层类进行解耦，迪米特法则
 * @author qiaojy
 *
 */
public class Caretaker {

	private Memento memento;
	
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
