class Vampiro implements Personaggio {
    private int forzaFisica;

    public Vampiro() {
        this.forzaFisica = 15;
    }

    @Override
    public void combatti() {
        // Il Vampiro non può combattere
    }

    @Override
    public void azzanna() {
        forzaFisica -= 2; // Ogni azzanno diminuisce la forza di 2
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }
}
