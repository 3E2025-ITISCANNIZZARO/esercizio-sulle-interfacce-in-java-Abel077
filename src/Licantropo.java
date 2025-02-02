class Licantropo implements Personaggio {
    private int forzaFisica;
    private boolean lunaPiena; // Determina se è notte di luna piena

    public Licantropo(boolean lunaPiena) {
        this.forzaFisica = 10; // Inizialmente è Umano
        this.lunaPiena = lunaPiena;
    }

    @Override
    public void combatti() {
        if (lunaPiena) {
            forzaFisica -= 2; // Licantropo perde 2 forza nelle notti di luna piena
        } else {
            forzaFisica -= 3; // Licantropo perde 3 forza negli altri giorni
        }
    }

    @Override
    public void azzanna() {
        // Il Licantropo non azzanna, solo combatte
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }

    // Metodo per cambiare lo stato della luna
    public void cambiaFaseLuna() {
        lunaPiena = !lunaPiena;
    }
}
