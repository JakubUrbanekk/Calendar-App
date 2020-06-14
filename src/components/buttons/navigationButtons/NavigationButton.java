package components.buttons.navigationButtons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class NavigationButton extends JButton implements ActionListener {
    public abstract void changeCurrentDateBy(int timePeriod);
}
