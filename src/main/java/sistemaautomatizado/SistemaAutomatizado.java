package sistemaautomatizado;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SistemaAutomatizado {

    private List<Comando> comandosEntrar;
    private List<Comando> comandosSair;

    public SistemaAutomatizado() {
        this.comandosEntrar = new LinkedList<>();
        this.comandosSair = new LinkedList<>();
    }

    public void addComandoEntrar(Comando ...comando) {
        this.comandosEntrar.addAll(Arrays.asList(comando));
    }

    public void addComandoSair(Comando ...comando) {
        this.comandosSair.addAll(Arrays.asList(comando));
    }

    public void entrar() {
        this.executar(comandosEntrar);
    }

    public void sair() {
        this.executar(comandosSair);
    }

    private void executar(List<Comando> comandos) {
        for (Comando comando : comandos) {
            comando.executar();
        }
    }
}
