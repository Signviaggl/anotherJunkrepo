package org.git.test;

public class model {
	
	public model(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "model [name=" + name + "]";
	}
// now wonder where will this go?!
}
