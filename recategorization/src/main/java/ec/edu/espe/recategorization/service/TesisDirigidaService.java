package ec.edu.espe.recategorization.service;

import ec.edu.espe.recategorization.model.TesisDirigida;
import ec.edu.espe.recategorization.repository.TesisDirigidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TesisDirigidaService {

    @Autowired
    private TesisDirigidaRepository tesisDirigidaRepository;

    public List<TesisDirigida> findAll() {
        return tesisDirigidaRepository.findAll();
    }

    public Optional<TesisDirigida> findById(int id) {
        return tesisDirigidaRepository.findById(id);
    }

    public TesisDirigida save(TesisDirigida tesisDirigida) {
        return tesisDirigidaRepository.save(tesisDirigida);
    }

    public TesisDirigida update(int id, TesisDirigida tesisDirigidaDetails) {
        TesisDirigida tesisDirigida = tesisDirigidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TesisDirigida not found"));
        tesisDirigida.setTesis_id(tesisDirigidaDetails.getTesis_id());
        tesisDirigida.setPostulacion_id(tesisDirigidaDetails.getPostulacion_id());
        tesisDirigida.setCategoria_id(tesisDirigidaDetails.getCategoria_id());
        tesisDirigida.setDocumento_nombre(tesisDirigidaDetails.getDocumento_nombre());
        tesisDirigida.setDocumento_ubicacion(tesisDirigidaDetails.getDocumento_ubicacion());
        tesisDirigida.setTesis_fechapublicacion(tesisDirigidaDetails.getTesis_fechapublicacion());
        tesisDirigida.setTesis_fechacertificacion(tesisDirigidaDetails.getTesis_fechacertificacion());
        tesisDirigida.setTipo_direccion(tesisDirigidaDetails.getTipo_direccion());
        tesisDirigida.setTesis_externa(tesisDirigidaDetails.isTesis_externa());
        tesisDirigida.setTesis_universidad(tesisDirigidaDetails.getTesis_universidad());
        return tesisDirigidaRepository.save(tesisDirigida);
    }

    public void delete(int id) {
        TesisDirigida tesisDirigida = tesisDirigidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TesisDirigida not found"));
        tesisDirigidaRepository.delete(tesisDirigida);
    }
}