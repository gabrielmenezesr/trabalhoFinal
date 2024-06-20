package models;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String imagePath; // Caminho da imagem

    // Construtor
    public Produto(int id, String nome, double preco, String imagePath) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.imagePath = imagePath;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
