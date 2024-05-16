package exercicios;

public class Veiculo {
    private int pesoEmQuilos;
    private int velocMaxEmKmh;
    private float precoEmReais;

    // Construtor sem argumentos
    public Veiculo() {
        this.pesoEmQuilos = 0;
        this.velocMaxEmKmh = 0;
        this.precoEmReais = 0.0f;
    }

    // Construtor com argumentos
    public Veiculo(int pesoEmQuilos, int velocMaxEmKmh, float precoEmReais) {
        this.pesoEmQuilos = pesoEmQuilos;
        this.velocMaxEmKmh = velocMaxEmKmh;
        this.precoEmReais = precoEmReais;
    }

    // Getters e Setters
    public int getPesoEmQuilos() {
        return pesoEmQuilos;
    }

    public void setPesoEmQuilos(int pesoEmQuilos) {
        this.pesoEmQuilos = pesoEmQuilos;
    }

    public int getVelocMaxEmKmh() {
        return velocMaxEmKmh;
    }

    public void setVelocMaxEmKmh(int velocMaxEmKmh) {
        this.velocMaxEmKmh = velocMaxEmKmh;
    }

    public float getPrecoEmReais() {
        return precoEmReais;
    }

    public void setPrecoEmReais(float precoEmReais) {
        this.precoEmReais = precoEmReais;
    }

    // Método toString para exibir os dados
    @Override
    public String toString() {
        return "Veiculo{" +
                "pesoEmQuilos=" + pesoEmQuilos +
                ", velocMaxEmKmh=" + velocMaxEmKmh +
                ", precoEmReais=" + precoEmReais +
                '}';
    }
}
