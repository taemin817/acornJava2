package generic.printer;

// 제네릭 클래스 만들기
public class G3dPrinter<T> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		System.out.println("3d print" + material);
	}
}
