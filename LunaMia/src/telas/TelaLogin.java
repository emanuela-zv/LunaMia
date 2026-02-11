package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeUsuario;
	private JPasswordField senhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1415, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeUsuario = new JTextField();
		nomeUsuario.setToolTipText("");
		nomeUsuario.setForeground(Color.DARK_GRAY);
		nomeUsuario.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		nomeUsuario.setBounds(493, 340, 393, 40);
		contentPane.add(nomeUsuario);
		nomeUsuario.setColumns(10);
		
		senhaUsuario = new JPasswordField();
		senhaUsuario.setToolTipText("");
		senhaUsuario.setForeground(Color.DARK_GRAY);
		senhaUsuario.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		senhaUsuario.setBounds(493, 505, 393, 40);
		contentPane.add(senhaUsuario);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -69, 1342, 904);
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/resources/Captura de tela 2026-02-10 211935.png")));
		contentPane.add(lblNewLabel);
		

		


	}
}
