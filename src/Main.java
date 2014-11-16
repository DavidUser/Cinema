import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import entity.Usuario;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("Postgresql");
		EntityManager manager = factory.createEntityManager();

		try {
			manager.getTransaction().begin();

			// Usuario david = 
				// manager.find(Usuario.class, "Joao");
				//new Usuario();
			// david.setLogin("Joao");
			// david.setSenha("12345");
			
			java.util.List<Usuario> users = 
				manager.createQuery("FROM Usuario").getResultList();
				// createCriteria(Usuario.class).list();
			manager.getTransaction().commit();
			
			System.out.println("Start List:");
			for ( Usuario user : users )
				System.out.println(user.getLogin());
			System.out.println("End List.");
			//manager.remove(david);

		} catch (Exception e) {
		}

		manager.close();
		factory.close();
	}

}
