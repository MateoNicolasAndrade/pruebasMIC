package ec.edu.espe.recategorization.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.edu.espe.recategorization.model.Documento;
import ec.edu.espe.recategorization.service.DocumentoService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping
    public List<Documento> getAllDocumentos() {
        return documentoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Documento> getDocumentoById(@PathVariable Integer id) {
        Optional<Documento> documento = documentoService.findById(id);
        return documento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Documento createDocumento(@RequestBody Documento documento) {
        return documentoService.createDocumento(documento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Documento> updateDocumento(@PathVariable Integer id, @RequestBody Documento documentoDetails) {
        try {
            Documento updatedDocumento = documentoService.updateDocumento(id, documentoDetails);
            return ResponseEntity.ok(updatedDocumento);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocumento(@PathVariable Integer id) {
        try {
            documentoService.deleteDocumento(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}