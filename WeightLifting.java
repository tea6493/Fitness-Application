
public class WeightLifting extends Anaerobic{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Shoulders,Muscle.Legs,Muscle.Arms,Muscle.Triceps};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 6.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 5.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 3.5;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "WeightLifting";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 6.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 5.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 3.5;
		}
		
		return rate;
	}
	
}

