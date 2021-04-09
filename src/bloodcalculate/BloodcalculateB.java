package bloodcalculate;

//策略模式具体策略类，精神值大于100小于200的伤害计算方法
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
