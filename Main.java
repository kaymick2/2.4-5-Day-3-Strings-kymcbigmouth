class Main {
  public static void main(String[] args) {
  String word = "I love computer science!";
  System.out.println(word);
  int x = word.length();
  System.out.println("the length of the string is: " + x);
  word = word.replace("computer science", "algebra");
  //you have to type word = here because it saves the operation to the string object. otherwise it just treats it like it never happened.
  System.out.println(word);
  String bigword = word.toUpperCase();
  String smallword = word.toLowerCase();
  System.out.println(bigword);
  System.out.println(smallword);
  }
}