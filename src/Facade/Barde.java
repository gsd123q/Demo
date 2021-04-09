package Facade;

import role.RoleSingleton;

//外观模式子系统类---铠甲类，有铠甲时血量额外增加5000
public class Barde implements Equip {
	public void on() {

		System.out.print("装备了锁子甲\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 5000);
	}

	public void off() {

		System.out.print("卸下了锁子甲\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() - 5000);
	}
}
