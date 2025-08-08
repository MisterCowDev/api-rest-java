package med.voll.api.model;

import med.voll.api.direccion.Direccion;

public record DatosRegistroMedico (
        String nombre,
        String correo,
        String telefono,
        String documento,
        Especialidad especialidad,
        Direccion direccion
){}

