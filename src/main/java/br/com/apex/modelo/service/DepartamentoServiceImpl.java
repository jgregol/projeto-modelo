package br.com.apex.modelo.service;

import java.util.List;

import br.com.apex.modelo.dao.DepartamentoDao;
import br.com.apex.modelo.domain.Departamento;

public class DepartamentoServiceImpl implements DepartamentoService {

	private DepartamentoDao dao;

	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);

	}

	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if (buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}
}
