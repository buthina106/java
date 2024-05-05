class ThrowErrorMessage extends Exception {
  public ThrowErrorMessage(String msg) {
      super(msg);
  }
}

class Errors {
  public String intParserErrorStr(String str) throws ThrowErrorMessage {
      if (str.matches("\\d+")) {
          return str;
      } else {
          throw new ThrowErrorMessage("Error: couldn't parse string to int");
      }
  }

  public int numberCheck(int num) throws ThrowErrorMessage {
      if (num < 0) {
          throw new ThrowErrorMessage("Error: Number cannot be negative");
      } else {
          return num;
      }
  }

  public void argumentCheck(String[] args) throws ThrowErrorMessage {
      if (args.length != 1) {
          throw new ThrowErrorMessage("Error: The app needs exactly 1 number argument");
      }
  }
}

public class Factorial {
  public static void main(String[] args) {
      try {
          Errors error = new Errors();
          error.argumentCheck(args);
          int number = Integer.parseInt(error.intParserErrorStr(args[0]));
          error.numberCheck(number);

          int factorial = 1;
          for (int i = 1; i <= number; i++) {
              factorial *= i;
          }
          System.out.println("Factorial of " + number + " is: " + factorial);
      } catch (ThrowErrorMessage e) {
          e.printStackTrace();
      } catch (NumberFormatException e) {
          System.out.println("Error: Invalid number format");
          e.printStackTrace();
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Error: No arguments provided");
          e.printStackTrace();
      } finally {
          System.out.println("Finally block executed.");
      }
  }
}
