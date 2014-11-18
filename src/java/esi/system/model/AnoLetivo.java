package esi.system.model;

import java.util.Objects;

/**
 *
 * @author Bruno
 */
public class AnoLetivo {
    private int id;
    private String anoLetivo;

    public AnoLetivo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.anoLetivo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnoLetivo other = (AnoLetivo) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.anoLetivo, other.anoLetivo);
    }
    
    
}
