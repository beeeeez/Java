
public class runAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal b;
		for (int i = 0; i < 10; i++)
		{
		    if (Math.random() < 0.5)
		    // create a dog
		    	 b = new Dog();
		    else
			//create a bird
		    	b = new Bird();
		    // now call the right move method
		    b.move();
		}
	}

}
