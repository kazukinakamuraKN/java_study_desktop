package desktopStudy;

public class Human extends Creat {
	Human(){
		super.economy = 15;
	}

	//@Overrideは親クラスあるいはSuperクラスの"メソッド"をオーバーライドします
	//例えば、下記のallIntroduceをintroduceにすると、エラーを知らせてくれます
	//ついでに、なくても大丈夫です
	@Override
	void allIntroduce() {

	}
}
