package bloodcalculate;

//策略模式---抽象策略类
import enemy.Guard;
import role.RoleSingleton;

public interface Bloodcalculate {
	public float calculate(RoleSingleton role, Guard Guard);
}
