package src;
public class Province {
	protected String name;
	protected int cases;
	protected int deaths;
	
	public Province(String name, int cases, int death) {
		this.name = name;
		this.cases = cases;
		this.deaths = death;
	}
}
