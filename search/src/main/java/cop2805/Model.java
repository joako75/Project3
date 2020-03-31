package cop2805;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
/*
The model describes the API, a set of methods used to interact with the database.
 */
public class Model {
/*
An instance of the EntityManagerFactory is created, named emf and accepts a persistenceUnitName argument.
The persistence.xml file describes the persistence unit "DerbyDB".
*/
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
/*
The addFile method persists a fileDoc entity in the database. This method can be called in the maintenance view UI
This method is called by addJButton in the view (OuterFrame). The event handling for the addJbutton can be modified
in the
 */
    public static void addFile(String fileName, boolean existence, Date modified){
/*
EntityManager em is created, giving access to the EntityManager API to work with the FileDoc objects in the DB.
EntityTransaction et is created and given access to the EntityTransaction interface through em.
et starts the transaction, a FileDoc entity is created and named Document.
em stores the entity in the database and then et writes the changes.
 */
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
/*
The getFile method uses a JPQL statement to query the database
 */
    public static void getFile() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<FileDoc> query = em.createQuery("SELECT x FROM FileDoc x",FileDoc.class);
        List<FileDoc> results = query.getResultList();
        System.out.println(results);
}
/*
The rmFile method uses a JPQL statement to Delete a a record from the database
 */
    public static void rmFile() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("DELETE FROM FileDoc ");
    }
/*
The regenerateIndex method...
 */

    public static void regenerateIndex(){

    }

}
