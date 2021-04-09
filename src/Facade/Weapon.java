package Facade;

import role.RoleSingleton;

//外观模式子系统类，武器类，有武器时战力增加5000
public class Weapon implements Equip {
	public void on() {

		System.out.print("装备了倚天剑\t");
		RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 5000);
	}

	public void off() {

		System.out.print("卸下了倚天剑\t");
		RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() - 5000);
	}
}
