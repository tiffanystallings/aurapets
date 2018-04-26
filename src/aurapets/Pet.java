package aurapets;
import java.time.LocalDateTime;
import java.time.Duration;

public class Pet {
	private String name;
	private String owner;
	private Boolean canLevelUp = false;
	private static LocalDateTime born = LocalDateTime.now();
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String newOwner) {
		owner = newOwner;
	}
	
	public Long getAgeInDays() {
		Duration dur = Duration.between(born, LocalDateTime.now());
		return dur.toDays();
	}
	
	public LocalDateTime getBirthday() {
		return born;
	}
	
	public void setBirthday(LocalDateTime date) {
		born = date;
	}
	
	public void levelUp() {
		canLevelUp = true;
	}
	
	public Boolean checkLevelUp() {
		return canLevelUp;
	}
	
}
