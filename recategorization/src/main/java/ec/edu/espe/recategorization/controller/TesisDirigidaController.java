package ec.edu.espe.recategorization.controller;

import ec.edu.espe.recategorization.model.TesisDirigida;
import ec.edu.espe.recategorization.service.TesisDirigidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tesisdirigidas")
public class TesisDirigidaController {

    @Autowired
    private TesisDirigidaService tesisDirigidaService;

    @GetMapping
    public List<TesisDirigida> getAllTesisDirigidas() {
        return tesisDirigidaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TesisDirigida> getTesisDirigidaById(@PathVariable int id) {
        TesisDirigida tesisDirigida = tesisDirigidaService.findById(id)
                .orElseThrow(() -> new RuntimeException("TesisDirigida not found"));
        return ResponseEntity.ok(tesisDirigida);
    }

    @PostMapping
    public TesisDirigida createTesisDirigida(@RequestBody TesisDirigida tesisDirigida) {
        return tesisDirigidaService.save(tesisDirigida);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TesisDirigida> updateTesisDirigida(@PathVariable int id, @RequestBody TesisDirigida tesisDirigidaDetails) {
        TesisDirigida updatedTesisDirigida = tesisDirigidaService.update(id, tesisDirigidaDetails);
        return ResponseEntity.ok(updatedTesisDirigida);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTesisDirigida(@PathVariable int id) {
        tesisDirigidaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}