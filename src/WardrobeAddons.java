import Wardrobe.Doors;

public class WardrobeAddons {

	public static void main(String[] args) {
		Wardrobe wardrbe = new TwodoorLocker();
		Wardrobe wardrbes = new TwodoorMirrorLocker();
		System.out.println(wardrbe.getDescription() 
				+ " RS" + String.format("%.2f", wardrbe.cost()));
		System.out.println(wardrbes.getDescription() 
				+ " RS" + String.format("%.2f", wardrbes.cost()));
 

		Wardrobe wardrobe1 = new TwodoorRealwood();
//		wardrobe1.setDoors(Doors.THREE);
		System.out.println(wardrobe1.getDescription() 
				+ " RS" + String.format("%.2f", wardrobe1.cost()));
		
	}

}
