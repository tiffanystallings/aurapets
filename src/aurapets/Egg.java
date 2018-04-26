package aurapets;

public class Egg extends Pet {
	private Integer progress = 0;
	
	public void checkProgress() {
		if (progress >= 100) {
			return;
		} else {
			return;
		}
	}
	
	public Integer getProgress() {
		return progress;
	}
	
	public void incrementProgress(Integer points) {
		progress += points;
		checkProgress();
	}
}
