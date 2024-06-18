package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pf = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(pf);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		System.out.println(pf);
		
		em.close();
		emf.close();
		
		
		
		
		
		
	}

}
