package com.example;

public class Root {
    private int annoDiInizio;
    private Aula aula;
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private Studenti[] studenti;

    public Root(int annoDiInizio, Aula aula, String classe, int numeroFinestre, String specializzazione,
            Studenti[] studenti) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.classe = classe;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
        this.studenti = studenti;
    }

    public Root(){
 
    }

    public int getAnnoDiInizio() {
        return annoDiInizio;
    }

    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }
    
}
