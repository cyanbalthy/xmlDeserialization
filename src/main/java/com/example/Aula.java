package com.example;

    public class Aula { //classe per valori di aula
        private String nome;
        private int numeroDiBanchi;
        
        public Aula(String nome, int numeroDiBanchi) {
            this.nome = nome;
            this.numeroDiBanchi = numeroDiBanchi;
        }
        

        public Aula() {
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumeroDiBanchi() {
            return numeroDiBanchi;
        }

        public void setNumeroDiBanchi(int numeroDiBanchi) {
            this.numeroDiBanchi = numeroDiBanchi;
        }

        
}

