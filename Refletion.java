package Tabela;


import java.lang.reflect.Field;
import java.util.Arrays;

public class Refletion {
     public static void main(String[] args) {
         tabelaDoEstudante DadosDaTabela = new tabelaDoEstudante();


     Class<?> clazz = DadosDaTabela.getClass();
     System.out.println("Classe:"+ clazz);

     Field[] fields = clazz.getDeclaredFields();
     System.out.println("Campos:"+Arrays.toString(fields));

         boolean foundAnnotation = false;

         for (Field field : fields) {
             if (field.isAnnotationPresent(Tabela.class)) {
                 if (!foundAnnotation) {
                     foundAnnotation = true;

                     Tabela tabela = field.getAnnotation(Tabela.class);
                     System.out.println("Nome:" + tabela.nome());
                     System.out.println("Contado do Vendedor:" + tabela.numeroDovendedor());
                     System.out.println("Codigo do produto:" + tabela.codigoDoProduto());


                 }

                 if (!foundAnnotation) {
                     System.out.println("Não foi encontrado nenhuma anotação @Tabela.");
             }

     }

}
}
}
