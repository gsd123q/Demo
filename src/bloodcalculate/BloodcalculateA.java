package bloodcalculate;

//����ģʽ��������࣬��ͨ״̬���㷽��
import enemy.Guard;
import role.RoleSingleton;

public class BloodcalculateA implements Bloodcalculate {

	@Override
	public float calculate(RoleSingleton role, Guard Guard) {
		float blood = 0;
		blood = RoleSingleton.getInstance().getBlood()
				- (1000000 * (Guard.getZhanli() / RoleSingleton.getInstance().getZhanli()));
		return blood;
	}

}
