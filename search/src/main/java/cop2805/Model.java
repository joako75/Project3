package cop2805;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.io.File;
public class Model {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
    public static void addFile(String fileName, boolean existence, Date modified) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        FileDoc Document = new FileDoc(fileName, existence, modified);
        OuterFrame.dbmodel.addRow(Document);
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(Document);
            et.commit();
        } catch (Exception L) {
            if (et != null) et.rollback();
            L.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void rmFile(int fileID) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        FileDoc fileToDel;
        try {
            et = em.getTransaction();
            et.begin();
            fileToDel = em.find(FileDoc.class, fileID);
            em.remove(fileToDel);
            et.commit();
        } catch (Exception L) {
            if (et != null) et.rollback();
            L.printStackTrace();
        }
    }

    public static List<FileDoc> getFile() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<FileDoc> query = em.createQuery("SELECT x FROM FileDoc x", FileDoc.class);
        List<FileDoc> results = query.getResultList();
        return results;
    }
}


