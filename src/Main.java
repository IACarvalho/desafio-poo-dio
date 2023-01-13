import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("Curso de java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Curso de javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("Mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricaio("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev fulano = new Dev();
        fulano.setNome("Fulano");
        fulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Fulano:  " + fulano.getConteudosInscritos());
        fulano.progredir();
        fulano.progredir();
        System.out.println("Conteúdo inscritos Fulano:  " + fulano.getConteudosInscritos());
        System.out.println("Conteúdo concluídos Fulano:  " + fulano.getConeudosConcluidos());
        System.out.println("XO: " + fulano.calcularTotalXp());

        System.out.println("___________________");

        Dev beltrano = new Dev();
        beltrano.setNome("Beltrano");
        beltrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Beltrano:  " + beltrano.getConteudosInscritos());
        beltrano.progredir();
        beltrano.progredir();
        beltrano.progredir();
        System.out.println("Conteúdo inscritos Beltrano:  " + beltrano.getConteudosInscritos());
        System.out.println("Conteúdo concluídos Beltrano:  " + beltrano.getConeudosConcluidos());
        System.out.println("XP: " + beltrano.calcularTotalXp() );
    }
}
