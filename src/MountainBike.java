
public class MountainBike extends Bicycle {

	// the MountainBike subclass has one field
	public int seatHeight;

	public MountainBike(int id, int startCadence, int startSpeed, int startGear, int startHeight) {
		super(id, startCadence, startSpeed, startGear);
		// TODO Auto-generated constructor stub
		this.seatHeight = startHeight;
	}

	// the MountainBikesubclass has one method
	public void setHeight(int newValue) {
		seatHeight= newValue;
	}

}