package room;

//���幤����----�ӱ߹���
public class RiverFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new River();
	}

}
