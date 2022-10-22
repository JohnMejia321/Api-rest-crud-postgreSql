package com.sventas.sventas.service;

import com.sventas.sventas.model.Cliente;

import java.util.List;

public interface IClienteService {

    public Cliente create(Cliente cliente);
    public Cliente update(Cliente cliente);
    public Cliente findById(Integer id);
    public List<Cliente> findAll();
    public void delete(Integer id);
}
