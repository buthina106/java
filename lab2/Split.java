public class Split {
    public static void main(String[] args) {
        String ipAddress = "200.168.0.1";

        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        if (ipAddress.matches(regex)) {
            String[] parts = ipAddress.split("\\.");

            System.out.println("IP Address Parts:");
            for (String part : parts) {
                System.out.println(part);
            }
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
