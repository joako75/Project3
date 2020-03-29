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
}

