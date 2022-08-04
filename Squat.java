
public class Squat extends Endurance{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Glutes,Muscle.Abs,Muscle.Back};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 7.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 5.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 2.5;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "Squat";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 7.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 5.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 2.5;
		}
		
		return rate;
	}
	
}

