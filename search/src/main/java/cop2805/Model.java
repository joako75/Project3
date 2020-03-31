package cop2805;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Model {
/*
An instance of the EntityManagerFactory is created, named emf and accepts a persistenceUnitName argument.
The persistence.xml file describes the persistence unit "DerbyDB".
*/
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DerbyDB");
/*
The addFile method persists a fileDoc entity in the database. This method can be called in the maintenance view UI
This method is called by addJButton in the view (OuterFrame). The event handling for the addJbutton can be modified
in the Controller.
 */
    public static void addFile(String fileName, boolean existence, Date modified){
/*
EntityManager em is created, giving access to the EntityManager API to work with the FileDoc objects in the DB.
EntityTransaction et is created and given access to the EntityTransaction interface through em.
et starts the transaction, a FileDoc entity is created with the new arguments and is named Document.
em stores the newly created Document entity in the database and then et writes the changes.
 */
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = null;
    try{
        et = em.getTransaction();
        et.begin();
        FileDoc Document = new FileDoc(fileName, existence, modified);
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
        System.out.println("New query on database...");
        EntityManager em = emf.createEntityManager();
        TypedQuery<FileDoc> query = em.createQuery("SELECT x FROM FileDoc x",FileDoc.class);
        List<FileDoc> results = query.getResultList();
        for(FileDoc filedoc: results) {
            System.out.print("FileID: " + filedoc.getFileID());
            System.out.print(" | File Name: " + filedoc.getFileName());
            System.out.print(" | File existence: " + filedoc.isExistence());
            System.out.println(" | File modified: " + filedoc.getModified());
        }
        System.out.println("End of results.\n");
    }
    /*
    The rmFile method uses the entity manager to Delete a a record from the database based off the fileID
     */
    public static void rmFile(int fileID) {
        System.out.println("Removing fileID: " + fileID);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        FileDoc fileToDel = null;
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
