
public class PullUp extends Endurance{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Biceps,Muscle.Arms};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 7.5;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 6.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 4.8;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "PullUp";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 7.5;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 6.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 4.8;
		}
		
		return rate;
	}
	
}

