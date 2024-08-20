class ArvoreBinaria {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    ArvoreBinaria() {
        root = null;
    }

    // Método para inserir um novo nó na árvore binária
    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    // Método para remover um nó da árvore binária
    void remove(int value) {
        root = removeRec(root, value);
    }

    Node removeRec(Node root, int value) {
        if (root == null) return root;

        if (value < root.value)
            root.left = removeRec(root.left, value);
        else if (value > root.value)
            root.right = removeRec(root.right, value);
        else {
            // Caso 1: nó com apenas um filho ou nenhum filho
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Caso 2: nó com dois filhos
            root.value = minValue(root.right);

            root.right = removeRec(root.right, root.value);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Método para realizar a travessia in-order da árvore
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}


class ArvoreBinaria {
    // Classe  que representa um nó na árvore
    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root; // variavel aleatoria para usar de referencia para os apontamentos

    ArvoreBinaria() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    void remove(int value) {
        root = removeRec(root, value);
    }
