package observators.observatorManagers;

import observators.observatorInterfaces.DateObservator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateObserverManager implements ObservatorManager {
    private static DateObserverManager CONTROL_PANEL_INSTANCE;
    private List<DateObservator> observators;

    private DateObserverManager() {
        observators = new ArrayList<>();
    }

    public static DateObserverManager getInstance(){
        if(CONTROL_PANEL_INSTANCE == null){
            CONTROL_PANEL_INSTANCE = new DateObserverManager();
        }
        return CONTROL_PANEL_INSTANCE;
    }

    @Override
    public void notifyObservers(LocalDate localDate){
        observators.forEach(observator -> observator.update(localDate));
    }

    @Override
    public void registerObservator(DateObservator dateObservator) {
        observators.add(dateObservator);
    }
}
