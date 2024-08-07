import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.setPontuacao(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        curso2.setPontuacao(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        mentoria.setPontuacao(5);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("-------");

        Dev devAlcantara = new Dev();
        devAlcantara.setNome("Joao");
        devAlcantara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alcantara:" + devAlcantara.getConteudosInscritos());
        devAlcantara.progredir();
        devAlcantara.progredir();
        devAlcantara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alcantara:" + devAlcantara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alcantara:" + devAlcantara.getConteudosConcluidos());
        System.out.println("XP:" + devAlcantara.calcularTotalXp());
    }
}
