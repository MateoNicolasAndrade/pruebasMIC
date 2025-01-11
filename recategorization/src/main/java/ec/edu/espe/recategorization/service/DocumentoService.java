package ec.edu.espe.recategorization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.recategorization.model.Documento;
import ec.edu.espe.recategorization.repository.DocumentoRepository;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    public List<Documento> findAll() {
        return documentoRepository.findAll();
    }

    public Optional<Documento> findById(Integer id) {
        return documentoRepository.findById(id);
    }

    public Documento createDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    public Documento updateDocumento(Integer id, Documento documentoDetails) {
        Documento documento = documentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Documento not found"));
        documento.setDocumento_id(documentoDetails.getDocumento_id());
        documento.setPostulacion_id(documentoDetails.getPostulacion_id());
        documento.setCategoria_id(documentoDetails.getCategoria_id());
        documento.setDocumento_nombre(documentoDetails.getDocumento_nombre());
        documento.setDocumento_ubicacion(documentoDetails.getDocumento_ubicacion());
        return documentoRepository.save(documento);
    }

    public void deleteDocumento(Integer id) {
        Documento documento = documentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Documento not found"));
        documentoRepository.delete(documento);
    }
}