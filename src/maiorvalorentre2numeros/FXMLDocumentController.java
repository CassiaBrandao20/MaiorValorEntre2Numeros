package maiorvalorentre2numeros;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Integer valor1, valor2, result;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private TextField cx2;

    @FXML
    private TextField cx1;

    @FXML
    private TextField cx3;

    @FXML
    void verif(ActionEvent event) {
        valor1=Integer.valueOf(cx1.getText());
        valor2=Integer.valueOf(cx2.getText());
        cx3.setText(verificaResult(result));
        
    }

    private String verificaResult(Integer result) {
    String resultado;
 
        if(valor1>valor2)
            resultado="O 1º numero é o maior: "+valor1;
        else 
            resultado="O 2º numero é o maior: "+valor2;
        return resultado;
        
    }

}

