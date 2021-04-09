package enemy;

//原型模式(浅克隆)----守卫类，游戏中基本敌方战斗单位
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
