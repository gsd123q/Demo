package room;

//工厂模式具体工厂类----皇宫工厂
public class PalaceFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new Palace();
	}

}
