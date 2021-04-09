package start;

//�������
import java.util.Scanner;

import role.Caretaker;
import role.RoleSingleton;
import room.InnFactory;
import room.PalaceFactory;
import room.PrisonFactory;
import room.RiverFactory;
import room.Room;
import room.RoomFactory;
import room.WarehouseFactory;

public class Client {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Print.welcome();
		// ���ȴ������������ֹ���״̬��Ϣλ�ó���
		RoleSingleton.getInstance();
		// ����������--���汸��¼
		Caretaker c = new Caretaker();

		Room room;
		RoomFactory factory;

		// ��ɫ���󴴽�

		outer: while (true) {
			String str = scan.next();
			if (str.equals("exit")) {
				Print.gameover();
				break outer;
			} else if (str.equals("save")) {
				c.setMemento(RoleSingleton.getInstance().savaMemento());
				System.out.println("����ɹ���");
				Print.welcome1();
			} else if (str.equals("restore")) {
				System.out.println("��������Ҫ��ȡ�ڼ����浵������ 1��2��3�ȵ�,ע��0Ϊ��ʼ״̬");
				int i = scan.nextInt();
				try {

					RoleSingleton.getInstance().restoreMemento(c.getMemento(i));
					Print.state();
					Print.welcome1();
				} catch (Exception e) {
					System.out.println("���û�б����¼");
					Print.welcome1();
				}

			} else if (str.equals("��ջ")) {
				factory = new InnFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("�ӱ�")) {
				factory = new RiverFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("�ʹ�")) {
				factory = new PalaceFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("�ֿ�")) {
				factory = new WarehouseFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("����")) {
				factory = new PrisonFactory();
				room = factory.produceRoom();
				room.display();
				if (RoleSingleton.getInstance().getBlood() <= 0) {

					System.out.println("���Ƿ�Ҫ��������/��");
					inner: while (true) {
						String str1 = scan.next();
						if (str1.equals("��")) {
							System.out.println("��������Ҫ��ȡ�ڼ����浵������ 1/2/3,ע��0Ϊ��ʼ״̬");

							try {
								int i = scan.nextInt();
								RoleSingleton.getInstance().restoreMemento(c.getMemento(i));

								Print.state();
								Print.welcome1();
								break inner;
							} catch (Exception e) {
								System.out.println("û���ҵ�����ļ�¼");
								Print.gameover();

							}
							// �ж��Ƿ�Ҫ���¿�ʼ��Ϸ
							boolean bool = Print.replay();
							if (bool == false) {
								break outer;
							} else if (bool == true) {
								break inner;
							}
						}
						if (str1.equals("��")) {
							Print.gameover();
							if (Print.replay() == false) {
								break outer;
							} else {
								break inner;
							}
						}
					}
				} else {
					Print.gameover();
//�Ƿ����¿��֣�����õ��ظ��Ĵ��룬�Ѳ�����װ����replay������
					if (Print.replay() == false) {
						break outer;
					}

				}

			} else {
				System.out.println("��������Ч��Ϣ��");
			}
		}
		scan.close();
	}
}
