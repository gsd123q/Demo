package room;

import Facade.EquipFacade;
import role.RoleSingleton;
import start.Client;
import start.Print;

//�����Ʒ��---�ֿ⣬
public class Warehouse implements Room {

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("�����ǲֿ�");
		System.out.println("����Ҫʹ��װ������ж��װ������ʲô����������װ��/ж��/������");
		while (true) {
			String str = Client.scan.next();
			if (str.equals("װ��")) {
				System.out.println("��Ҫװ��ʲô������/����/ͷ��");
				String str1 = Client.scan.next();
				if (str1.equals("����")) {

					if (RoleSingleton.getInstance().isWeapon() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onWeapon();
						System.out.println();
						RoleSingleton.getInstance().setWeapon(true);
						Print.state();
						break;
					} else {
						System.out.println("���Ѿ�װ��������");
						Print.state();
						break;
					}

				} else if (str1.equals("����")) {

					if (RoleSingleton.getInstance().isBarde() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onBarde();
						System.out.println();
						RoleSingleton.getInstance().setBarde(true);
						Print.state();
						break;
					} else {
						System.out.println("���Ѿ�װ�ϻ��ף�");
						Print.state();
						break;
					}

				} else if (str1.equals("ͷ��")) {

					if (RoleSingleton.getInstance().isHelmet() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onHelmet();
						System.out.println();
						RoleSingleton.getInstance().setHelmet(true);
						Print.state();
						break;
					} else {
						System.out.println("���Ѿ�װ��ͷ����");
						Print.state();
						break;
					}

				}

			} else if (str.equals("ж��")) {
				System.out.println("��Ҫж��ʲô������/����/ͷ��");
				String str1 = Client.scan.next();
				if (str1.equals("����")) {

					if (RoleSingleton.getInstance().isWeapon() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offWeapon();
						System.out.println();
						RoleSingleton.getInstance().setWeapon(false);
						Print.state();
						break;
					} else {
						System.out.println("��û�г�������");
						Print.state();
						break;
					}

				} else if (str1.equals("����")) {

					if (RoleSingleton.getInstance().isBarde() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offBarde();
						System.out.println();
						RoleSingleton.getInstance().setBarde(false);
						Print.state();
						break;
					} else {
						System.out.println("��û�д����ף�");
						Print.state();
						break;
					}

				} else if (str1.equals("ͷ��")) {

					if (RoleSingleton.getInstance().isHelmet() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offHelmet();
						System.out.println();
						RoleSingleton.getInstance().setHelmet(false);
						Print.state();
						break;
					} else {
						System.out.println("��û�д�ͷ����");
						Print.state();
						break;
					}

				}

			}

			else if (str.equals("������")) {
				System.out.println("��ʲô��û�����뿪�˲ֿ�");
				break;
			}
		}

	}

}
