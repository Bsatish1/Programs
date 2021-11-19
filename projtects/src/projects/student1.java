package projects;

 abstract class student2
 {
	 abstract void play();
	 
	 static void run()
	 {
		 int a=20, b=10;
		 int z;
		 System.out.println(z = a+b);
 }
	 void game()
	 {
		 System.out.println("hello");
	 }
 }

 public class student1 extends student2{
	 void play() {

		 System.out.println("This is satish");
	 }
 
	public static void main(String[] args) {
		
		student1 t = new student1();
		t.play();
		run();
		t.game();
		
	}

}
