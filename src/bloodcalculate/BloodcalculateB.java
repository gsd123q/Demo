package bloodcalculate;

//����ģʽ��������࣬����ֵ����100С��200���˺����㷽��
import enemy.Guard;
import role.RoleSingleton;

public class BloodcalculateB implements Bloodcalculate {

	@Override
	public float calculate(RoleSingleton role, Guard Guard) {
		float blood = 0;
		blood = RoleSingleton.getInstance().getBlood()
				- (5000 * (Guard.getZhanli() / RoleSingleton.getInstance().getZhanli()));
		return blood;
	}

}
