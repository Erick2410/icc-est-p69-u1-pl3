package controllers;

import java.util.List;
import models.Incidente;
import java.util.Objects;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
       incidentes.sort(null);
       return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        Objects.requireNonNull(incidentes, "incidentes");
        Objects.requireNonNull(objetivo, "objetivo");

        int low = 0;
        int high = incidentes.size()-1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            int com = incidentes.get(mid).compareTo(objetivo);
            if (com == 0) {
                return mid;
            } else if (com < 0){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
