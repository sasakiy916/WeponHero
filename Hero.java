public class Hero{
	String name = "勇者";
	int attack = 10;
	int currentAttack = this.attack;
	boolean isWepon = false;
	public void equip(Wepon w){
		if(!isWepon){
			System.out.println(w.name + "を装備した");
			isWepon = true;
			this.currentAttack += w.attack;
		}else{
			System.out.println("既に装備してます");
		}
	}
	public void unEquip(){
		isWepon = false;
		this.currentAttack = this.attack;
		System.out.println("装備を外した。");
	}
}
