public class Profile {
	
	private int age;
	private double weight;
	private double height;
	private Gender gender;
	
	public Profile(int age, double height, double weight, Gender gender) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	@Override 
	public String toString() {
		return "Age " + this.age + ", Weight " + this.weight + "kg, Height " + (double) Math.round(this.height * 10.0)/10 + "m, Gender " + this.gender;
	}
	
	public double calcBMI() {
		return weight / (Math.pow(height, 2));
	}
	
	public double dailyCalorieIntake() {
		double BMR = 0.0;
		if(gender == Gender.MALE) {
			BMR = 66.47 + (13.75 * weight) + (5.003 * (height * 100)) - (6.755 * age);
		}
		else if(gender == Gender.FEMALE) {
			BMR = 655.1 + (9.563 * weight) + (1.85 * (height * 100)) - (4.676 * age);
		}
		
		return BMR;
	}
	
}
