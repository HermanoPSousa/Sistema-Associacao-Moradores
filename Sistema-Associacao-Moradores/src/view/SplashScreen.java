
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DebugGraphics;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * @NAME....................: SplashScreen.java
 * @AUTHOR..................: Hermano Pereira de Sousa
 * @COMPANY.................: Systems Development Center
 * @DATE CREATE.............: 18 de abr. de 2024,20:01:40
 * @DATE REFORMULATION......:
 * @DATE END OF DEVELOPMENT.:
 * @DATE MAINTENANCE........: 
 * @OBJECTIVE...............: 
 */
public class SplashScreen extends JFrame {
    
    /* declaração das variáveis */ 
    private GroupLayout layout;
    private JLabel lblInformacaoFabricante;
    private JLabel lblLicencaCliente;
    private JLabel lblLogoCliente;
    private JLabel lblLogoFabricante;
    private JLabel lblNomeSistema;
    private JLayeredPane lypnePainelInterno;
    private JLayeredPane lypnePainelMestre;
    private JProgressBar pgbarBarraProgressao;
    private JPanel pnePainelInterno;
    /* fim das declarações */



    // <editor-fold defaultstate="collapsed" desc="CONSTRUTOR - SplashScreen()">
    /**
     * @constructor: SplashScreen()
     * @objective: instantiate the class that was defined - SplashScreen.java 
     */
    public SplashScreen(){
            initComponent();
    }// </editor-fold>



    
    // <editor-fold defaultstate="collapsed" desc="initComponent()">
    /**
     * 
     * @method: initComponent()
     * @objective:  - load class components, display them.
     *              - change or receive changes to the property(s)
     *                of the components.
     *              - manipulate the action of window components.
     */
    private void initComponent(){

        /* início das instanciações */
        layout = new GroupLayout(getContentPane());
        lypnePainelMestre = new JLayeredPane();
        pnePainelInterno = new JPanel();
        lblLogoFabricante = new JLabel();
        lblInformacaoFabricante = new JLabel();
        lypnePainelInterno = new JLayeredPane();
        lblLicencaCliente = new JLabel();
        lblNomeSistema = new JLabel();
        lblLogoCliente = new JLabel();
        pgbarBarraProgressao = new JProgressBar();
        /* fim das instanciações */

        /* corpo do método */
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        
        // propriedade dos componentes e adição dos mesmos aos seus painéis
        
        lypnePainelMestre.setBackground(new Color(204, 204, 204));
            lypnePainelMestre.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
            lypnePainelMestre.setName("PAINELMESTRE");
            lypnePainelMestre.setOpaque(true);
            
        pnePainelInterno.setBorder(BorderFactory.createEtchedBorder());
            pnePainelInterno.setName("PAINELINTERNO");
            pnePainelInterno.setOpaque(false);
            pnePainelInterno.setLayout(null);
            
        lblLogoFabricante.setHorizontalAlignment(SwingConstants.CENTER);
            lblLogoFabricante.setName("LOGOFABRICANTE");
            pnePainelInterno.add(lblLogoFabricante);
            lblLogoFabricante.setBounds(330, 0, 170, 130);
            
        lblInformacaoFabricante.setFont(new Font("San Serif", 0, 12));
            lblInformacaoFabricante.setHorizontalAlignment(SwingConstants.CENTER);
            lblInformacaoFabricante.setText("<html> <p align=\"center\" > Desenvolvido por:</p> <p align=\"center\" >  SYSDEV CENTER </P> <p align=\"center\" >www.sysdevcenter.com.br </P> <p align=\"center\" >São Paulo - SP");
            lblInformacaoFabricante.setHorizontalTextPosition(SwingConstants.CENTER);
            lblInformacaoFabricante.setInheritsPopupMenu(false);
            lblInformacaoFabricante.setName("INFORMACAOFABRICANTE");
            pnePainelInterno.add(lblInformacaoFabricante);
            
        lypnePainelMestre.add(pnePainelInterno);
            pnePainelInterno.setBounds(30, 300, 820, 200);
        
        lypnePainelInterno.setName("PAINELINTERNOFABRICANTE");
        
        lblLicencaCliente.setFont(new Font("San Serif", 0, 12));
            lblLicencaCliente.setHorizontalAlignment(SwingConstants.CENTER);
            lblLicencaCliente.setText("<html><p align=\"center\"> Software licenciado para:</p> <p align=\"center\"> Associação dos Moradores do Bairro Monterrey </p><p align=\"center\"> CNPJ 67.165.043/0001-06");
            lblLicencaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
            lblLicencaCliente.setName("LICENCACLIENTE");
            lypnePainelInterno.add(lblLicencaCliente);
            lblLicencaCliente.setBounds(160, 230, 560, 50);
        
        lblNomeSistema.setFont(new Font("Tahoma", 1, 30));
            lblNomeSistema.setHorizontalAlignment(SwingConstants.CENTER);
            lblNomeSistema.setText("SIGER 1.0  - SISTEMA DE GERENCIAMENTO");
            lblNomeSistema.setName("NOMESISTEMA")        ;
            lypnePainelInterno.add(lblNomeSistema);
            lblNomeSistema.setBounds(20, 197, 820, 30);
        
        lblLogoCliente.setHorizontalAlignment(SwingConstants.CENTER);
            lblLogoCliente.setToolTipText("");
            lblLogoCliente.setVerticalAlignment(SwingConstants.TOP);
            lblLogoCliente.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
            lblLogoCliente.setFocusable(false);
            lblLogoCliente.setHorizontalTextPosition(SwingConstants.LEADING);
            lblLogoCliente.setName("LOGOCLIENTE");
            lblLogoCliente.setVerticalTextPosition(SwingConstants.TOP);
            lypnePainelInterno.add(lblLogoCliente);
            lblLogoCliente.setBounds(350, 10, 170, 183);
        
        lypnePainelMestre.add(lypnePainelInterno);
            lypnePainelInterno.setBounds(10, 10, 860, 510);
            
        pgbarBarraProgressao.setName("BARRAPROGRESSAO");
        lypnePainelMestre.add(pgbarBarraProgressao);
        pgbarBarraProgressao.setBounds(9, 530, 863, 25);
        
        // layout do frame
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lypnePainelMestre, GroupLayout.PREFERRED_SIZE, 882, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lypnePainelMestre, GroupLayout.PREFERRED_SIZE, 568, Short.MAX_VALUE)
        );
        
        setSize(new Dimension(882, 568));
        setLocationRelativeTo(null);
        /* fim do corpo do método */

    } // fim do método initComponent() </editor-fold>

} // fim da classe SplashScreen
