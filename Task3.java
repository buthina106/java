public class Task3 {
    public static void main(String[] args) {
        if(args.length == 2) {
            int number = Integer.parseInt(args[0]);
            String result = args[1];
            for(int i = 0; i < number; i++) {
                System.out.println(result);
            }
        } else {
            System.out.println("Please provide two arguments number and string");
        }
    }
}
