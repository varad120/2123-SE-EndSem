
public abstract class Realwood extends Wardrobe {
	public Wardrobe wardbe;
	public abstract String getDescription();
	
	public Doors getDoors() {
		return wardbe.getDoors();
	}
}
