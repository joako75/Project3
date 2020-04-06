package cop2805;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Model {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
    public static void addFile(String fileName, boolean existence, Date modified) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            FileDoc Document = new FileDoc(fileName, existence, modified);
            em.persist(Document);
            et.commit();
        } catch (Exception L) {
            if (et != null) et.rollback();
            L.printStackTrace();
        } finally {
            em.close();
        }
    }
    public static List<FileDoc> getFile() {
        List<FileDoc> results;
        System.out.println("New query on database...");
        EntityManager em = emf.createEntityManager();
        TypedQuery<FileDoc> query = em.createQuery("SELECT x FROM FileDoc x", FileDoc.class);
        results = query.getResultList();
        for (FileDoc filedoc : results) {
            System.out.print("FileID: " + filedoc.getFileID());
            System.out.print(" | File Name: " + filedoc.getFileName());
            System.out.print(" | File existence: " + filedoc.isExistence());
            System.out.println(" | File modified: " + filedoc.getModified());
        }
        System.out.println("End of results.\n");
        return results;
    }
    public static void rmFile(int fileID) {
        System.out.println("Removing fileID: " + fileID);
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
/*
The regenerateIndex method needs to be able to refresh a managed object
Currently the method generates a new object to refresh rather than refreshing an existing one

    public static void regenerateIndex(){
        System.out.println("Checking for updated values to entity fields");
        EntityManager em = emf.createEntityManager();
        FileDoc filedoc = new FileDoc();
        em.merge(filedoc);
        em.refresh(filedoc);
    }
 */
}
