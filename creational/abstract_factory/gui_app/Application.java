package creational.abstract_factory.gui_app;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(String os) {
        GUIFactory factory;
        if ("windows".equalsIgnoreCase(os)) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public Button getButton() {
        return button;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public static void main(String[] args) {
        Application app = new Application("macos");
        app.getButton().onPress();
        app.getCheckbox().onCheck();
    }

}
