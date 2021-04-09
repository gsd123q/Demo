package room;

//具体工厂---仓库工厂
public class WarehouseFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub

		return new Warehouse();
	}

}
