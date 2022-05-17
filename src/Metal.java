
public abstract class Metal extends Wardrobe {
	public Wardrobe wardbe;
	public abstract String getDescription();
	
	public Doors getDoors() {
		return wardbe.getDoors();
	}
}
