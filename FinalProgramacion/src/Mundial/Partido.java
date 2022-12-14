package Mundial;

import Mundial.Equipo;
import Mundial.EtapaMundial;

import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Resultado getResultado() {
        return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setEquipo(EtapaMundial etapaMundial) {
    }
    public Partido (Date fecha,Equipo local,Equipo visitante, Resultado resultado){
        this.fecha=fecha;
        this.local=local;
        this.visitante=visitante;
        this.resultado=resultado;
    }
}
