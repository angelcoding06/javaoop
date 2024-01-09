package oop1_6;
public class TestDrive {
    public static void main(String[] args) {
					Engine e = new Engine();
					e.setManufacturer("Ferrari");
					e.setDisplacement(3000);

					Car c = new Car(e);
					c.setBrand("ferrari");
					c.setModel("f40");

					//RPM
					c.goFaster();
					System.out.println(c.getCurrentSpeed());
					c.goFaster();
					System.out.println(c.getCurrentSpeed());
					c.goFaster();
					System.out.println(c.getCurrentSpeed());
					c.goFaster();
					System.out.println(c.getCurrentSpeed());
					
				}
}
