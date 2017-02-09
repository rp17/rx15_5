package model;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main starting");
		AgentList agList = new AgentList();
		agList.print();
		SensorList sensList = new SensorList();
		sensList.print();
	}

}
