package javaStudyAbstract;

public abstract class Human {
	String name;
	Integer vitality = 300;

	Human(String name, Integer vitality){
		System.out.println("人間誕生");
		this.name = name;
		this.vitality =vitality;
	}

	Human(String name){
		this(name, 300);
	}

	Human(){
		this("名前を決めてください");
	}
	void introduce(){
		System.out.println("私の名前は" + name + "です");
		System.out.println("体力は残り" + vitality + "です");
	}

	abstract void work();
}
