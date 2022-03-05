package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate date;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + date +
                '}';
    }
}
