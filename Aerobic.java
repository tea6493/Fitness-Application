public abstract class Aerobic implements Fitness{
	
	public abstract Muscle [ ] muscleTargeted();
	
	public abstract double calorieLoss(Intensity intensity, double weight, int duration);
	
	@Override
	public String description() {
		return "Aerobic means \"with oxygen.\"";
	}

	public abstract double get_rate(Intensity intensity);
}
