package br.senac.principal;

import br.senac.banco.ConexaoBanco;
import br.senac.banco.ConexaoMysql;

import java.sql.Connection;
import java.sql.SQLException;

public class TstConexao
{
    public static void main(String[] args) {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        Connection con = conexaoBanco.obterConexao();
    }
}
