package room;

import bloodcalculate.Bloodcalculate;
import bloodcalculate.BloodcalculateA;
import bloodcalculate.BloodcalculateB;
import bloodcalculate.BloodcalculateC;
import enemy.Guard;
import role.RoleSingleton;

//����ģʽ�����Ʒ��----����  ������ģʽ�еĻ����࣬ѡ���˺����㹫ʽ
public class Prison implements Room {
	// ����ʣ��Ѫ���ķ���

	private Bloodcalculate calculate;// Ѫ���������

	public float calculate(RoleSingleton role, Guard Guard) {

		return calculate.calculate(role, Guard);

	}

	public void setCalculate(Bloodcalculate x) {
		this.calculate = x;
	}

	public void display() {
		// ����Prison������Ҫ��Ϊ�˵����˺����㹫ʽ
		Prison prison = new Prison();
		// ����Ƿ��Ѿ��н�ɫ

		System.out.println("�����Ǽ���");

		// ģ��������ض���
		Guard guard1, guard2, guard3, guard4;
		guard1 = new Guard();
		guard2 = guard1.clone();
		guard3 = guard1.clone();
		guard4 = guard1.clone();
		guard1.setZhanli(500);
		guard2.setZhanli(1000);
		guard3.setZhanli(2000);
		guard4.setZhanli(3000);
		// ʹ�ò���ģʽ����ʣ��Ѫ��

		if (RoleSingleton.getInstance().getJingshen() > 200) {

			prison.setCalculate(new BloodcalculateC());
		} else if (RoleSingleton.getInstance().getJingshen() > 100) {

			prison.setCalculate(new BloodcalculateB());
		} else {

			prison.setCalculate(new BloodcalculateA());
		}
		RoleSingleton.getInstance().setBlood((prison.calculate(RoleSingleton.getInstance(), guard1)));

		RoleSingleton.getInstance().setBlood((prison.calculate(RoleSingleton.getInstance(), guard2)));

		RoleSingleton.getInstance().setBlood((prison.calculate(RoleSingleton.getInstance(), guard3)));

		RoleSingleton.getInstance().setBlood((prison.calculate(RoleSingleton.getInstance(), guard4)));

		if (RoleSingleton.getInstance().getBlood() > 0) {
			System.out.println("���Ѿ��ɹ��ȳ���Ů");
		} else {
			System.out.println("����ս�ܣ����ø�ǿ����ս");
		}

	}
}
