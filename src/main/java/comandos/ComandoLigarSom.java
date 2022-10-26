package comandos;

import dispositivos.Som;
import sistemaautomatizado.Comando;

import java.util.Date;

public class ComandoLigarSom implements Comando {

    private Som somASerLigado;
    private Date dataAtivacao;

    public ComandoLigarSom(Som somASerLigado, Date dataAtivacao) {
        this.somASerLigado = somASerLigado;
        this.dataAtivacao = dataAtivacao;
    }

    @Override
    public void executar() {
        this.somASerLigado.ligar(this.dataAtivacao);
    }
}
