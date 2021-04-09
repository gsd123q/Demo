package start;

//程序入口
import java.util.Scanner;

import role.Caretaker;
import role.RoleSingleton;
import room.InnFactory;
import room.PalaceFactory;
import room.PrisonFactory;
import room.RiverFactory;
import room.Room;
import room.RoomFactory;
import room.WarehouseFactory;

public class Client {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Print.welcome();
		// 首先创建单例对象防止输出状态信息位置出错
		RoleSingleton.getInstance();
		// 创建负责人--保存备忘录
		Caretaker c = new Caretaker();

		Room room;
		RoomFactory factory;

		// 角色对象创建

		outer: while (true) {
			String str = scan.next();
			if (str.equals("exit")) {
				Print.gameover();
				break outer;
			} else if (str.equals("save")) {
				c.setMemento(RoleSingleton.getInstance().savaMemento());
				System.out.println("保存成功！");
				Print.welcome1();
			} else if (str.equals("restore")) {
				System.out.println("请输入你要读取第几个存档，比如 1、2、3等等,注意0为初始状态");
				int i = scan.nextInt();
				try {

					RoleSingleton.getInstance().restoreMemento(c.getMemento(i));
					Print.state();
					Print.welcome1();
				} catch (Exception e) {
					System.out.println("最近没有保存记录");
					Print.welcome1();
				}

			} else if (str.equals("客栈")) {
				factory = new InnFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("河边")) {
				factory = new RiverFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("皇宫")) {
				factory = new PalaceFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("仓库")) {
				factory = new WarehouseFactory();
				room = factory.produceRoom();
				room.display();
				Print.welcome1();
			} else if (str.equals("监狱")) {
				factory = new PrisonFactory();
				room = factory.produceRoom();
				room.display();
				if (RoleSingleton.getInstance().getBlood() <= 0) {

					System.out.println("你是否要读档？是/否");
					inner: while (true) {
						String str1 = scan.next();
						if (str1.equals("是")) {
							System.out.println("请输入你要读取第几个存档，比如 1/2/3,注意0为初始状态");

							try {
								int i = scan.nextInt();
								RoleSingleton.getInstance().restoreMemento(c.getMemento(i));

								Print.state();
								Print.welcome1();
								break inner;
							} catch (Exception e) {
								System.out.println("没有找到保存的记录");
								Print.gameover();

							}
							// 判断是否要重新开始游戏
							boolean bool = Print.replay();
							if (bool == false) {
								break outer;
							} else if (bool == true) {
								break inner;
							}
						}
						if (str1.equals("否")) {
							Print.gameover();
							if (Print.replay() == false) {
								break outer;
							} else {
								break inner;
							}
						}
					}
				} else {
					Print.gameover();
//是否重新开局，多次用到重复的代码，把操作封装在了replay方法里
					if (Print.replay() == false) {
						break outer;
					}

				}

			} else {
				System.out.println("请输入有效信息！");
			}
		}
		scan.close();
	}
}
