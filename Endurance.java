public abstract class Endurance implements Fitness{
	
	public abstract Muscle [ ] muscleTargeted();
	
	public abstract double calorieLoss(Intensity intensity, double weight, int duration);
	
	@Override
	public String description() {
		return "Endurance is all about sweat and patience.";
	}

	public abstract double get_rate(Intensity intensity);
}
