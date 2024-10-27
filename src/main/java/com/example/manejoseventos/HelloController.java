package com.example.manejoseventos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private ListView<String> listView;
    @FXML
    private Button clearButton;
    @FXML
    private Button pulsame1;
    @FXML
    private Button pulsame2;
    @FXML
    private Button pulsame3;
    @FXML
    private TextArea textArea;


    ObservableList<String> list_combo = FXCollections.observableArrayList("Estudiante", "Profesor", "Profesor invitado", "Administrador");

    List<String> list_choice = new ArrayList<String>(FXCollections.observableArrayList("España", "Portugal", "Francia", "Italia"));

    List<String> list_view = new ArrayList<String>(FXCollections.observableArrayList("Gato", "Perro", "Pajaro", "Caballo"));

    @FXML
    protected void clear() {
        comboBox.setValue("");
        choiceBox.setValue("");
        listView.getSelectionModel().clearSelection();
    }

    @FXML
    protected void pulsame1OnAction() {
        textArea.setText("Púlsame 1");
    }

    @FXML
    protected void pulsame2OnAction() {
        textArea.setText("Púlsame 2");
    }

    @FXML
    protected void pulsame3OnAction() {
        textArea.setText("Púlsame 3");
    }

    @FXML
    protected void sendComboBox() {
        textArea.setText(comboBox.getValue());
    }

    @FXML
    protected void sendChoiceBox() {
        textArea.setText(choiceBox.getValue());
    }

    @FXML
    protected void sendListView() {
        textArea.setText(listView.getSelectionModel().getSelectedItem());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().addAll(list_combo);
        choiceBox.getItems().addAll(list_choice);
        listView.getItems().addAll(list_view);
    }
}