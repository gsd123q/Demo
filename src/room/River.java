package room;

import role.RoleSingleton;
import start.Print;

//工厂模式具体产品类---河边

public class River implements Room {
	public void display() {

		// 检测是否已经有角色

		System.out.println("这里是河边");
		if (Math.random() * 10 > 8) {
			System.out.println("你捡到一本高级武功秘籍，经过一番研究，战力增加2000，精神值下降200");
			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 2000);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 200);
			Print.state();
		} else if (Math.random() * 10 > 5) {
			System.out.println("你捡到一本中级武功秘籍，经过一番研究，战力增加1000，精神值下降100");
			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 1000);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 100);
			Print.state();
		} else if (Math.random() * 10 > 1) {
			System.out.println("你捡到一本低级武功秘籍，经过一番研究，战力增加500，精神值下降50");

			RoleSingleton.getInstance().setZhanli(RoleSingleton.getInstance().getZhanli() + 500);
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() - 50);
			Print.state();
		} else {
			System.out.println("你什么都没有捡到");
			Print.state();
		}
	}

}
