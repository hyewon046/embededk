package javabasic.exoop1;

public class RobotVaccumcleaner {
	String company;
	String name;
	int version;
	
	Vaccumcleaner cleaner;
	Entity entity;
	
	public RobotVaccumcleaner() {
	}

	public RobotVaccumcleaner(String company, String name, int version, Vaccumcleaner cleaner, Entity entity) {
		super();
		this.name = name;
		this.cleaner = cleaner;
		this.entity = entity;
	}
	
	public String getname() {
		return this.name;
	}

	
}
