package components.editTexts;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractEditText extends JTextField implements ActionListener {
    public void AbstractEditText(){
        addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        afterTextChanged();
    }

    protected abstract void afterTextChanged();
}
