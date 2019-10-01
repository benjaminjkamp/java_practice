// Initial Solution. Works for any number with less than 10 digits.
// pass in a number, and return it as a reader-friendly string with commas inserted

public class addingCommas{

  // int number;
  String prettyNum;

  public addingCommas(){
    
  }
  public String arrayToString(String[] newArray){
    String prettyNum = "";
    for (String character : newArray){
      prettyNum = prettyNum + character;
    }
    return prettyNum;
  }

  public void addCommas(Integer number){
    prettyNum = number.toString();
    char comma = ',';
    char[] numArray = prettyNum.toCharArray();
    int length;
    
    int index = 1;
    if (numArray.length > 3) {
      if (numArray.length < 7) {
        index = numArray.length - 3;
        length = 0;
      } else{
        index = numArray.length - 6;
        length = 1;
      }
      char[] newArray = new char[numArray.length + 1 + length];
    
      for (int i = 0; i < newArray.length; i++) {
        if (i == index) {
          newArray[i] = comma;
        } else if (numArray.length > 6 && i == index + 3) {
          newArray[i] = numArray[i];
          i++;
          newArray[i] = comma;
        
        } else if (i > 4) {
          newArray[i] = numArray[i - 2];
        } else if (i > 1) {
          newArray[i] = numArray[i - 1];
        } else {
          newArray[i] = numArray[i];
        }
      }
      String prettyNum = new String(newArray);
      System.out.println(prettyNum);
    } else {
      prettyNum = new String(prettyNum);
      System.out.println(prettyNum);
    }
    // newArray[0] = numArray[0];
    // newArray[1] = comma;
    // newArray[2] = numArray[1];
    // newArray[3] = numArray[2];
    // newArray[4] = numArray[3];
    
    
    
    // System.out.println(prettyNum);
  }


  public static void main(String[] args){
    addingCommas number = new addingCommas();
    number.addCommas(5);       // => "5"
    number.addCommas(299);     // => "299"
    number.addCommas(1818);    // => "1,818"
    number.addCommas(9999999); // => "9,999,999"
  }
}

