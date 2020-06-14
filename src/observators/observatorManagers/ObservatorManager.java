package observators.observatorManagers;

import observators.observatorInterfaces.DateObservator;

import java.time.LocalDate;

public interface ObservatorManager {
    public void notifyObservers(LocalDate localDate);
    public void registerObservator(DateObservator dateObservator);
}
