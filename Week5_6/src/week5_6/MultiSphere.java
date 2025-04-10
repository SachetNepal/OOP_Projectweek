package week5_6;
class MultiSphere {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(10);
        Sphere s2 = new Sphere(6.4);
        Sphere s3 = new Sphere(15);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.setDiameter(12);
        System.out.println("\nUpdated s1:");
        System.out.println(s1);
    }
}