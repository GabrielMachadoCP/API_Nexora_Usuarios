package br.com.fiap.checkpoint1.controller;

import br.com.fiap.checkpoint1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<br.com.fiap.checkpoint1.model.Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<br.com.fiap.checkpoint1.model.Usuario> buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    public br.com.fiap.checkpoint1.model.Usuario criar(@RequestBody br.com.fiap.checkpoint1.model.Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<br.com.fiap.checkpoint1.model.Usuario> atualizar(@PathVariable Long id, @RequestBody br.com.fiap.checkpoint1.model.Usuario usuarioAtualizado) {
        Optional<br.com.fiap.checkpoint1.model.Usuario> usuarioExistente = usuarioService.buscarPorId(id);

        if (usuarioExistente.isPresent()) {
            br.com.fiap.checkpoint1.model.Usuario usuario = usuarioExistente.get();
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setCpf(usuarioAtualizado.getCpf());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setSenha(usuarioAtualizado.getSenha());

            br.com.fiap.checkpoint1.model.Usuario usuarioSalvo = usuarioService.salvar(usuario);
            return ResponseEntity.ok(usuarioSalvo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}