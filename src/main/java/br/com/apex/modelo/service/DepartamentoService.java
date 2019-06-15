package br.com.apex.modelo.service;

import java.util.List;

import br.com.apex.modelo.domain.Departamento;


public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);
    
    List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);
}
