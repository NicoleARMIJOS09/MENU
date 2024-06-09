package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        MenuItem nuevoArchivo = new MenuItem("Nuevo archivo");
        MenuItem abrirArchivo = new MenuItem("Abrir archivo");
        MenuItem guardarArchivo = new MenuItem("Guardar archivo");
        MenuItem salirArchivo = new MenuItem("Salir");
        menuArchivo.getItems().addAll(nuevoArchivo, abrirArchivo, guardarArchivo, new SeparatorMenuItem(), salirArchivo);

        MenuItem cortarEditar = new MenuItem("Cortar");
        MenuItem copiarEditar = new MenuItem("Copiar");
        MenuItem pegarEditar = new MenuItem("Pegar");
        menuEditar.getItems().addAll(cortarEditar, copiarEditar, pegarEditar);

        MenuItem acercaDeAyuda = new MenuItem("Acerca de..");
        menuAyuda.getItems().add(acercaDeAyuda);

        nuevoArchivo.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        abrirArchivo.setOnAction(e -> System.out.println("Abrir archivo"));
        guardarArchivo.setOnAction(e -> System.out.println("Guardar archivo"));
        salirArchivo.setOnAction(e -> primaryStage.close());
        cortarEditar.setOnAction(e -> System.out.println("Ha sido recortado correctamente"));
        copiarEditar.setOnAction(e -> System.out.println("Ha sido copiado correctamente"));
        pegarEditar.setOnAction(e -> System.out.println("Ha sido pegado correctamente"));
        
        acercaDeAyuda.setOnAction(e -> System.out.println("INFORMACION DEL PROGRAMA"));

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo de Menú en JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
