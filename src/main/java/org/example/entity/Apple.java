package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apple {

  @Id
  public Long id;

  @Column
  public String sorte;

  public Long getId() {
    return this.id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getSorte() {
    return this.sorte;
  }

  public void setSorte(final String sorte) {
    this.sorte = sorte;
  }

}
