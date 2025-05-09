package model;

public abstract class LivroFisico extends Livro{
    int qtdEstoque;
    Comunicacao destinatario;

    public void atualizarEstoque(int qtd){
        this.qtdEstoque-=qtd;
        if(this.qtdEstoque<=2){
            avisarFunc();
        }
    }

    private void avisarFunc(){
        destinatario.setMsg(this.toString() + " está em falta");
    }

 

    
}
