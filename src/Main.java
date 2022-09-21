public class Main {
    public static void main(String[] args) {
        Index service = new Index();
        int weight = 65;
        double height = 1.62;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}