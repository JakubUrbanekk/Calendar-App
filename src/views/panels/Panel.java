package views.panels;

import javax.swing.*;

public abstract class Panel extends JPanel implements PanelOperations {
    public void setVisibility(Boolean bool){
        setVisible(bool);
    }
}
