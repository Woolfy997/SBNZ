package ftn.siit.sbnz.SBNZ.services;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class SessionService {

    private final KieSession kieSession;

    @Autowired
    public SessionService(KieContainer kieContainer){
        this.kieSession = kieContainer.newKieSession("kars");
    }

    public KieSession getKieSession() {
        return kieSession;
    }

}
