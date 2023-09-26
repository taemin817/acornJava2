package generic.printer;

// 제네릭 클래스 만들기
// Material 클래스를 상속한 클래스만 담을 수 있도록 제한
public class G3dPrinter2<T extends Material> {

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
