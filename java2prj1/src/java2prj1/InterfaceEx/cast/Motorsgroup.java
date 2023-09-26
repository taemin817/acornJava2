package java2prj1.InterfaceEx.cast;

public class Motorsgroup implements Volkswagen{

	String name;
	int since;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	
	public Motorsgroup(String name, int since) {
		super();
		this.name = name;
		this.since = since;
	}
	
	@Override
	public String toString() {
		return "volkswagen [name=" + name + ", since=" + since + "]";
	}
	
	@Override
	public String including(Object son) {
		Motorsgroup vw = (Motorsgroup) son;
		return this.name+" : "+vw.since;
	}
	
	
}
