package hero_sword;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//newによってSword()インスタンスに必要なヒープ領域を確保
		//sword1変数にヒープ領域の場所を代入
		Sword sword1 = new Sword();
		sword1.swordName = "炎の剣";
		sword1.swordDamage = 20;
		Hero hero1 = new Hero();
		//Heroクラスのインスタンスhero1変数のfireSword領域に
		//Swordクラスのインスタンスsword1変数に入っていた領域を
		//hero1変数のfireSword領域に入れる
		hero1.fireSword = sword1;
		System.out.println(hero1.fireSword.swordName);
	//インスタンス化されてできるのは参照型,参照型には領域の番号が入る
	String s = new String();
	//int i = new int();
	Integer i = new Integer(1);
	System.out.println(s);
	}

}
