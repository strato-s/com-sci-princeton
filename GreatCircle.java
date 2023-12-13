public class GreatCircle {
    public static void main(String[] args) {
        double a = Math.toRadians(Double.parseDouble(args[0]));
        double b = Math.toRadians(Double.parseDouble(args[1]));
        double c = Math.toRadians(Double.parseDouble(args[2]));
        double d = Math.toRadians(Double.parseDouble(args[3]));

        double distance;

        double t1 = Math.pow(Math.sin((c - a) / 2), 2);
        double t2 = Math.cos(a) * Math.cos(c)
                * Math.pow(Math.sin((d - b) / 2), 2);

        distance = (2 * 6371.0) * Math.asin(Math.sqrt(t1 + t2));

        System.out.println(distance + " kilometers");
    }
}
