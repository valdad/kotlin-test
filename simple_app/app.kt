import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class HelloWorldApp : Application() {

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Hello World App"

        val button = Button()
        button.text = "Нажми меня!"

        button.setOnAction {
            println("Привет, мир!")
        }

        val root = StackPane()
        root.children.add(button)

        primaryStage.scene = Scene(root, 300.0, 250.0)

        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloWorldApp::class.java)
}
