package room;

//��������ģʽ�еľ��幤����---��ջ����
public class InnFactory implements RoomFactory {

	@Override
	public Room produceRoom() {
		// TODO Auto-generated method stub

		return new Inn();
	}

}
