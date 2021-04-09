package room;

import role.RoleSingleton;
import start.Print;

//工厂模式具体房间类---客栈，恢复精神值
public class Inn implements Room {

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("这里是客栈");
		if (RoleSingleton.getInstance().getJingshen() < 200) {
			RoleSingleton.getInstance().setJingshen(RoleSingleton.getInstance().getJingshen() + 100);
			System.out.println("经过休息，您的精神值增加了100");
			Print.state();
		} else {
			System.out.println("您已经精力充沛，快去救人吧！");
			Print.state();
		}
	}

}
