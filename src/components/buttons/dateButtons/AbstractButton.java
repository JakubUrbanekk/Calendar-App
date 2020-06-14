package components.buttons.dateButtons;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractButton extends JButton implements ActionListener {
    public AbstractButton() {
        addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        afterButtonClicked();
    }

    public abstract void afterButtonClicked();

}
