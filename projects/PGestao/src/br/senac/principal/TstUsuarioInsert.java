package br.senac.principal;

import br.senac.model.Usuario;

import java.sql.SQLException;

public class TstUsuarioInsert {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setLogin("jose");
        usuario.setSenha("1234");
        usuario.setCargo("Aluno");
        usuario.setNivelAcesso(1);

        try {
            System.out.println("Inserindo Usuário");
            usuario.salvar();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
