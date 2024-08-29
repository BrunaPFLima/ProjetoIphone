public interface Navegacao {
    void abrirURL(String url);
    void navegarParaFrente();
    void navegarParaTras();
    void atualizarPagina();
    void adicionarFavoritos(String url);
}
