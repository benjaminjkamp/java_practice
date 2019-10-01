import java.util.Scanner;
import java.util.Random;

public class DriveThru {
  Scanner input = new Scanner(System.in);
  String customerInput, welcomeMessage, quiet, endOrder, orderComplete;
  String[] response = {"","",""};
  boolean orderStatus;

  public DriveThru(){
    welcomeMessage = "Welcome to Java Burger. We have specials on Hamburgers, Fish Fillet and Cookies for a dollar. Can I take your order?";
    quiet = "I'm sorry, you'll have to speak up Ma'am";
    endOrder = "THAT'S IT";
    orderComplete = "Pull up to the first window.";
    orderStatus = true;
    response[0] = "That comes with hash browns or fries.";
    response[1] = "Do you want cheese on that?";
    response[2] = "Do you want to supersize that?";
  }
  

  public void orderNow(){
    System.out.println(welcomeMessage);

    while (orderStatus){
      customerInput = input.nextLine();
      response();
    }
    
  }

  public void response(){
    Random random = new Random();
    int index = random.nextInt(3);
    if (customerInput.equals(endOrder)) {
      System.out.println(orderComplete);
      orderStatus = false;
    } else if (!customerInput.equals(customerInput.toUpperCase())){
      System.out.println(quiet);
    } else {
      System.out.println(response[index]);
    }
  }

  public static void main(String[] args) {
    DriveThru order = new DriveThru();
    order.orderNow();
  }
}


