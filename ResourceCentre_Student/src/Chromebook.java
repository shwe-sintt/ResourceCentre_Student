
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = super.toString();
		// Write your codes here
		output+=String.format("%-20d\n", os);
		return output;
	}
}


