
public abstract class CompressedWood extends Wardrobe {
	public Wardrobe wardbe;
	public abstract String getDescription();
	
	public Doors getDoors() {
		return wardbe.getDoors();
	}
}
