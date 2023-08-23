package com.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextArea txtJogosCadastrados;
    @FXML TextArea txtDescricaoJogo;
    @FXML TextField txtTituloJogos;
    @FXML RadioButton rdAventura;
    @FXML RadioButton rdEsporte;
    @FXML RadioButton rdRpg;
    @FXML CheckBox cbZerado;
    @FXML CheckBox cbPlatinado;
    

    @FXML ObservableList<Game> listaGames = FXCollections.observableArrayList();


}
