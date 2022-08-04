
public class Yoga extends Flexibility{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Triceps,Muscle.Biceps};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 4.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 3.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 2.0;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "Yoga";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 4.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 3.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 2.0;
		}
		
		return rate;
	}
	
}

