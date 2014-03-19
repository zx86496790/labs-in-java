package lab1;

public abstract class Equipment {
private String name;
private double price;
private double time;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double getTime() {
	return time;
}

public void setTime(double time) {
	this.time = time;
}

public abstract double calculate();
}
