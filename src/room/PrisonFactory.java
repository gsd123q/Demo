package room;

//����ģʽ���幤����----��������
public class PrisonFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub
		return new Prison();
	}

}
