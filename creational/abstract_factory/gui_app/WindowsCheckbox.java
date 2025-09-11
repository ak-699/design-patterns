package creational.abstract_factory.gui_app;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void onCheck() {
        System.out.println("WINDOWS CHECKBOX.");
    }

}
