package Facade;

import role.RoleSingleton;

//外观模式子系统类--头盔，有头盔时血量额外增加5000
public class Helmet implements Equip {
	public void on() {

		System.out.print("装备了紫金冠\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 5000);
	}

	public void off() {

		System.out.print("卸下了紫金冠\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() - 5000);
	}
}
