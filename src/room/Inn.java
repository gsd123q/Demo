package room;

import role.RoleSingleton;
import start.Print;

//����ģʽ���巿����---��ջ���ָ�����ֵ
public class Inn implements Room {

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("�����ǿ�ջ");
		if (RoleSingleton.getInstance().getJingshen() < 200) {
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() + 100);
			System.out.println("������Ϣ�����ľ���ֵ������100");
			Print.state();
		} else {
			System.out.println("���Ѿ��������棬��ȥ���˰ɣ�");
			Print.state();
		}
	}

}
