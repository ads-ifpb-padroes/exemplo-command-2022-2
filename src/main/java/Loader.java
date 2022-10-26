import comandos.ComandoLigarSom;
import comandos.ComandoLigarTV;
import dispositivos.Som;
import dispositivos.TV;
import sistemaautomatizado.Comando;
import sistemaautomatizado.SistemaAutomatizado;

import java.util.Date;

public class Loader {

    public static void main(String[] args) {
        SistemaAutomatizado sistemaAutomatizado = new SistemaAutomatizado();
        Comando comandoLigarTV = new ComandoLigarTV(new TV());
        Comando comandoLigarSom = new ComandoLigarSom(new Som(), new Date());

        sistemaAutomatizado.addComandoEntrar(comandoLigarTV, comandoLigarSom);
        sistemaAutomatizado.entrar();
    }

}
