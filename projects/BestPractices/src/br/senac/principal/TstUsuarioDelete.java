package br.senac.principal;

import br.senac.dao.UsuarioDAO;

import java.sql.SQLException;

public class TstUsuarioDelete {
    public static void main(String[] args) {
        UsuarioDAO usuario = new UsuarioDAO();
        try {
            System.out.println("Removendo Usuário");
            usuario.deletar(28);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
