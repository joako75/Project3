package cop2805;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FileDoc {
    @Id
    int fileID;
    String fileName;
    boolean exists;
    boolean modified;//Supposed to be date/time

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean getExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean getModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

}
