package role;

import java.util.ArrayList;

//����¼��������
public class Caretaker {
	private ArrayList<Memento> mementoList = new ArrayList<Memento>();

	public Memento getMemento(int index) {
		return (Memento) mementoList.get(index);
	}

	public void setMemento(Memento memento) {
		mementoList.add(memento);
	}

	// �ڴ�������֮���ͽ�mementoList�ĵ�һ��Ԫ����Ϊԭʼ״̬
	public Caretaker() {

		mementoList.add(new Memento(2000, 1000, 5, false, false, false));
	}
}