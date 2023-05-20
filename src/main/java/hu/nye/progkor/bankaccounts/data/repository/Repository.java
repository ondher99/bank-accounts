package hu.nye.progkor.bankaccounts.data.repository;

import java.util.List;

public interface Repository<T, ID> {

    //CRUD

    T save(T item);

    T getById(ID id);

    List<T> getAll();

    T update(T item);

    void deleteById(ID id);
}
