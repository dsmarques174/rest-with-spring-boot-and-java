package br.com.restwithspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restwithspring.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}