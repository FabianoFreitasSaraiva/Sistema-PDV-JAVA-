package com.seuprojeto.pdv.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PagamentoView {
    private Stage stage;
    private Scene scene;

    public PagamentoView(Stage stage) {
        this.stage = stage;
        initUI();
    }

    private void initUI() {
        VBox root = new VBox();
        Label label = new Label("Escolher Forma de Pagamento");
        TextField pagamentoField = new TextField();
        pagamentoField.setPromptText("Forma de Pagamento");
        Button pagamentoButton = new Button("Confirmar Pagamento");

        pagamentoButton.setOnAction(e -> {
            // lógica para confirmar o pagamento
            // após confirmar, mudar para a tela de finalização
            new FinalizacaoView(stage);
        });

        root.getChildren().addAll(label, pagamentoField, pagamentoButton);
        scene = new Scene(root, 300, 200);
        stage.setScene(scene);
    }
}
