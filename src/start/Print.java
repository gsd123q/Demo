package start;

import role.Caretaker;
import role.RoleSingleton;

//��ӡһЩ��Ҫ�ظ����ֵ���Ϣ
public class Print {
	// ��������
	public static boolean replay() {

		System.out.println("�Ƿ�Ҫ���¿�ʼ��Ϸ����/��");
		String str;
		// ѭ����ֹ�û�������Ч��Ϣ
		while (true) {
			String str1 = Client.scan.next();
			if (str1.equals("��")) {
				str = str1;
				Caretaker c = new Caretaker();
				RoleSingleton.getInstance().restoreMemento(c.getMemento(0));
				Print.welcome();
				Print.state();
				break;
			} else if (str1.equals("��")) {
				str = str1;
				break;
			} else {
				System.out.println("��������Ч��Ϣ��");
			}
		}
		if (str.equals("��")) {
			return true;
		} else if (str.equals("��")) {
			return false;
		} else {
			return false;
		}
	}

	public static void welcome1() {
		System.out.println("��������Ҫȥ�ĵط���ִ�б���Ȳ���");
	}

	public static void welcome() {
		System.out.println("����һ����Ϸ����ϷĿ���ǵ�����Ӫ����Ů");
		System.out.println("������ʱ�򶼿���ѡ��ȥ�ʹ�,����,�ӱ�,��ջ,�ֿ�,��������Ҫȥ�ĵط�,����exit�˳�,save����,restore��ȡ");
	}

	public static void gameover() {
		System.out.println("��Ϸ������");
	}

	public static void state() {

		System.out.println("������Ѫ���ǣ�" + RoleSingleton.getInstance().getBlood());
		System.out.println("ս���ǣ�" + RoleSingleton.getInstance().getZhanli());
		System.out.println("����ֵ�ǣ�" + RoleSingleton.getInstance().getJingshen());
		if (RoleSingleton.getInstance().isWeapon() == true) {
			System.out.println("���콣");
		}
		if (RoleSingleton.getInstance().isBarde() == true) {
			System.out.println("���Ӽ�");
		}
		if (RoleSingleton.getInstance().isHelmet() == true) {
			System.out.println("�Ͻ��");
		}
	}

}
