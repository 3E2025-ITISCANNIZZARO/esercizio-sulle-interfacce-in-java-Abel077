class SuperEroe implements Personaggio {
    private int forzaFisica;

    public SuperEroe() {
        this.forzaFisica = 10;
    }

    @Override
    public void combatti() {
        forzaFisica -= 3; // Ogni combattimento diminuisce la forza di 3
    }

    @Override
    public void azzanna() {
        // Il SuperEroe non può azzannare
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }
}
