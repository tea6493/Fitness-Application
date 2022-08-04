import java.util.ArrayList;

public class WeeklyExercise {
	
	private ArrayList<Fitness> exerciseList;
	private int days;
	private double weeklyCalorieTarget;
	private Profile profile;
	
	public WeeklyExercise(ArrayList<Fitness> exerciseList, int days, double weeklyCalorieTarget, Profile profile) {
		this.exerciseList = exerciseList;
		this.days = days;
		this.weeklyCalorieTarget = weeklyCalorieTarget;
		this.profile = profile;
	}
	public WeeklyExercise(ArrayList<Fitness> exerciseList, Profile profile) {
		this.exerciseList = exerciseList;
		this.profile = profile;
		days = 7;
		weeklyCalorieTarget = 3500;
	}
	public void addExercise(Fitness ex) {
		exerciseList.add(ex);
	}
	public void removeExercise(Fitness ex) {
		for(int i = 0; i < exerciseList.size(); i++) {
			if(exerciseList.get(i) == ex) {
				exerciseList.remove(i);
			}
		}
	}
	public void setExerciseList(ArrayList<Fitness> list) {
		this.exerciseList = exerciseList;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public void setWeeklyCalorieTarget(double target) {
		this.weeklyCalorieTarget = weeklyCalorieTarget;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public ArrayList<Fitness> getExerciseList( ){
		return exerciseList;
	}
	public int getDays() {
		return days;
	}
	public Profile getProfile() {
		return profile;
	}
	public double getWeeklyCalorieTarget() {
		return weeklyCalorieTarget;
	}
	public ArrayList<DailyExercise> getWeeklyExercises(Intensity intensity){
		double daily_target = weeklyCalorieTarget / days;
		ArrayList<DailyExercise> result = new ArrayList<DailyExercise>();
		for(int i = 0; i < exerciseList.size(); i++){
			int rate = (int) exerciseList.get(i).get_rate(intensity);
			int duration = (int) (daily_target / (rate * profile.getWeight()));


			ArrayList<Fitness> exercise =  new ArrayList<Fitness>();
			exercise.add(exerciseList.get(i));

			DailyExercise helper = new DailyExercise(exercise, duration, daily_target, profile);
			result.add(helper);
		}
		return result;
		
	}
	public ArrayList<DailyExercise> getWeeklyExercises(){
		double daily_target = weeklyCalorieTarget / days;
		ArrayList<DailyExercise> result = new ArrayList<DailyExercise>();
		for(int i = 0; i < exerciseList.size(); i++){
			int rate = (int) exerciseList.get(i).get_rate(Intensity.LOW);
			int duration = (int) (daily_target / (rate * profile.getWeight()));


			ArrayList<Fitness> exercise =  new ArrayList<Fitness>();
			exercise.add(exerciseList.get(i));

			DailyExercise helper = new DailyExercise(exercise, duration, daily_target, profile);
			result.add(helper);
		}
		return result;
		
	}
	public String targetedCalorieLoss(double targetWeight, int withInDays) throws TargetWeightException {
		if(targetWeight < profile.getWeight()){
			double daily_calorie = (profile.getWeight() - targetWeight) * 7000 / withInDays;
			String result = String.format("You need to lose %.02f calories per day or decrease your intake from %.02f to %.02f in order to lose %.2f kg of weight", daily_calorie, profile.dailyCalorieIntake(), (profile.dailyCalorieIntake() - daily_calorie), profile.getWeight() - targetWeight);
			return result;
		}
		else{
			throw new TargetWeightException("Only works to lose weight");
		}


		
		
	}
}
