package br.senac.principal;

import br.senac.dao.UsuarioDAO;
import br.senac.model.UsuarioModel;

import java.sql.SQLException;

public class TstUsuarioInsert {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioModel usuario = new UsuarioModel();
        usuario.setLogin("gbairros");
        usuario.setSenha("1234");
        usuario.setNome("Gildo");

        try {
            System.out.println("Inserindo Usuário");
            usuarioDAO.salvar(usuario);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
