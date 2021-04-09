package role;

import start.Print;

//单例模式创建角色并充当备忘录模式中的原发器
public class RoleSingleton {
	private static RoleSingleton role = null;
	private float blood = 2000;
	private float zhanli = 1000;
	private float jingshen = 5;

	private boolean weapon = false;// 是否有装备
	private boolean barde = false;
	private boolean helmet = false;

	private RoleSingleton() {
	}

	public static RoleSingleton getInstance() {
		if (role == null) {
			role = new RoleSingleton();
			Print.state();
		}
		return role;

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

	public float getBlood() {
		return blood;
	}

	public void setBlood(float blood) {
		this.blood = blood;
	}

	public float getZhanli() {
		return zhanli;
	}

	public void setZhanli(float zhanli) {
		this.zhanli = zhanli;
	}

	public float getJingshen() {
		return jingshen;
	}

	public void setJingshen(float jingshen) {
		this.jingshen = jingshen;
	}

	// 备忘录模式保存角色状态
	public Memento savaMemento() {
		return new Memento(blood, zhanli, jingshen, weapon, barde, helmet);
	}

	public void restoreMemento(Memento memento) {
		this.blood = memento.getBlood();
		this.zhanli = memento.getZhanli();
		this.jingshen = memento.getJingshen();
		this.weapon = memento.isWeapon();
		this.barde = memento.isBarde();
		this.helmet = memento.isHelmet();

	}

}
