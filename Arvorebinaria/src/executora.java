class Executora {
    ArvoreBinaria arvore;

    Executora() {
        arvore = new ArvoreBinaria();
    }

    void executar() {
        // Inserindo valores na árvore
        arvore.insert(50);
        arvore.insert(30);
        arvore.insert(20);
        arvore.insert(40);
        arvore.insert(70);
        arvore.insert(60);
        arvore.insert(80);

        System.out.println("Árvore binária após inserção:");
        arvore.inorder();
        System.out.println();

        // Removendo nó folha
        arvore.remove(20);
        System.out.println("Árvore binária após remover o nó folha 20:");
        arvore.inorder();
        System.out.println();

        // Removendo nó com um filho
        arvore.remove(30);
        System.out.println("Árvore binária após remover o nó com um filho 30:");
        arvore.inorder();
        System.out.println();

        // Removendo nó com dois filhos
        arvore.remove(50);
        System.out.println("Árvore binária após remover o nó com dois filhos 50:");
        arvore.inorder();
        System.out.println();
    }
}
