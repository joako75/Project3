package cop2805;
import javax.persistence.*;

public class Model {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
EntityManager em = emf.createEntityManager();
}
