package dev.valente.binarytree;

public class Tree {
    public Elemento elemento;
    public Tree esq;
    public Tree dir;

    public Tree(Elemento elemento) {
        this.elemento = elemento;
    }

    public Tree(){

    }

    public void percursoPreOrdem(Tree tree){ // fiz solo
        if(!isEmpty()){
            System.out.print(tree.getElemento().getVal() + " ");
            if(tree.esq != null){
                percursoPreOrdem(tree.esq);
            }
            if(tree.dir != null){
                percursoPreOrdem(tree.dir);
            }
        }
    }

    public boolean isEmpty(){
        return (this.elemento == null);
    }

    public void inserirElemento(Elemento novo){
        if(isEmpty()){
            this.elemento = novo;
        }
        else {
            Tree novaArvore = new Tree(novo);
            if(novo.getVal() > this.elemento.getVal()){
                if(this.dir == null){ // folha?
                    this.setDir(novaArvore);
                } else {
                    this.dir.inserirElemento(novo);
                }

            } else if(novo.getVal() < this.elemento.getVal()){
                if(this.esq == null){
                    this.setEsq(novaArvore);

                } else {
                    this.esq.inserirElemento(novo);
                }

            }
        }
    }

//    public Tree inverterArvore(Tree tree){ //Nice!
//
//
//        if(tree != null){
//            Tree tree1 = tree.dir;
//            tree.dir = tree.esq;
//            tree.esq = tree1;
//            inverterArvore(tree.dir);
//            inverterArvore(tree.esq);
//        }
//
//
//        return tree;
//    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Tree getEsq() {
        return esq;
    }

    public void setEsq(Tree esq) {
        this.esq = esq;
    }

    public Tree getDir() {
        return dir;
    }

    public void setDir(Tree dir) {
        this.dir = dir;
    }
}
