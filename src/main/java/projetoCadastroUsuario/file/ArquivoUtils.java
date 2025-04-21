package projetoCadastroUsuario.file;

import projetoCadastroUsuario.model.Usuario;
import projetoCadastroUsuario.service.UsuarioService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ArquivoUtils {
    public static void salvarUsuarios(List<Usuario> usuarios, String caminhoArquivo){
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            for (Usuario u : usuarios) {
                writer.write(u.toString() + "\n");
            }
            System.out.println("Dados salvos em: " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

}
