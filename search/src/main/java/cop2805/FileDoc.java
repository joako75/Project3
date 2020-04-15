package cop2805;
import javax.persistence.*;
import java.util.Date;

@Entity
public class FileDoc {
    @Id @GeneratedValue @Column(unique=true)
    int fileID;
    @Column(unique=true)
    String fileName;
	@Column
	boolean existence;
	@Column @Temporal(TemporalType.TIMESTAMP)
    Date modified;

	public FileDoc(String fileName, boolean existence, Date modified) {
	    this.fileName=fileName;
	    this.existence = existence;
	    this.modified=modified;
	}
	public FileDoc() {
	}
	public int getFileID(){return fileID;}
	public void setFileID(int fileID){this.fileID=fileID;}
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

