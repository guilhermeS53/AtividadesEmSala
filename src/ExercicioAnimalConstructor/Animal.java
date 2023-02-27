package ExercicioAnimalConstructor;

public class Animal {
    String nome, ambiente;
    float comprimento, velMedia;
    int numPatas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(float velMedia) {
        this.velMedia = velMedia;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public Animal(String nome, String ambiente, float comprimento, float velMedia, int numPatas) {
        this.nome = nome;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velMedia = velMedia;
        this.numPatas = numPatas;
    }
    public void verDados() {
        System.out.println("Animal\n\nNome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Número de Patas do ExercicioAnimalConstructor.Animal: " + getNumPatas());
        System.out.println("Velocidade Média: " + getVelMedia());
    }
}
