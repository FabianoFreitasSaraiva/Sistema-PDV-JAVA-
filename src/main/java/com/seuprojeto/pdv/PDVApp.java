package com.seuprojeto.pdv;

import com.seuprojeto.pdv.views.RegistroProdutosView;
import javafx.application.Application;
import javafx.stage.Stage;

public class PDVApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema PDV");
        new RegistroProdutosView(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void gerarNotaFiscalXML() {
        // Implementação do método de geração do XML
    }
}
