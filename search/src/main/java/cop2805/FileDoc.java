package cop2805;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity @Data @NoArgsConstructor
public class FileDoc {
    @Id @GeneratedValue
    int fileID;
    String fileName;
    boolean existence;
    @Temporal(TemporalType.TIMESTAMP)
    Date modified;

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public boolean isExistence() {
		return existence;
	}
	public void setExistence(boolean existence) {
		this.existence = existence;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
}

