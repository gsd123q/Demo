package room;

//具体工厂类----河边工厂
public class RiverFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new River();
	}

}
