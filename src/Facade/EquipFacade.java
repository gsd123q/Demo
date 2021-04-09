package Facade;

//外观模式--外观类
public class EquipFacade {
	private Equip barde;
	private Equip helmet;
	private Equip weapon;

	public EquipFacade() {
		barde = new Barde();
		helmet = new Helmet();
		weapon = new Weapon();
	}

	public void onBarde() {
		barde.on();
	}

	public void onHelmet() {
		helmet.on();
	}

	public void onWeapon() {
		weapon.on();
	}

	public void offBarde() {
		barde.off();
	}

	public void offHelmet() {
		barde.off();
	}

	public void offWeapon() {
		barde.off();
	}
}
