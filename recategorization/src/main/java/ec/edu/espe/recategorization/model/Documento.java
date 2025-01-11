package ec.edu.espe.recategorization.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Documento {
    @Id
    private int documento_id;
    private int postulacion_id;
    private int categoria_id;
    private String documento_nombre;
    private String documento_ubicacion;

    // Getters and Setters

    public int getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(int documento_id) {
        this.documento_id = documento_id;
    }

    public int getPostulacion_id() {
        return postulacion_id;
    }

    public void setPostulacion_id(int postulacion_id) {
        this.postulacion_id = postulacion_id;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getDocumento_nombre() {
        return documento_nombre;
    }

    public void setDocumento_nombre(String documento_nombre) {
        this.documento_nombre = documento_nombre;
    }

    public String getDocumento_ubicacion() {
        return documento_ubicacion;
    }

    public void setDocumento_ubicacion(String documento_ubicacion) {
        this.documento_ubicacion = documento_ubicacion;
    }

    @Override
    public String toString() {
        return "Documento{" + "documento_id=" + documento_id + ", postulacion_id=" + postulacion_id + ", categoria_id=" + categoria_id + ", documento_nombre=" + documento_nombre + ", documento_ubicacion=" + documento_ubicacion + '}';
    }

}
