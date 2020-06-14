package views.panels.lowerPanel;

import components.buttons.dateButtons.DateButton;
import observators.observatorManagers.DateObserverManager;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ButtonDateLowerPanel extends LowerPanel implements ButtonPanel<LocalDate>{
    private List<DateButton> buttons;

    public ButtonDateLowerPanel(List<LocalDate> dates, int rows, int columns) {
        buttons = new ArrayList<>();
        setLayout(new GridLayout(rows, columns));
        setVisible(true);
        createButtons(dates);
        createView();
    }

    @Override
    public void createView() {
        buttons.stream()
                .forEach(button -> {
                    add(button);
                    DateObserverManager.getInstance().registerObservator(button);
                });
    }

    @Override
    public void createButtons(List<LocalDate> dates) {
        dates.stream()
                .forEach(date -> buttons.add(new DateButton(date)));
    }

}
