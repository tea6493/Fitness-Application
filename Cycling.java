public class Cycling extends Aerobic{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Glutes, Muscle.Cardio, Muscle.Legs};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 14.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 8.5;
		}
		else if(intensity == Intensity.LOW) {
			rate = 4.0;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "Cycling";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 14.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 8.5;
		}
		else if(intensity == Intensity.LOW) {
			rate = 4.0;
		}
		return rate;
	}
	
}

