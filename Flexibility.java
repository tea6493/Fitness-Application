public abstract class Flexibility implements Fitness{
	
	public abstract Muscle [ ] muscleTargeted();
	
	public abstract double calorieLoss(Intensity intensity, double weight, int duration);
	
	@Override
	public String description() {
		return "Flexibility is uncomfortable and it takes time, so people don't like to do it.";
	}

	public abstract double get_rate(Intensity intensity);
}
