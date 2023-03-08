package db_manager;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class Toolkits {
	static	public void setHint(JTextField textField, String hint) {
        // Set the foreground color to gray
        textField.setForeground(Color.GRAY);

        // Add a focus listener to the text field
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // If the text field is focused, clear the hint and set the foreground color to black
                if (textField.getText().equals(hint)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // If the text field is not focused and the text is empty, set the hint and the foreground color to gray
                if (textField.getText().isEmpty()) {
                    textField.setText(hint);
                    textField.setForeground(Color.GRAY);
                }
            }
        });

        // Set the initial text to the hint and the foreground color to gray
        textField.setText(hint);
        textField.setForeground(Color.GRAY);
    }
}
