package projetoCadastroUsuario.service;


import projetoCadastroUsuario.model.Usuario;

import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    //esta realizando
    public ArrayList<Usuario> listarUsuarios(){
        return usuarios;
    }

    public void atualizarUsuario(int index, Usuario novoUsuario){
        if(index >= 0 && index < usuarios.size()){
            usuarios.set(index, novoUsuario);
        }
    }

    public void removerUsuario(int index){
        if(index >= 0 && index < usuarios.size()){
            usuarios.remove(index);
        }
    }
}
