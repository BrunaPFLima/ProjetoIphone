public interface Telefonia {
    void fazerChamada(String numero);
    void receberChamada();
    void enviarSMS(String numero, String mensagem);
}
