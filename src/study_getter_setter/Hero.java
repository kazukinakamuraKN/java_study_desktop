package study_getter_setter;

public class Hero {
	//privateにしたことにより内部の変更が容易になる
	//たとえばnameをnewNameに変えたい場合、privateでなければ
	//ほかのクラスからはnameが直接書き換えられる。
	//しかし、setNamegetNameにしておけば、書き換えはsettergetterがら
	//行われるため、nameを変更しても問題が起こらない。
	//保守、改良が容易になる
	private String names;

	public String getName() {
		return names;
	}

	public void setName(String name) {
		this.names = name;
	}
}
