package role;

import java.util.ArrayList;

//备忘录负责人类
public class Caretaker {
	private ArrayList<Memento> mementoList = new ArrayList<Memento>();

	public Memento getMemento(int index) {
		return (Memento) mementoList.get(index);
	}

	public void setMemento(Memento memento) {
		mementoList.add(memento);
	}

	// 在创建对象之初就将mementoList的第一个元素设为原始状态
	public Caretaker() {

		mementoList.add(new Memento(2000, 1000, 5, false, false, false));
	}
}