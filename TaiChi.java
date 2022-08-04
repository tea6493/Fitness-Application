
public class TaiChi extends Flexibility{

	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = new Muscle[] {Muscle.Arms,Muscle.Legs};
		return muscle;
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 5.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 3.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 1.5;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override
	public String description() {
		return "TaiChi";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 5.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 3.0;
		}
		else if(intensity == Intensity.LOW) {
			rate = 1.5;
		}
		
		return rate;
	}
	
}

