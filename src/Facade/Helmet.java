package Facade;

import role.RoleSingleton;

//���ģʽ��ϵͳ��--ͷ������ͷ��ʱѪ����������5000
public class Helmet implements Equip {
	public void on() {

		System.out.print("װ�����Ͻ��\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 5000);
	}

	public void off() {

		System.out.print("ж�����Ͻ��\t");
		RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() - 5000);
	}
}
