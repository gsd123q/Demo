package bloodcalculate;

//策略模式具体策略类，精神值大于200的伤害计算方法
import enemy.Guard;
import role.RoleSingleton;

public class BloodcalculateC implements Bloodcalculate {

	@Override
	public float calculate(RoleSingleton role, Guard Guard) {
		float blood = 0;
		blood = RoleSingleton.getInstance().getBlood()
				- (3000 * (Guard.getZhanli() / RoleSingleton.getInstance().getZhanli()));
		return blood;
	}

}
