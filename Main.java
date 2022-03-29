public class Main{
	public static void main(String[] args){
		Hero h =new Hero();
		Wepon w = new Wepon(10);
		Wepon w2 = new Wepon(20);
		System.out.printf("%sの攻撃力：%d%n",h.name,h.currentAttack);
		h.equip(w);
		System.out.printf("%sの攻撃力：%d%n",h.name,h.currentAttack);
		h.equip(w2);
		System.out.printf("%sの攻撃力：%d%n",h.name,h.currentAttack);
		h.unEquip();
		System.out.printf("%sの攻撃力：%d%n",h.name,h.currentAttack);
		h.equip(w2);
		System.out.printf("%sの攻撃力：%d%n",h.name,h.currentAttack);
	}
}
