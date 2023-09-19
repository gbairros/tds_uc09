package br.senac.banco;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoBanco {
    public Connection obterConexao(){
        ConexaoMysql conexaoMysql = new ConexaoMysql();
        Connection con = null;
        try {
            con = conexaoMysql.obterConexao();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
