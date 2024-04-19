/*
    SIGAM(SISTEMA DE GERENCIAMENTO PARA ASSOCIAÇÃO DE MORADORES
    Este sistema foi desenvolvido para treinamento em levantamento dos requisitos
modelagem e codificação.
    Embora tenha sido um projeto de aprendizagem, vale salientar que todas as 
informações foram levantadas junto a uma associação, identificando todas as 
funcionalidades que a entidade necessitaria em um sistema que os auxiliasse em 
sua administração.
*/

package run;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager.LookAndFeelInfo;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import view.SplashScreen;

/**
 * @NOME............: Sigam.java
 * @DATA CRIAÇÃO....: 18 de abr. de 2022,18:38:30
 * @EMPRESA.........: Systems Development Center
 * @DATA MANUTENÇÃO.: 
 * @AUTOR...........: Hermano Pereira de Sousa
 * @OBJETIVO........: 
 */
public class SIGAM {

    /**
     * 
     * @param args 
     * @método: main()
     * @objetivo: executar o sistema.
     */
    public static void main(String[] args) {
        
        for (LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    
                    try {
                        setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(SIGAM.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
        }
//        Apresentacao apresentacao = new Apresentacao();
//        apresentacao.setVisible(true);
       java.awt.EventQueue.invokeLater(() -> {
           new SplashScreen().setVisible(true);
        });
    }

}