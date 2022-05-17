
public abstract class Wardrobe {


		public enum Doors { TWO, THREE}; // Two doors, Three doors
		Doors door = Doors.TWO;
		String description = "Unknown door rates";
	  
		public String getDescription() {
			return description;
		}
		
		public void setDoors(Doors door) {
			this.door = door;
		}
		
		public Doors getDoors() {
			return this.door;
		}
	 
		public abstract double cost();



}
