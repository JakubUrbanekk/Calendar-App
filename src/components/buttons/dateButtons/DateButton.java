package components.buttons.dateButtons;

import components.NotificatorComponent;
import observators.observatorInterfaces.DateObservator;
import observators.observatorManagers.DateObserverManager;

import java.awt.*;
import java.time.LocalDate;

public class DateButton extends AbstractButton implements DateObservator, NotificatorComponent {
    private LocalDate buttonDate;

    public DateButton (LocalDate localDate){
        buttonDate = localDate;
        setText(buttonDate.toString());
    }

    @Override
    public void afterButtonClicked() {
        notifyObservers(buttonDate);
    }

    @Override
    public void update(LocalDate localDate) {
        if(localDate.compareTo(buttonDate) == 0)
            setBackground(Color.ORANGE);
        else if (getBackground().equals(Color.ORANGE)){
            setBackground(null);
        }
    }

    @Override
    public void notifyObservers(LocalDate localDate) {
        DateObserverManager.getInstance().notifyObservers(localDate);
    }
}
