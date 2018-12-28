import java.util.ArrayList;


public class Module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Start " );
		
		ArrayList<Bicycle> list = new ArrayList<Bicycle>();

		Bicycle bicycle1 = new Bicycle (1, 0, 0, 1);
		list.add(bicycle1);
		
		Bicycle bicycle2 = new Bicycle (2, 2, 10, 3);
		list.add(bicycle2);
		
		list.add(new Bicycle (3, 3, 15, 3));
		
		list.add(new MountainBike (4, 4, 20, 2, 21));
		
		System.out.println("Hi Calum  The Speed of bicycle 2 is " + bicycle2.speed);
		
//		bicycle1.printStates();
//		bicycle2.printStates();
		
		for(int i=0; i<list.size(); i++){
			list.get(i).printStates();
		}
	
		
		System.out.println("End  " );
	}

}
