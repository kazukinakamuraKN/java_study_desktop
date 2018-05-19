package java_this;

public class Cleric {
	//フィールド名は先頭以外の頭文字大文字
	//finalなfieldは大文字
	String clericName;
	int clericHp = 50;
	final int CLERIC_MAX_HP = 50;
	int clericMp = 10;
	final int CLERIC_MAX_MP = 10;
	//メソッド名は先頭以外の頭文字大文字
	void clericSelfAid() {
		this.clericMp -= 5;
		this.clericHp = this.CLERIC_MAX_HP;
	}
//考え方的にはあってたからOK
	int clericPray(int clericPrayTime) {
		int aidHp = 0;
		aidHp = clericPrayTime + (int)(Math.random() * 2);
		return aidHp;
	}
}
