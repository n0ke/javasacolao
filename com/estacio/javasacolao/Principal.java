package com.estacio.javasacolao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField PesquisaBarra;
	private JTable ProdutoTabela;
	private JButton ProdutoNovo;
	private JButton ProdutoExcluir;
	private JLabel Titulo2;
	private JTextField CadNome;
	private JTextField CadPreco;
	private JTextField CadLucro;
	private JTextField Unidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo1 = new JLabel("Lista de Produtos");
		Titulo1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Titulo1.setBounds(10, 11, 524, 14);
		contentPane.add(Titulo1);
		
		PesquisaBarra = new JTextField();
		PesquisaBarra.setBounds(10, 36, 554, 20);
		contentPane.add(PesquisaBarra);
		PesquisaBarra.setColumns(10);
		
		JButton PesquisaBotao = new JButton("Pesquisar");
		PesquisaBotao.setBounds(574, 35, 100, 23);
		contentPane.add(PesquisaBotao);
		
		ProdutoTabela = new JTable();
		ProdutoTabela.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ProdutoTabela.setBounds(10, 67, 664, 226);
		contentPane.add(ProdutoTabela);
		
		ProdutoNovo = new JButton("Novo Produto");
		ProdutoNovo.setBounds(10, 304, 125, 23);
		contentPane.add(ProdutoNovo);
		
		ProdutoExcluir = new JButton("Excluir Produto");
		ProdutoExcluir.setBounds(145, 304, 125, 23);
		contentPane.add(ProdutoExcluir);
		
		JLabel UnLabel = new JLabel("Numero de Unidades");
		UnLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		UnLabel.setBounds(525, 304, 149, 14);
		contentPane.add(UnLabel);
		
		Unidades = new JTextField();
		Unidades.setHorizontalAlignment(SwingConstants.TRAILING);
		Unidades.setText("1");
		Unidades.setBounds(622, 321, 52, 20);
		contentPane.add(Unidades);
		Unidades.setColumns(10);
		
		Titulo2 = new JLabel("Cadastro de Produtos");
		Titulo2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Titulo2.setBounds(10, 338, 524, 14);
		contentPane.add(Titulo2);
		
		JLabel CadNomeLabel = new JLabel("Nome");
		CadNomeLabel.setBounds(10, 363, 46, 14);
		contentPane.add(CadNomeLabel);
		
		CadNome = new JTextField();
		CadNome.setBounds(10, 381, 458, 20);
		contentPane.add(CadNome);
		CadNome.setColumns(10);
		
		JLabel CadPrecoLabel = new JLabel("Preço");
		CadPrecoLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		CadPrecoLabel.setBounds(478, 363, 92, 14);
		contentPane.add(CadPrecoLabel);
		
		CadPreco = new JTextField();
		CadPreco.setHorizontalAlignment(SwingConstants.TRAILING);
		CadPreco.setBounds(478, 381, 92, 20);
		contentPane.add(CadPreco);
		CadPreco.setColumns(10);
		
		JLabel CadLucroLabel = new JLabel("Lucro");
		CadLucroLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		CadLucroLabel.setBounds(580, 363, 94, 14);
		contentPane.add(CadLucroLabel);
		
		CadLucro = new JTextField();
		CadLucro.setHorizontalAlignment(SwingConstants.TRAILING);
		CadLucro.setColumns(10);
		CadLucro.setBounds(580, 381, 94, 20);
		contentPane.add(CadLucro);
		
	}
}
