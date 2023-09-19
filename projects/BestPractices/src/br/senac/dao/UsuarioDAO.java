package br.senac.dao;

import br.senac.Utils;
import br.senac.banco.ConexaoBanco;
import br.senac.banco.ConexaoMysql;
import br.senac.model.UsuarioModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    public void salvar(UsuarioModel usuarioModel) throws SQLException, ClassNotFoundException {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        Connection con = conexaoBanco.obterConexao();
        PreparedStatement stmt      = null;
        String senhaCripto = Utils.generateHash(usuarioModel.getSenha());

        stmt = con.prepareStatement("INSERT INTO tb_usuario(login, senha, nome) VALUES (?, ?, ?)");
        stmt.setString(1, usuarioModel.getLogin());
        stmt.setString(2, senhaCripto);
        stmt.setString(3, usuarioModel.getNome());
        stmt.executeUpdate();
    }


    public void deletar(int id) throws SQLException, ClassNotFoundException {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        Connection con = conexaoBanco.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
        stmt.setInt(1, id);

        stmt.executeUpdate();
    }

    public void obterTodosUsuarios() throws SQLException, ClassNotFoundException {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        Connection con = conexaoBanco.obterConexao();
        PreparedStatement stmt  = null;

        stmt = con.prepareStatement("SELECT id, login, senha, cargo, nivel_acesso FROM usuario");
        ResultSet rs = stmt.executeQuery();

        ArrayList<UsuarioDAO> usuariosList = new ArrayList<>();

        while (rs.next()){
            System.out.println("-------------------------------");
            System.out.println("ID: "+ rs.getInt(1));
            System.out.println("ID: "+ rs.getInt("id"));
            System.out.println("Login: "+ rs.getString("login"));
            System.out.println("Senha: "+ rs.getString("senha"));
            System.out.println("Cargo: "+ rs.getString("cargo"));
            System.out.println("Nivel Acesso: "+ rs.getString("nivel_acesso"));
            System.out.println("-------------------------------");
        }
    }

}


