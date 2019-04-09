package lab3;

import lab3.RoomOccupancy;

public class testRO {
	public static void main(String[] args) {
	RoomOccupancy room1 = new RoomOccupancy();
	RoomOccupancy room2 = new RoomOccupancy();

	int i=0;

	while(i<5)
	{
		room1.addOneToRoom();
		i++;
	}i=0;

	while(i<10)
	{
		room2.addOneToRoom();
		i++;
	}
	i=0;
	System.out.println("room 1 number of people : "+room1.getNumber());
	System.out.println("room 2 number of people : "+room2.getNumber());

	while(i<10)
	{
		room1.removeOneFromRoom();
		i++;
	}
	
	System.out.println("can't go negative - room 1 number of people : "+room1.getNumber());
	
	System.out.println("number of people in all rooms : " + RoomOccupancy.getTotal());
	}

}


