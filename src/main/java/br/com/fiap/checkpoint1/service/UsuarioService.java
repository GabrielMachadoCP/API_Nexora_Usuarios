package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<br.com.fiap.checkpoint1.model.Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<br.com.fiap.checkpoint1.model.Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public br.com.fiap.checkpoint1.model.Usuario salvar(br.com.fiap.checkpoint1.model.Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

}