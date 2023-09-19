package br.senac.banco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoMysql {
    private String bancoIpServidor;
    private String bancoPorta;
        private String bancoNomeBanco;
        private String bancoUsuario;
        private String bancoSenha;

        public ConexaoMysql(){
            this.loadProperties();
        }

        public void loadProperties(){
            try {
                InputStream is = getClass().getResourceAsStream("config.properties");
                Properties properties = new Properties();
                properties.load(is);

                this.bancoIpServidor = properties.getProperty("banco.ip_servidor");
                this.bancoPorta = properties.getProperty("banco.porta");
                this.bancoNomeBanco = properties.getProperty("banco.nome_banco");
                this.bancoUsuario = properties.getProperty("banco.usuario");
                this.bancoSenha = properties.getProperty("banco.senha");

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Connection obterConexao() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://" + this.bancoIpServidor + ":"+this.bancoPorta+"/" + this.bancoNomeBanco;

            Connection connection = null;

            connection = DriverManager.getConnection(url, bancoUsuario, bancoSenha);
            return connection;
        }

}
