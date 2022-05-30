//Dentro do código, consegui adicionar a CheckBox contudo tive dificuldade em alinha-la corretamente

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JCheckBox;

public class Main extends JFrame {
    private JTextField textCodigo = new JTextField();
    private JTextField textNome = new JTextField();

    private JCheckBox block = new JCheckBox();

    private JButton buttonFechar = new JButton("Fechar");
    public static void main(String args[]) {
        Main m = new Main();
        m.setVisible(true);
    }
    public Main() {
        super("Principal");
        montaTela();
    }
    private void montaTela() {

        this.setLayout(new BorderLayout());
        JPanel panelCentro = new JPanel(new GridBagLayout());
        JPanel panelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JCheckBox blockButton = new JCheckBox();
        panelBotoes.add(buttonFechar);
        this.add(panelBotoes, BorderLayout.SOUTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(blockButton, BorderLayout.LINE_END);
        buttonFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        panelCentro.add(new JLabel("Código"), c);
        c.gridy = 1;
        panelCentro.add(new JLabel("Nome"), c);
        blockButton.add(new JCheckBox("Bloqueado"),c);
        c.gridy = 0;
        c.gridx++;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        textCodigo.setPreferredSize(new Dimension(100, 20));
        panelCentro.add(textCodigo, c);
        c.gridy++;
        textNome.setPreferredSize(new Dimension(100, 20));
        panelCentro.add(textNome, c);
        block.setPreferredSize(new Dimension(100, 20));
        this.setSize(200, 300);
    }
}

