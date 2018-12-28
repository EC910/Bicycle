
public class ACMEBicycle implements BicycleInterface {

	int speed;
	@Override
	public void changeCadence(int newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub

	}


	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		speed -= decrement;
		speed = Math.max(speed, 0);
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
	}

}
