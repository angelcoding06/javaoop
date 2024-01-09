package oop2;

public class User {
	private int id;
	private String name;
	private String username;
	private String password;
	private boolean guest;

	// First constructor, empty constructor,
	public User(){

	}
	// Constructor with 1 param, id
	public User(int id){
		this.id = id;
	}
	// Constructor with 2 params, username and isguest
	public User(String username , boolean isguest){
		this.username = username;
		this.guest = isguest;
	}
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}

	public User(int id, String name, String username, String password, boolean guest){
		this(username, password); //This reference the constructor with 2 params, always hast to be the first line
		this.id = id;
		this.name = name;
		// this.username = username;
		// this.password = password;
		this.guest = guest;

	}

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public boolean isGuest(){
		return this.guest;
	}
	public void setGuest(boolean guest){
		this.guest = guest;
	}
}
