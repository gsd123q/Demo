package enemy;

//ԭ��ģʽ(ǳ��¡)----�����࣬��Ϸ�л����з�ս����λ
public class Guard implements Cloneable {
	private float zhanli;

	public float getZhanli() {
		return zhanli;
	}

	public void setZhanli(float zhanli) {
		this.zhanli = zhanli;
	}

	public Guard clone() {

		Guard clone = null;
		try {
			clone = (Guard) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return clone;
	}

}
