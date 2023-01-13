package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
  private Set<Conteudo> coneudosConcluidos = new LinkedHashSet<Conteudo>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if(conteudo.isPresent()) {
      this.coneudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo");
    }
  }

  public Double calcularTotalXp() {
    return this.coneudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConeudosConcluidos() {
    return coneudosConcluidos;
  }

  public void setConeudosConcluidos(Set<Conteudo> coneudosConcluidos) {
    this.coneudosConcluidos = coneudosConcluidos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dev dev = (Dev) o;
    return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(coneudosConcluidos, dev.coneudosConcluidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, conteudosInscritos, coneudosConcluidos);
  }
}
