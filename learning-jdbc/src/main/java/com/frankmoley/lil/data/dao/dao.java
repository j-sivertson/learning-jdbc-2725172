package com.frankmoley.lil.data.dao;

public interface dao <T, id extends UUID> {
  List<T> getAll();
  T create(T entity);
  Optoinal<T> getOne(Id id);
  T update(T entity);
  void delete(Id id);

}
