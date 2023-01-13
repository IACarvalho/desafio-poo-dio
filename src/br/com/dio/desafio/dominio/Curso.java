package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }
}
