package Facade;

import role.RoleSingleton;

//���ģʽ��ϵͳ�࣬�����࣬������ʱս������5000
public class Weapon implements Equip {
	public void on() {

		System.out.print("װ�������콣\t");
		RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 5000);
	}

	public void off() {

		System.out.print("ж�������콣\t");
		RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() - 5000);
	}
}
