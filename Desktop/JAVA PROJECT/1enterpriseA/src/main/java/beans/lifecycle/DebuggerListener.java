/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.lifecycle;

/**
 *
 * @author homec
 */


import jakarta.faces.event.PhaseEvent;
import jakarta.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebuggerListener implements jakarta.faces.event.PhaseListener{
    
  Logger log = LogManager.getRootLogger();
    
    @Override
    public void beforePhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Antes de la fase:" + pe.getPhaseId().toString());
    }

    @Override
    public void afterPhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Despues de la fase" + pe.getPhaseId().toString() );
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }   
    
}
