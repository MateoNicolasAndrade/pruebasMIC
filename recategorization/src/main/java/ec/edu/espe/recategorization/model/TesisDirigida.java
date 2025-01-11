package ec.edu.espe.recategorization.model;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TesisDirigida extends Documento {

    @EmbeddedId
    private TesisDirigidaId id;

    private int documento_id;
    @Id
    private int tesis_id;
    private int postulacion_id;
    private int categoria_id;
    private String documento_nombre;
    private String documento_ubicacion;
    private LocalDate tesis_fechapublicacion;
    private LocalDate tesis_fechacertificacion;
    private String tipo_direccion;
    private boolean tesis_externa;
    private String tesis_universidad;

    // Getters y setters

    public int getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(int documento_id) {
        this.documento_id = documento_id;
    }

    public int getTesis_id() {
        return tesis_id;
    }

    public void setTesis_id(int tesis_id) {
        this.tesis_id = tesis_id;
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

    public LocalDate getTesis_fechapublicacion() {
        return tesis_fechapublicacion;
    }

    public void setTesis_fechapublicacion(LocalDate tesis_fechapublicacion) {
        this.tesis_fechapublicacion = tesis_fechapublicacion;
    }

    public LocalDate getTesis_fechacertificacion() {
        return tesis_fechacertificacion;
    }

    public void setTesis_fechacertificacion(LocalDate tesis_fechacertificacion) {
        this.tesis_fechacertificacion = tesis_fechacertificacion;
    }

    public String getTipo_direccion() {
        return tipo_direccion;
    }

    public void setTipo_direccion(String tipo_direccion) {
        this.tipo_direccion = tipo_direccion;
    }

    public boolean isTesis_externa() {
        return tesis_externa;
    }

    public void setTesis_externa(boolean tesis_externa) {
        this.tesis_externa = tesis_externa;
    }

    public String getTesis_universidad() {
        return tesis_universidad;
    }

    public void setTesis_universidad(String tesis_universidad) {
        this.tesis_universidad = tesis_universidad;
    }

    @Override
    public String toString() {
        return "TesisDirigida{" +
                "documento_id=" + documento_id +
                ", tesis_id=" + tesis_id +
                ", postulacion_id=" + postulacion_id +
                ", categoria_id=" + categoria_id +
                ", documento_nombre='" + documento_nombre + '\'' +
                ", documento_ubicacion='" + documento_ubicacion + '\'' +
                ", tesis_fechapublicacion=" + tesis_fechapublicacion +
                ", tesis_fechacertificacion=" + tesis_fechacertificacion +
                ", tipo_direccion='" + tipo_direccion + '\'' +
                ", tesis_externa=" + tesis_externa +
                ", tesis_universidad='" + tesis_universidad + '\'' +
                '}';
    }

    public TesisDirigidaId getId() {
        return id;
    }

    public void setId(TesisDirigidaId id) {
        this.id = id;
    }
}
