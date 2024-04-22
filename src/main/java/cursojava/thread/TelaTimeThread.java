package cursojava.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog  {

    private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Email");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Add Lista");
    private JButton jButton1 = new JButton("Stop");

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();


    public TelaTimeThread(){  /*Executa o que tiver dentro no momento da abertura ou execução*/

        setTitle("Tela de tempo com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5,10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200,25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo,gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(jButton, gridBagConstraints);

        jButton1.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx ++;
        jPanel.add(jButton1, gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  /*Executa o clique do botao*/

                if ( fila == null){
                     fila = new ImplementacaoFilaThread();
                     fila.start();
                }

                for (int qtd = 0; qtd < 100; qtd++) {  /*Simlando 100 envios em massa*/

                    ObjetoFIlaThread fIlaThread = new ObjetoFIlaThread();
                    fIlaThread.setNome(mostraTempo.getText());
                    fIlaThread.setEmail(mostraTempo2.getText() + " : " + qtd);

                    fila.add(fIlaThread);
                }
            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fila.stop();
                fila = null;
            }
        });

        fila.start();

        add(jPanel, BorderLayout.WEST);
        /*Torna a tela visível para o usuário
        * Sempre será o ultimo comando*/
        setVisible(true);
    }
}
