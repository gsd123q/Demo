package room;

import role.RoleSingleton;
import start.Print;

//����ģʽ�����Ʒ��----�ʹ�
public class Palace implements Room {
	public void display() {

		// ����Ƿ��Ѿ��н�ɫ

		System.out.println("�����ǻʹ�");
		if (Math.random() * 10 > 8) {
			System.out.println("���һ�������컯��������ֵ����2000");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 2000);
			Print.state();
		} else if (Math.random() * 10 > 5) {
			System.out.println("���һҳ�׽������ѧϰ�������������1000");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 1000);
			Print.state();
		} else if (Math.random() * 10 > 1) {
			System.out.println("���һ��ϴ�赤������ֵ����500");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 500);
			Print.state();
		} else {
			System.out.println("��ʲô��û�м�");
			Print.state();
		}
	}

}
