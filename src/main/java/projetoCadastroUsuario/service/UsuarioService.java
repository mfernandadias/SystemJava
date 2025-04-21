package projetoCadastroUsuario.service;


import projetoCadastroUsuario.model.Usuario;

import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void addcionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    //esta realizando
    public ArrayList<Usuario> listarUsuario(){
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
