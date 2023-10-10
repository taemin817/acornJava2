package 추석;

public class Palindrome {

	public boolean palin(String a) {
		boolean b=true;
		a=a.toUpperCase();
		int c = a.length();
		for(int i = 0; i<c/2;i++) {
			if(a.charAt(i)!=a.charAt(c-i-1))
					b=false;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean s = p.palin("lol");
		System.out.println(s);
	}
}
