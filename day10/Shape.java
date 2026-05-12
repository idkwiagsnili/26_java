package day10;

public abstract class Shape {
	
	String name;
	
	abstract public void draw();
	
	public void printInfo() {
		System.out.println(name);
	}
}
