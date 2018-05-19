package java_this;
//クラス名は単語の頭を大文字
public class Hero {
	//ふぃーるど名は最初以外の単語の頭を大文字
	String heroName;
	int hp;

	//メソッド名も最初以外の単語の頭を大文字
	void sleepHero() {
		this.hp = 100;
		//ローカル変数や引数にも同じhpという名前の変数がある場合
		//そちらが優先されてしまうなど予想外の動作になる可能性がある
		//フィールドを用いるときはthisをつける
		System.out.println(this.heroName + "は眠って回復した");
	}
}
