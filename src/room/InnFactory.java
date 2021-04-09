package room;

//工厂方法模式中的具体工厂类---客栈工厂
public class InnFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub

		return new Inn();
	}

}
