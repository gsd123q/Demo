package room;

import Facade.EquipFacade;
import role.RoleSingleton;
import start.Client;
import start.Print;

//具体产品类---仓库，
public class Warehouse implements Room {

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("这里是仓库");
		System.out.println("你是要使用装备还是卸下装备还是什么都不操作？装备/卸下/不操作");
		while (true) {
			String str = Client.scan.next();
			if (str.equals("装备")) {
				System.out.println("你要装备什么？武器/铠甲/头盔");
				String str1 = Client.scan.next();
				if (str1.equals("武器")) {

					if (RoleSingleton.getInstance().isWeapon() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onWeapon();
						System.out.println();
						RoleSingleton.getInstance().setWeapon(true);
						Print.state();
						break;
					} else {
						System.out.println("你已经装上武器！");
						Print.state();
						break;
					}

				} else if (str1.equals("铠甲")) {

					if (RoleSingleton.getInstance().isBarde() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onBarde();
						System.out.println();
						RoleSingleton.getInstance().setBarde(true);
						Print.state();
						break;
					} else {
						System.out.println("你已经装上护甲！");
						Print.state();
						break;
					}

				} else if (str1.equals("头盔")) {

					if (RoleSingleton.getInstance().isHelmet() == false) {
						EquipFacade facade = new EquipFacade();
						facade.onHelmet();
						System.out.println();
						RoleSingleton.getInstance().setHelmet(true);
						Print.state();
						break;
					} else {
						System.out.println("你已经装上头盔！");
						Print.state();
						break;
					}

				}

			} else if (str.equals("卸下")) {
				System.out.println("你要卸下什么？武器/铠甲/头盔");
				String str1 = Client.scan.next();
				if (str1.equals("武器")) {

					if (RoleSingleton.getInstance().isWeapon() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offWeapon();
						System.out.println();
						RoleSingleton.getInstance().setWeapon(false);
						Print.state();
						break;
					} else {
						System.out.println("你没有持武器！");
						Print.state();
						break;
					}

				} else if (str1.equals("铠甲")) {

					if (RoleSingleton.getInstance().isBarde() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offBarde();
						System.out.println();
						RoleSingleton.getInstance().setBarde(false);
						Print.state();
						break;
					} else {
						System.out.println("你没有穿铠甲！");
						Print.state();
						break;
					}

				} else if (str1.equals("头盔")) {

					if (RoleSingleton.getInstance().isHelmet() == true) {
						EquipFacade facade = new EquipFacade();
						facade.offHelmet();
						System.out.println();
						RoleSingleton.getInstance().setHelmet(false);
						Print.state();
						break;
					} else {
						System.out.println("你没有戴头盔！");
						Print.state();
						break;
					}

				}

			}

			else if (str.equals("不操作")) {
				System.out.println("你什么都没做并离开了仓库");
				break;
			}
		}

	}

}
