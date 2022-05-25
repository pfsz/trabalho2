package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory em = Persistence.createEntityManagerFactory("primeiraPU");
	
	public static EntityManager criarEMF() {
		return em.createEntityManager();
	}
}
