
public class ClientMain {

	public static void main(String[] args) {
		Boy boy = new Boy();
		//备忘录管理者
		Caretaker caretaker = new Caretaker();
		//初始化心情
		boy.setState("心情不错");
		System.out.println("男孩初始状态:"+boy.getState());
		//对状态进行备份
		caretaker.setMemento(new Memento(boy.getState()));
		boy.changeState();
		System.out.println("男孩失恋后状态:"+boy.getState());
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("男孩恢复后状态:"+boy.getState());
	}
}
