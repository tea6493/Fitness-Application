
public class Swimming extends Aerobic{
	
	private SwimmingType type;

	public Swimming (SwimmingType type) {
		this.type = type;
	}
	
	public Swimming () {
		type = SwimmingType.Freestyle;
	}
	
	public void setSwimmingType(SwimmingType type) {
		this.type = type;
	}
	
	public SwimmingType getSwimmingType() {
		return type;
	}
	
	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] muscle = null;
		
		switch (type) {
		case Butterflystroke:
			muscle = new Muscle[]{Muscle.Abs, Muscle.Back, Muscle.Shoulders, Muscle.Biceps, Muscle.Triceps};
			break;
			
		case Breaststroke:
			muscle = new Muscle[] {Muscle.Glutes, Muscle.Cardio};
			break;
			
		case Freestyle:
			muscle = new Muscle[] {Muscle.Arms, Muscle.Legs, Muscle.Cardio};
			break;
		}

		return muscle;
		
	}

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 10.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 8.3;
		}
		else if(intensity == Intensity.LOW) {
			rate = 6.0;
		}
		
		return rate * weight * (duration / 60.0);
	}

	@Override 
	public String description() {
		return "Swimming";
	}

	@Override
	public double get_rate(Intensity intensity) {
		double rate = 0.0;
		if(intensity == Intensity.HIGH) {
			rate = 10.0;
		}
		else if(intensity == Intensity.MEDIUM) {
			rate = 8.3;
		}
		else if(intensity == Intensity.LOW) {
			rate = 6.0;
		}
		
		return rate;
	}
}
