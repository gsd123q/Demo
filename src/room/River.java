package room;

import role.RoleSingleton;
import start.Print;

//����ģʽ�����Ʒ��---�ӱ�

public class River implements Room {
	public void display() {

		// ����Ƿ��Ѿ��н�ɫ

		System.out.println("�����Ǻӱ�");
		if (Math.random() * 10 > 8) {
			System.out.println("���һ���߼��书�ؼ�������һ���о���ս������2000������ֵ�½�200");
			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 2000);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 200);
			Print.state();
		} else if (Math.random() * 10 > 5) {
			System.out.println("���һ���м��书�ؼ�������һ���о���ս������1000������ֵ�½�100");
			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 1000);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 100);
			Print.state();
		} else if (Math.random() * 10 > 1) {
			System.out.println("���һ���ͼ��书�ؼ�������һ���о���ս������500������ֵ�½�50");

			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 500);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 50);
			Print.state();
		} else {
			System.out.println("��ʲô��û�м�");
			Print.state();
		}
	}

}
