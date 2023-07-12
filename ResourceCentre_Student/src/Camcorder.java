//testttt
//t2
public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
//		String output = "";
=======
	//	String output = "";
>>>>>>> branch 'master' of https://github.com/shwe-sintt/ResourceCentre_Student.git
		String info = super.toString();
		info += String.format("%-20d\n", opticalZoom);
		return info;
	}
}

