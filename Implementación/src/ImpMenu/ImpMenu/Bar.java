package ImpMenu;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Bar extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear elementos de menú
        Menu fileMenu = new Menu("Archivo");
        MenuItem newMenuItem = new MenuItem("Nuevo");
        MenuItem openMenuItem = new MenuItem("Abrir");
        MenuItem saveMenuItem = new MenuItem("Guardar");
        MenuItem exitMenuItem = new MenuItem("Salir");

        // Definir acciones para los elementos de menú de archivo
        newMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Nuevo");
            }
        });

        openMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Abrir");
            }
        });

        saveMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Guardar");
            }
        });

        exitMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Salir");
                primaryStage.close();
            }
        });

        // Añadir elementos de menú al menú de archivo
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);

        // Crear los elementos del menú "Editar"
        Menu editMenu = new Menu("Editar");
        MenuItem copyMenuItem = new MenuItem("Copiar");
        MenuItem pasteMenuItem = new MenuItem("Pegar");
        MenuItem deleteMenuItem = new MenuItem("Eliminar");

        // Definir acciones para los elementos de menú "Editar"
        copyMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Copiar");
            }
        });

        pasteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Pegar");
            }
        });

        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Eliminar");
            }
        });

        // Añadir elementos de menú al menú de "Editar"
        editMenu.getItems().addAll(copyMenuItem, pasteMenuItem, deleteMenuItem);

        // Crear el menú "Ayuda"
        Menu helpMenu = new Menu("Ayuda");
        MenuItem aboutMenuItem = new MenuItem("Acerca de");

        // Definir acción para el elemento de menú "Acerca de"
        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Acerca de");
            }
        });

        // Añadir elemento de menú al menú "Ayuda"
        helpMenu.getItems().add(aboutMenuItem);

        // Crear la barra de menú y añadir los menús
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Crear el diseño BorderPane y agregar la barra de menú
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Configurar la escena y mostrarla
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Implementación de un Sistema de Menús en una Aplicación JavaFX\r\n");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
