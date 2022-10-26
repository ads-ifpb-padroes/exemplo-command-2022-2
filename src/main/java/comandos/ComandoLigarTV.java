package comandos;

import dispositivos.TV;
import sistemaautomatizado.Comando;

public class ComandoLigarTV implements Comando {

    private TV tvASerLigada;

    public ComandoLigarTV(TV tvASerLigada) {
        this.tvASerLigada = tvASerLigada;
    }

    @Override
    public void executar() {
        this.tvASerLigada.ligar();
    }
}
