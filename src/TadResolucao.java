public class TadResolucao {
    private int minimo;
    private int maximo;
    private int posicao;
    private int posVazio;
    // valor no scanner
    private int repetir;
    private int[] dados;

    public TadResolucao(int minimo, int maximo, int posicao, int posVazio, int repetir, int[] dados) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.posicao = posicao;
        this.posVazio = posVazio;
        this.repetir = repetir;
        this.dados = dados;
    }

    public TadResolucao() {
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosVazio() {
        return posVazio;
    }

    public void setPosVazio(int posVazio) {
        this.posVazio = posVazio;
    }

    public int getRepetir() {
        return repetir;
    }

    public void setRepetir(int repetir) {
        this.repetir = repetir;
    }

    public int[] getDados() {
        return dados;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }

    public void setPosAndValue(int pos, int value) {
        int[] data = getDados();
        if (pos < minimo && pos > maximo) {
            System.out.println("Posição inexistente!");
        }
        data[pos] = value;
    }
}
