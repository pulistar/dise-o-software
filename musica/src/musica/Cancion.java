package musica;


import java.util.List;


class Cancion {
    private String titulo;
    private int duracionMinutos;
    private int duracionSegundos;
    private List<String> interpretes;
    private String compositor;

    public Cancion(String titulo, int duracionMinutos, int duracionSegundos, List<String> interpretes, String compositor) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.interpretes = interpretes;
        this.compositor = compositor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public List<String> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<String> interpretes) {
        this.interpretes = interpretes;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
