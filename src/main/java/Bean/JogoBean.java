package Bean;

import java.util.Date;
import java.util.Random;
import dao.JogoDao;
import entidade.Jogo;

public class JogoBean {
	
	Jogo jogo = new Jogo();
	
	public void salvar() {
		
		JogoDao jogoDao = new JogoDao();
		jogoSets();
		
		jogoDao.salvar(jogo);
		
	}
	
	public void jogoSets() {
		Random gerador = new Random();
		Date dataHora = new Date();
		jogo.setDataCriação(dataHora);
		jogo.setV1(gerador.nextInt(30));
		jogo.setV2(gerador.nextInt(30));
		jogo.setV3(gerador.nextInt(30));
		jogo.setV4(gerador.nextInt(30));
		jogo.setV5(gerador.nextInt(30));
		jogo.setV6(gerador.nextInt(30));
		jogo.setV7(gerador.nextInt(30));
		jogo.setV8(gerador.nextInt(30));
		jogo.setV9(gerador.nextInt(30));
		jogo.setV10(gerador.nextInt(30));
	}

}
