package com.seuprojeto.pdv.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinalizacaoView {
    private Stage stage;
    private Scene scene;

    public FinalizacaoView(Stage stage) {
        this.stage = stage;
        initUI();
    }

    private void initUI() {
        VBox root = new VBox();
        Label label = new Label("Finalizar Venda");
        Button finalizarButton = new Button("Finalizar Venda");

        finalizarButton.setOnAction(e -> {
            // lógica para finalizar a venda e gerar o XML
            PDVApp.gerarNotaFiscalXML();
            stage.close();  // ou redirecionar para outra view se necessário
        });

        root.getChildren().addAll(label, finalizarButton);
        scene = new Scene(root, 300, 200);
        stage.setScene(scene);
    }
}
