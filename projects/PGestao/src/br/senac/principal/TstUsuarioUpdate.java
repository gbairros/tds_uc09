package br.senac.principal;

import br.senac.model.Usuario;

import java.sql.SQLException;

public class TstUsuarioUpdate {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setLogin("gbairros");
        usuario.setSenha("asdf@1234");
        usuario.setCargo("Professor");
        usuario.setNivelAcesso(1);
        usuario.setId(34);

        try {
            System.out.println("Atualizando Usuário");
            usuario.atualizar();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
