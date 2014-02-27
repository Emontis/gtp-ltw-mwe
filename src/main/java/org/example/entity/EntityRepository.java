package org.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
@Repository
@Transactional
public interface EntityRepository<T> extends JpaRepository<T, Long> {
  
}
