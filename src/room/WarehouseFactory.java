package room;

//���幤��---�ֿ⹤��
public class WarehouseFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub

		return new Warehouse();
	}

}
