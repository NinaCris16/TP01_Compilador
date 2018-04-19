package compiladorcefetiny;

import java.util.List;

/**
 *
 * @author Aline, Eduardo Cotta, Luiz, Pedro Lucas e Ruan
 */
public class PseudoComando {

    private List<PseudoComando> pseudoLista;
    private String stringComando;
    private String tipoComando;
    private boolean foiPreenchido;
    private boolean fimComandos;

    public PseudoComando(List<PseudoComando> pseudoLista, String stringComando, String tipoComando, boolean foiPreenchido) {
        this.pseudoLista = pseudoLista;
        this.stringComando = stringComando;
        this.tipoComando = tipoComando;
        this.foiPreenchido = foiPreenchido;
    }

    public List<PseudoComando> getPseudoLista() {
        return pseudoLista;
    }

    public String getStringComando() {
        return stringComando;
    }

    public String getTipoComando() {
        return tipoComando;
    }

    public boolean isPreenchido() {
        return foiPreenchido;
    }

    public boolean isFim() {
        return fimComandos;
    }

}
