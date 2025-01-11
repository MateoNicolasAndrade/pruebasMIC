package ec.edu.espe.recategorization.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class TesisDirigidaId {
    private int documento_id;
    private int tesis_id;

    //Getters and Setters

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

    @Override
    public int hashCode() {
        return Objects.hash(documento_id, tesis_id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TesisDirigidaId)) {
            return false;
        }
        TesisDirigidaId tesisDirigidaId = (TesisDirigidaId) obj;
        return documento_id == tesisDirigidaId.documento_id && tesis_id == tesisDirigidaId.tesis_id;
    }
    
}
