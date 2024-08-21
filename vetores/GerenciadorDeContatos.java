public class GerenciadorDeContatos {
    private Contato[] contatos;
    private int tamanho;

    public GerenciadorDeContatos(int capacidade) {
        contatos = new Contato[capacidade];
        tamanho = 0;
    }

    public void adicionarContato(Contato contato) {
        if (tamanho < contatos.length) {
            contatos[tamanho] = contato;
            tamanho++;
        } else {
            System.out.println("Lista de contatos cheia!");
        }
    }

    public void removerContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                contatos[i] = contatos[tamanho - 1];
                contatos[tamanho - 1] = null;
                tamanho--;
                return;
            }
        }
        System.out.println("Contato nÃ£o encontrado!");
    }

    public Contato buscarContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    public void listaContatos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(contatos[i]);
        }
    }
}
