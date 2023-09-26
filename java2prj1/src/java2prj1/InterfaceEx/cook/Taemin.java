package java2prj1.InterfaceEx.cook;

public class Taemin extends Cook implements 양식가능한 {
	public Taemin() {
		// TODO Auto-generated constructor stub
	}
	
	public Taemin(String name) {
		super(name);
	}

	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return "알리오올리오";
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "마르게리타";
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return "고치돈";
	}

}
