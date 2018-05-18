package desktopStudy;

public class Creat {
	//フィールド
	//フィールド及びメソッドをメンバという
	String creatName;
	Integer vitality = 300;
	static Integer countCreat = 0;
	Integer economy = 20;
	//コンストラクタ
	Creat(Integer vitality, String creatName, Integer economy){
		countCreat++;
		this.creatName = creatName;
		this.vitality = vitality;
		this.economy = economy;
		System.out.println("新たな生物が誕生しました");
		vitalityIntroduce();
		creatNameIntroduce();
		countCreatIntroduce();
	}

	Creat(Integer vitality, String creatName){
		this(vitality, creatName, 30);
	}

	Creat(Integer vitality){
		this(vitality, "名前がないよ");
	}

	Creat(){
		this(10);
	}
//メソッド
	void eat() {
		System.out.println("食事をします");
		vitalityIntroduce();
		vitalityCharge();
		System.out.println("食べ終わりました");
		vitalityIntroduce();
	}

	void vitalityCharge() {
		vitality += 100;
	}

	void vitalityIntroduce() {
		System.out.println("現在の体力: " + vitality);
		vitality -= economy;
	}

	void countCreatIntroduce() {
		System.out.println("生物の合計: " + countCreat);
		vitality -= economy;
	}

	void creatNameIntroduce() {
		System.out.println("名前は..." + creatName + "!!");
		vitality -= economy;
	}

	void allIntroduce() {
		vitalityIntroduce();
		countCreatIntroduce();
		creatNameIntroduce();
		vitality -= economy;
	}
}
