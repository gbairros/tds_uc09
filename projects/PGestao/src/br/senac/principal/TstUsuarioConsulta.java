package br.senac.principal;

import br.senac.model.Usuario;

import java.sql.SQLException;

public class TstUsuarioConsulta {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
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
