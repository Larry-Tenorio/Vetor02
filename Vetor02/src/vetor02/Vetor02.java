/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author trixti
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abril", "Maio", "Jun", "Jul",
        "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int anoAtual = LocalDate.now().getYear();
        for (int c=0;c<mes.length;c++) {
            if (anoAtual % 4 == 0 && anoAtual % 100 !=0 || anoAtual % 400 == 0) {
                tot [1] = 29;
            };
            System.out.println("O mês de " + mes[c] + " possui " + tot[c] + " dias " );
        }
    }
    
}
