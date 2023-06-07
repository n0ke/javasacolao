package com.estacio.javasacolao;

import java.util.ArrayList;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Principal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField PesquisaBarra;
	private JTable ProdutoTabela;
	private JButton ProdutoNovo;
	private JButton ProdutoExcluir;
	private JTextField Unidades;
	
	ArrayList<Produto> ListaProdutos = new ArrayList<Produto>();

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
		setBounds(100, 100, 700, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo1 = new JLabel("Lista de Produtos");
		Titulo1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Titulo1.setBounds(10, 11, 524, 14);
		contentPane.add(Titulo1);
		
		//	Barra de Pesquisa
		PesquisaBarra = new JTextField();
		PesquisaBarra.setBounds(10, 36, 554, 20);
		contentPane.add(PesquisaBarra);
		PesquisaBarra.setColumns(10);
		
		//	Botão Pesquisa
		JButton PesquisaBotao = new JButton("Pesquisar");
		PesquisaBotao.setBounds(574, 35, 100, 23);
		contentPane.add(PesquisaBotao);
		
		JScrollPane ProdutoTabScrlPane = new JScrollPane();
		ProdutoTabScrlPane.setBounds(10, 67, 664, 226);
		contentPane.add(ProdutoTabScrlPane);
		
		//	Tabela Produtos
		ProdutoTabela = new JTable();
		ProdutoTabScrlPane.setViewportView(ProdutoTabela);
		ProdutoTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Modificadores.updateTabela(ProdutoTabela, ListaProdutos, ABORT);
		TableCellEditor cellEditor = ProdutoTabela.getDefaultEditor(Object.class);
        cellEditor.addCellEditorListener(new CellEditorListener() {	//	Evento de edição
            @Override
            public void editingStopped(ChangeEvent e) {
                Modificadores.updateLista(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
                Modificadores.updateTabela(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
            }

            @Override
            public void editingCanceled(ChangeEvent e) {
                /**/
            }
        });
		
		//	Criar Produto
		ProdutoNovo = new JButton("Novo Produto");
		ProdutoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto produto = new Produto("(Inserir aqui)", 0.0, 0.0);
				ListaProdutos.add(produto);
				Modificadores.updateTabela(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
				
			}
		});
		ProdutoNovo.setBounds(10, 304, 125, 39);
		contentPane.add(ProdutoNovo);
				
		//	Excluir Produto
		ProdutoExcluir = new JButton("Excluir Produto");
		ProdutoExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaProdutos.remove(ProdutoTabela.getSelectedRow());
				Modificadores.updateTabela(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
			}
		});
		ProdutoExcluir.setBounds(145, 304, 125, 39);
		contentPane.add(ProdutoExcluir);
		
		JLabel UnLabel = new JLabel("Numero de Unidades");
		UnLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		UnLabel.setBounds(542, 304, 132, 14);
		contentPane.add(UnLabel);
		
		//	Numero de Unidades
		Unidades = new JTextField();
		Unidades.setHorizontalAlignment(SwingConstants.TRAILING);
		Unidades.setText("1");
		Unidades.setBounds(622, 321, 52, 20);
		contentPane.add(Unidades);
		Unidades.setColumns(10);
		Unidades.getDocument().addDocumentListener(new DocumentListener()
        {
            public void changedUpdate(DocumentEvent arg0) {
            	Modificadores.updateTabela(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
            }
			
            public void insertUpdate(DocumentEvent arg0) {
                Modificadores.updateTabela(ProdutoTabela, ListaProdutos, Integer.parseInt(Unidades.getText()));
            }
			
            public void removeUpdate(DocumentEvent arg0) {}
            
        });
		
	}

	public static void actionPerformed() {
		
	}
}