package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidade.Jogo;
import util.JPAUtil;

public class JogoDao {
	
	public void salvar(Jogo jogo) {
		EntityManager em = JPAUtil.criarEMF();
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
		em.close();
	}
	
	public void editar(Jogo jogo) {
		EntityManager em = JPAUtil.criarEMF();
		em.getTransaction().begin();
		
		if(jogo!=null) {
			em.merge(jogo);
		}
		else {
			em.persist(jogo);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public void excluir(Jogo jogo) {
		EntityManager em = JPAUtil.criarEMF();
		em.getTransaction().begin();
		
		if(jogo!=null) {
			em.remove(jogo);
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Jogo> litarJogos(){
		EntityManager em = JPAUtil.criarEMF();
		TypedQuery<Jogo> query = em.createQuery("select jogo from Jogo jogo", Jogo.class);
		List<Jogo> jogos = query.getResultList();
		return jogos;
	}
	
}
