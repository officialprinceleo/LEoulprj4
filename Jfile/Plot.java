public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    // Default constructor
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    // Parameterized constructor
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Copy constructor
    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // Getters and Setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getDepth() { return depth; }
    public void setDepth(int depth) { this.depth = depth; }

    // Methods to check overlap and encompass
    public boolean overlaps(Plot plot) {
        return !(this.x + this.width <= plot.x || plot.x + plot.width <= this.x ||
                 this.y + this.depth <= plot.y || plot.y + plot.depth <= this.y);
    }

    public boolean encompasses(Plot plot) {
        return (this.x <= plot.x && this.y <= plot.y &&
                this.x + this.width >= plot.x + plot.width &&
                this.y + this.depth >= plot.y + plot.depth);
    }

    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
