package com.pitaapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pitaapp.model.Agendamento;
import com.pitaapp.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	public Optional <Usuario> findAllByCpfContainingIgnoreCase(String cpf);
	
	public Optional <Usuario> findByUserNameContainingIgnoreCase(String userName);
	
//	public List<Agendamento> findAllAgendamentoByIdUsuario(int id);
}
