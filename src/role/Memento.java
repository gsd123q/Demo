package role;

//备忘录模式备忘录
public class Memento {
	private float blood;
	private float zhanli;
	private float jingshen;
	private boolean weapon;
	private boolean barde;
	private boolean helmet;

	public Memento(float blood, float zhanli, float jingshen, boolean weapon, boolean barde, boolean helmet) {
		this.blood = blood;
		this.zhanli = zhanli;
		this.jingshen = jingshen;
		this.weapon = weapon;
		this.barde = barde;
		this.helmet = helmet;
	}

	public boolean isWeapon() {
		return weapon;
	}

	public void setWeapon(boolean weapon) {
		this.weapon = weapon;
	}

	public boolean isBarde() {
		return barde;
	}

	public void setBarde(boolean barde) {
		this.barde = barde;
	}

	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public float getZhanli() {
		return zhanli;
	}

	public void setZhanli(float zhanli) {
		this.zhanli = zhanli;
	}

	public float getBlood() {
		return blood;
	}

	public void setBlood(float blood) {
		this.blood = blood;
	}

	public float getJingshen() {
		return jingshen;
	}

	public void setJingshen(float jingshen) {
		this.jingshen = jingshen;
	}

}
