package Tabela;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * AlunoMarcos
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

    String nome();

    String numeroDovendedor();

    int codigoDoProduto();



}
