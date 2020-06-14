package components.editTexts;

import components.NotificatorComponent;
import observators.observatorInterfaces.DateObservator;
import observators.observatorManagers.DateObserverManager;

import java.time.LocalDate;

public class DateEditText extends AbstractEditText implements DateObservator, NotificatorComponent {
    private LocalDate editTextDate;

    public DateEditText(LocalDate editTextDate) {
        this.editTextDate = editTextDate;
        setText(editTextDate.toString());
    }

    @Override
    public void update(LocalDate localDate) {
        setText(localDate.toString());
    }

    @Override
    protected void afterTextChanged() {
        notifyObservers(editTextDate);
    }

    @Override
    public void notifyObservers(LocalDate localDate) {
        DateObserverManager.getInstance().notifyObservers(localDate);
    }
}
