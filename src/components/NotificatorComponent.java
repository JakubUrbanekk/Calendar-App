package components;

import java.time.LocalDate;

public interface NotificatorComponent {
    public void notifyObservers(LocalDate localDate);
}
