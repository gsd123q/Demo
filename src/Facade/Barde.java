package Facade;

import role.RoleSingleton;

//���ģʽ��ϵͳ��---�����࣬������ʱѪ����������5000
public class Barde implements Equip {
	public void on() {

		System.out.print("װ�������Ӽ�\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 5000);
	}

	public void off() {

		System.out.print("ж�������Ӽ�\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() - 5000);
	}
}
