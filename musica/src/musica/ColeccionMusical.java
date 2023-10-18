package musica;

import java.util.ArrayList;
import java.util.List;


public class ColeccionMusical {
    List<Cancion> canciones;

    public ColeccionMusical() {
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void modificarCancion(int indice, String nuevoTitulo, int nuevaDuracionMinutos, int nuevaDuracionSegundos, List<String> nuevosInterpretes, String nuevoCompositor) {
        if (indice >= 0 && indice < canciones.size()) {
            Cancion cancion = canciones.get(indice);
            cancion.setTitulo(nuevoTitulo);
            cancion.setDuracionMinutos(nuevaDuracionMinutos);
            cancion.setDuracionSegundos(nuevaDuracionSegundos);
            cancion.setInterpretes(nuevosInterpretes);
            cancion.setCompositor(nuevoCompositor);
        }
    }

    public void eliminarCancion(int indice) {
        if (indice >= 0 && indice < canciones.size()) {
            canciones.remove(indice);
        }
    }

    public void verCanciones() {
        for (int i = 0; i < canciones.size(); i++) {
            Cancion cancion = canciones.get(i);
            System.out.println("Canción " + (i + 1));
            System.out.println("Título: " + cancion.getTitulo());
            System.out.println("Duración: " + cancion.getDuracionMinutos() + "m " + cancion.getDuracionSegundos() + "s");
            System.out.println("Intérpretes: " + cancion.getInterpretes());
            System.out.println("Compositor: " + cancion.getCompositor());
            System.out.println("---------------");
        }
    }
}

