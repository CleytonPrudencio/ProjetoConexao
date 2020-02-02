package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class conexao {
	
	public Statement stm;
	public ResultSet rs;
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String caminho = "jdbc:sqlserver://localhost:1433;/" + "databaseName=Med;";
	private String usuario = "sa";
	private String senha = "sa";
	public Connection con;
	
	
	//Vamos criar nosso método de conexão
	public void Conexao () {
		try {
			
			System.setProperty("jdbc.Drivers", driver);
			con=DriverManager.getConnection(caminho, usuario, senha);
			JOptionPane.showMessageDialog(null, "Conectou! ");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(null, "Erro ao Conectar" + e.getMessage());
			
		}
	}
	

}
