package lambda;

interface Drawable {
	abstract void draw();
}

public class E1 {

	public static void main(String[] args) {
		
		Drawable d = new Drawable() {

			@Override
			public void draw() {
				System.out.println("displaying interface");			
			}		
		};
		d.draw();
	}
}
