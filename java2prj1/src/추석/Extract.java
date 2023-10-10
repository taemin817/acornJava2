package 추석;

public class Extract {
	
	public void tractor(String a) {
		String c="";
		for(char b : a.toCharArray()) {
			if(b>=48&&b<=57)
					c+=b;
		}
		System.out.println(Integer.parseInt(c)); 
	}
	
	public static void main(String[] args) {
		Extract t = new Extract();
		t.tractor("d33ff52b64bkl");
	}
}
