package com.seuprojeto.pdv.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistroProdutosView {
    private Stage stage;
    private Scene scene;

    public RegistroProdutosView(Stage stage) {
        this.stage = stage;
        initUI();
    }

    private void initUI() {
        VBox root = new VBox();
        Label label = new Label("Registrar Produtos");
        TextField produtoField = new TextField();
        produtoField.setPromptText("Nome do Produto");
        Button registrarButton = new Button("Registrar Produto");

        registrarButton.setOnAction(e -> {
            // lógica para registrar o produto
            // após registrar, mudar para a tela de pagamento
            new PagamentoView(stage);
        });

        root.getChildren().addAll(label, produtoField, registrarButton);
        scene = new Scene(root, 300, 200);
        stage.setScene(scene);
    }
}
