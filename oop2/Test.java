package oop2;

public class Test {
	    public static void main(String[] args) {
				User u = new User();
				u.setId(1);
				u.setName("Jhon");
				u.setUsername("admin");
				u.setPassword("1234");
				u.setGuest(false);

				User u2 = new User();
				u2.setId(0);
				u2.setName("miname");
				u2.setUsername("miusername");
				//no password
				u2.setGuest(true);

				User u3 = new User("my usernmae", "my password");
				u3.setName("Bart");
				u3.setGuest(false);

				User u4 = new User(1, "mateo", "mat", "password", true);
				System.out.println(u4.getName());
			}
}
