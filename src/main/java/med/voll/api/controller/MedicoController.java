package med.voll.api.controller;

import med.voll.api.model.DatosRegistroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void registrar(@RequestBody DatosRegistroMedico json){
        System.out.println(json);
    }
}
