package week5_6;

class Sphere {
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return diameter / 2;
    }

    public double getVolume() {
        double r = getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public double getSurfaceArea() {
        double r = getRadius();
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public String toString() {
        return "Sphere [diameter=" + diameter + ", volume=" + getVolume() + ", surfaceArea=" + getSurfaceArea() + "]";
    }
}

