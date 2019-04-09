package lab3;

public class RoomOccupancy {

	private int numberInRoom;
	static private int totalNumber;
	
	public void addOneToRoom(){
		numberInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom() {
		if(numberInRoom>1) {
		numberInRoom--;
		totalNumber--;
		}

	}
	
	public int getNumber() {
		return numberInRoom;
	}
	
	static public int getTotal() {
		return totalNumber;
	}
		
	
	
}
