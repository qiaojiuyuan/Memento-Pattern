
public class Boy {

	private String state = "";
	
	/**
	 * 认识女孩子后的心情改变
	 */
	public void changeState() {
		this.state = "心情很不好";
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个状态备份
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
