package com.javaAplication.java.dto;

import javax.validation.constraints.NotBlank;

public class pruebaDto 
{
    @NotBlank(message = "no se ha encontrado el mensaje correspondiente, Porfavor vuelva a revisar")
    private String mensaje;

    public String getMensaje()
    {
        return mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }
}
