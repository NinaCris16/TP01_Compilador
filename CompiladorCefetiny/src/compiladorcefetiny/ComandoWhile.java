package compiladorcefetiny;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aline, Eduardo Cotta, Luiz, Pedro Lucas e Ruan
 */
public class ComandoWhile implements Comando {

    private String expressao;
    private PseudoListaExecucao listaComandos;

    public ComandoWhile(String expressao, PseudoListaExecucao listaComandos) {
        this.expressao = expressao;
        this.listaComandos = listaComandos;
    }

    @Override
    public void execute() {
        try {
            if (ValidaSemantica.validaExpressao(expressao).equals("boolean")) {
                while (Expressao.Exp.calcula(expressao).equals("true")) {
                    for (int i = 0; i < listaComandos.getPseudolistaComandos().size(); i++) {
                        listaComandos.getPseudolistaComandos().get(i).execute();
                    }
                }
            }else{
                //Exception
            }
        } catch (ExcecaoExpressaoInvalida ex) {
            Logger.getLogger(ComandoWhile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
