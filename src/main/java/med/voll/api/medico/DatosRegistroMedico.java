package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico (
        String nombre,
        String correo,
        String telefono,
        String documento,
        Especialidad especialidad,
        DatosDireccion direccion
){}

