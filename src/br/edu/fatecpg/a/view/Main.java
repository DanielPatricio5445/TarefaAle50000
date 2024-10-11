package br.edu.fatecpg.a.view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de Formulário de Cadastro");
		lblNewLabel.setBounds(75, 10, 250, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 33, 45, 15);
		contentPane.add(lblNome);
		
		
		
		textField = new JTextField();
		textField.setBounds(22, 57, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(22, 111, 149, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(22, 141, 149, 23);
		contentPane.add(rdbtnFeminino);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnFeminino);
		grupo.add(rdbtnNewRadioButton);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(22, 88, 45, 15);
		contentPane.add(lblSexo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(22, 184, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(22, 163, 45, 15);
		contentPane.add(lblIdade);
		
		JLabel lblInformaes = new JLabel("Informações:");
		lblInformaes.setBounds(136, 37, 302, 226);
		contentPane.add(lblInformaes);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String nome = textField.getText();
			        String sexo = ""; // 

			        if (rdbtnNewRadioButton.isSelected()) {
			            sexo = rdbtnNewRadioButton.getText(); 
			        } else if (rdbtnFeminino.isSelected()) { // Corrigido para else if
			            sexo = rdbtnFeminino.getText();
			        }

			        int valor = (Integer) spinner.getValue(); // Use o nome correto do JSpinner

			        // Aqui você pode usar nome, sexo e valor conforme necessário
			        lblInformaes.setText("Nome: " + nome + ", Sexo: " + sexo + ", Valor: " + valor);
			    }
				
				
			
		});
		btnNewButton.setBounds(19, 216, 117, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
