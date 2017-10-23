package screens;

@Monitor
public abstract class Screen {

    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}