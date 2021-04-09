package room;

import role.RoleSingleton;
import start.Print;

//工厂模式具体产品类----皇宫
public class Palace implements Room {
	public void display() {

		// 检测是否已经有角色

		System.out.println("这里是皇宫");
		if (Math.random() * 10 > 8) {
			System.out.println("你捡到一颗生生造化丹，生命值增加2000");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 2000);
			Print.state();
		} else if (Math.random() * 10 > 5) {
			System.out.println("你捡到一页易筋经，经过学习，你的生命增加1000");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 1000);
			Print.state();
		} else if (Math.random() * 10 > 1) {
			System.out.println("你捡到一个洗髓丹，生命值增加500");
			RoleSingleton.getInstance().setBlood(RoleSingleton.getInstance().getBlood() + 500);
			Print.state();
		} else {
			System.out.println("你什么都没有捡到");
			Print.state();
		}
	}

}
