package start;

import role.Caretaker;
import role.RoleSingleton;

//打印一些需要重复出现的信息
public class Print {
	// 重玩提醒
	public static boolean replay() {

		System.out.println("是否要重新开始游戏？是/否");
		String str;
		// 循环防止用户输入无效信息
		while (true) {
			String str1 = Client.scan.next();
			if (str1.equals("是")) {
				str = str1;
				Caretaker c = new Caretaker();
				RoleSingleton.getInstance().restoreMemento(c.getMemento(0));
				Print.welcome();
				Print.state();
				break;
			} else if (str1.equals("否")) {
				str = str1;
				break;
			} else {
				System.out.println("请输入有效信息！");
			}
		}
		if (str.equals("是")) {
			return true;
		} else if (str.equals("否")) {
			return false;
		} else {
			return false;
		}
	}

	public static void welcome1() {
		System.out.println("请输入你要去的地方或执行保存等操作");
	}

	public static void welcome() {
		System.out.println("这是一个游戏，游戏目标是到监狱营救美女");
		System.out.println("你大多数时候都可以选择去皇宫,监狱,河边,客栈,仓库,请输入你要去的地方,输入exit退出,save保存,restore读取");
	}

	public static void gameover() {
		System.out.println("游戏结束！");
	}

	public static void state() {

		System.out.println("你现在血量是：" + RoleSingleton.getInstance().getBlood());
		System.out.println("战力是：" + RoleSingleton.getInstance().getZhanli());
		System.out.println("精神值是：" + RoleSingleton.getInstance().getJingshen());
		if (RoleSingleton.getInstance().isWeapon() == true) {
			System.out.println("倚天剑");
		}
		if (RoleSingleton.getInstance().isBarde() == true) {
			System.out.println("锁子甲");
		}
		if (RoleSingleton.getInstance().isHelmet() == true) {
			System.out.println("紫金盔");
		}
	}

}
