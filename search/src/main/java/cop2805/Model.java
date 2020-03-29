package cop2805;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Model {
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
    private static Controller SearchController;
    public static void addFile(String fileName, boolean existence, Date modified){ //Experimental
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = null;
    try{
        et = em.getTransaction();
        et.begin();
        FileDoc Document = new FileDoc();
        Document.setFileName(fileName);
        Document.setExistence(existence);
        Document.setModified(modified);
        em.persist(Document);
        et.commit();
    }catch(Exception L){
    if(et!=null)et.rollback();
    L.printStackTrace();
    }finally{em.close();}
}
    public static void getFile() { //Currently used as test function within Controller.AddListener
        EntityManager em = emf.createEntityManager();
        TypedQuery<FileDoc> query = em.createQuery("SELECT x FROM FileDoc x",FileDoc.class);
        List<FileDoc> results = query.getResultList();
        System.out.println(results);
}
    public static void rmFile() { //I dont believe this works yet
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("DELETE FROM FileDoc ");
    }
    public static void regenerateIndex(){ //Does not work yet
/*        EntityManager em = emf.createEntityManager();
        em.refresh();
        em.createQuery("SELECT x FROM FileDoc x").setHint(QueryHints.REFRESH, true).getResultList();
 */
    }

}
