package aurapets;
import java.time.LocalDateTime;

public class Juvenile extends Pet {
	public Juvenile (String name, String owner, LocalDateTime born) {
		this.setName(name);
		this.setOwner(owner);
		this.setBirthday(born);
	}
}
