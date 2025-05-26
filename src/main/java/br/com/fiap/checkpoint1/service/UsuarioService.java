package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.checkpoint1.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<br.com.fiap.checkpoint1.model.Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<br.com.fiap.checkpoint1.model.Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }


    public Usuario salvar(Usuario usuario) {
        String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> autenticar(String cpf, String senha) {
        return usuarioRepository.findAll()
                .stream()
                .filter(u -> u.getCpf().equals(cpf) && passwordEncoder.matches(senha, u.getSenha()))
                .findFirst();
    }
}