package room;

//����ģʽ���幤����----�ʹ�����
public class PalaceFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new Palace();
	}

}
