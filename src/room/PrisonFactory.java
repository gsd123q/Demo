package room;

//工厂模式具体工厂类----监狱工厂
public class PrisonFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new Prison();
	}

}
