


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestComFrame extends JFrame  {
	private JPanel p;
	private JRadioButtonHandler handler;
	private JRadioButton alt1;
	private JRadioButton alt2;
	private JRadioButton alt3;
	private JRadioButton alt4;
	private String CorrectR;
	private boolean SelectButton = false;
	
	public TestComFrame() {
		
		handler= new JRadioButtonHandler();
	//aqui é o q cria o frame
	
		setTitle("Start Window");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		random rand = new random();
		p = new JPanel();
		p.setLayout(null);
	
	
		JLabel label = new JLabel();
		label.setText("Qual o resultado da operação:" + rand.getFator1()+" x "+ rand.getFator2());
		label.setBounds(30, 0,250, 20);
		p.add(label);
		CorrectR = rand.getCorrectAlter();
	
		//Criando os botões 
		alt1 = new JRadioButton(rand.getAlternativa1());
		alt2 = new JRadioButton(rand.getAlternativa2());
		alt3 = new JRadioButton(rand.getAlternativa3());
		alt4 = new JRadioButton(rand.getAlternativa4());
	
		alt1.setBounds(50, 30, 50, 20);
		alt2.setBounds(50, 50, 50, 20);
		alt3.setBounds(50, 70, 50, 20);
		alt4.setBounds(50, 90, 50, 20);

		// Criando  um JButtonGroup pra organizar os JRadioButtons em um grupo
		ButtonGroup butGroup = new ButtonGroup();
		butGroup.add(alt1);
		butGroup.add(alt2);
		butGroup.add(alt3);
		butGroup.add(alt4);
	
		// Adicionando  os  botões ao JPanel
		p.add(alt1);
		p.add(alt2);
		p.add(alt3);
		p.add(alt4);
		
		
		alt1.addItemListener(handler);
		alt2.addItemListener(handler);
		alt3.addItemListener(handler);
		alt4.addItemListener(handler);
		
		//Criando os botões finais
		JButton verificarAlt = new JButton("Verificar");
		JButton encerrarTest = new JButton("Encerrar");
	
		verificarAlt.setBounds(90,120,100, 20);
		encerrarTest.setBounds(90,150,100, 20);
		
		// Adicionando  os  botões ao JPanel
		p.add(verificarAlt);
		p.add(encerrarTest);
	
		//   Fazendo as ações dos botões
		verificarAlt.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(SelectButton==true) {
					JOptionPane.showMessageDialog(null, "Acertou, Resposta correta: "+CorrectR);
				}else 
					JOptionPane.showMessageDialog(null, "Errou!! Resposta correta: "+CorrectR);
			
			}
		});
		encerrarTest.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}
		});
	
		 
	
		// Adicionando o JPanel ao Frame e tornando a tela visível
		add(p);
		setVisible(true);
		

	}
	public class JRadioButtonHandler implements ItemListener {

		@Override
			public void itemStateChanged(ItemEvent e) {
			if(alt1.isSelected()){
				SelectButton = false;
				if(alt1.getText().equals(CorrectR)) {
					SelectButton=true;
				}
			}
			else if(alt2.isSelected()) {
				SelectButton = false;
				if(alt2.getText().equals(CorrectR)) {//vou executar 
					SelectButton = true;
				}
			}
			else if(alt3.isSelected()) {
				SelectButton = false;
				if(alt3.getText().equals(CorrectR)) {
					SelectButton = true;
				}
			}
			else if(alt4.isSelected()) {
				SelectButton = false;
				if(alt4.getText().equals(CorrectR)) {
					SelectButton = true;
				}
			}
				
		}

	}
	
}
