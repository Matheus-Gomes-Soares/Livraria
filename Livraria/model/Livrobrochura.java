package model;

public class Livrobrochura extends LivroFisico {

    @Override
    double calcularPreco() {
        return this.preco * 0.95;
    }
    
}
