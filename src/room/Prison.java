package room;

import bloodcalculate.Bloodcalculate;
import bloodcalculate.BloodcalculateA;
import bloodcalculate.BloodcalculateB;
import bloodcalculate.BloodcalculateC;
import enemy.Guard;
import role.RoleSingleton;

//工厂模式具体产品类----监狱  ，策略模式中的环境类，选择伤害计算公式
public class Prison implements Room {
	// 计算剩余血量的方法

	private Bloodcalculate calculate;// 血量计算策略

	public float calculate(RoleSingleton role, Guard Guard) {

		return calculate.calculate(role, Guard);

	}

	public void setCalculate(Bloodcalculate x) {
		this.calculate = x;
	}

	public void display() {
		// 创建Prison对象主要是为了调用伤害计算公式
		Prison prison = new Prison();
		// 检测是否已经有角色

		System.out.println("这里是监狱");

		// 模拟监狱看守对象
		Guard guard1, guard2, guard3, guard4;
		guard1 = new Guard();
		guard2 = guard1.clone();
		guard3 = guard1.clone();
		guard4 = guard1.clone();
		guard1.setZhanli(500);
		guard2.setZhanli(1000);
		guard3.setZhanli(2000);
		guard4.setZhanli(3000);
		// 使用策略模式计算剩余血量

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
			System.out.println("你已经成功救出美女");
		} else {
			System.out.println("你已战败，请变得更强后再战");
		}

	}
}
