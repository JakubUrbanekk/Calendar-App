package views.panels.lowerPanel;

import components.buttons.dateButtons.AbstractButton;

import java.util.List;

public interface ButtonPanel <T> {
    public void createButtons(List<T> buttonDate);
}
