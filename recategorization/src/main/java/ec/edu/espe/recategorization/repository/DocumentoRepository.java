package ec.edu.espe.recategorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.espe.recategorization.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {
}