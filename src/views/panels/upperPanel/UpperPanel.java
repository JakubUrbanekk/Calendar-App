package views.panels.upperPanel;

import components.editTexts.DateEditText;
import observators.observatorManagers.DateObserverManager;
import views.panels.Panel;

import java.awt.*;
import java.time.LocalDate;

public class UpperPanel extends Panel {
    private DateEditText editText;

    public UpperPanel (LocalDate date){
        setLayout(new FlowLayout());
        setVisibility(true);
        editText = new DateEditText(date);
        createView();
    }

    @Override
    public void createView() {
        add(editText);
        DateObserverManager.getInstance().registerObservator(editText);
        setVisible(true);
    }
}
