import java.util.ArrayList;
import java.util.Arrays;

public class DailyExercise {
	
	private ArrayList<Fitness> exerciseList;
	private int duration;
	private double calorieTarget;
	private Profile profile;
	
	
	public DailyExercise(ArrayList<Fitness> exerciseList, int duration, double calorieTarget, Profile profile) {
		this.exerciseList = exerciseList;
		this.duration = duration;
		this.calorieTarget = calorieTarget;
		this.profile = profile;
	}
	
	public DailyExercise(ArrayList<Fitness> exerciseList, Profile profile) {
		this.exerciseList = exerciseList;
		this.profile = profile;
		duration = 60;
		calorieTarget = 500.0;
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
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setCalorieTarget(double target) {
		this.calorieTarget = calorieTarget;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public ArrayList<Fitness> getExerciseList( ){
		return exerciseList;
	}
	public int getDuration() {
		return duration;
	}
	public double getCalorieTarget() {
		return calorieTarget;
	}
	public Profile getProfile() {
		return profile;
	}
	public Fitness[] getExercises(Muscle[] targetMuscle) {
		ArrayList<Fitness> helper = new ArrayList<Fitness>();
		for(int i = 0; i < exerciseList.size(); i++){
			if(Arrays.asList(exerciseList.get(i).muscleTargeted()).containsAll(Arrays.asList(targetMuscle))){
				helper.add(exerciseList.get(i));
			}
		}
		Fitness[] result = (Fitness[]) helper.toArray();
		return result;
		
	}
	public Fitness[] getAllExercises(Muscle[] targetMuscle) {
		ArrayList<Fitness> helper = new ArrayList<Fitness>();
		for(int i = 0; i < exerciseList.size(); i++){
			for(int j = 0; j < targetMuscle.length; j++){
				if(Arrays.asList(exerciseList.get(i).muscleTargeted()).contains(targetMuscle[j]) == true){
					helper.add(exerciseList.get(i));
					break;
				}
			}
		}
		Fitness[] result = (Fitness[]) helper.toArray();
		return result;
	}
}
