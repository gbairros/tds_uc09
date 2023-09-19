package br.senac.principal;

import br.senac.dao.UsuarioDAO;

import java.sql.SQLException;

public class TstUsuarioConsulta {
    public static void main(String[] args) {
        UsuarioDAO usuario = new UsuarioDAO();
        try {
            System.out.println("Listando Usuários");
            usuario.obterTodosUsuarios();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
