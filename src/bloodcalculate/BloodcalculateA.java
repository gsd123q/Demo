package bloodcalculate;

//策略模式具体策略类，普通状态计算方法
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
