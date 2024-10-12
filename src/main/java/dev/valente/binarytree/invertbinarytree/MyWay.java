package dev.valente.binarytree.invertbinarytree;

import dev.valente.binarytree.Elemento;
import dev.valente.binarytree.Tree;

public class MyWay {
    public static void main(String[] args) {
        Tree tree = new Tree(new Elemento(10));
        tree.inserirElemento(new Elemento(5));
        tree.inserirElemento(new Elemento(1));
        tree.inserirElemento(new Elemento(8));
        tree.inserirElemento(new Elemento(15));
        tree.inserirElemento(new Elemento(12));
        tree.inserirElemento(new Elemento(18));




        tree.percursoPreOrdem(tree);

        tree = tree.inverterArvore(tree);

        System.out.println("");
        tree.percursoPreOrdem(tree);
    }
}
