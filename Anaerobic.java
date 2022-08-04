public abstract class Anaerobic implements Fitness{
	
	public abstract Muscle [ ] muscleTargeted();
	
	public abstract double calorieLoss(Intensity intensity, double weight, int duration);
	
	@Override
	public String description() {
		return "Anaerobic means \"without oxygen.\"";
	}

	public abstract double get_rate(Intensity intensity);
}
