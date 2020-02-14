package getSetHomework;

public class ApplicationBox {
 public static void main (String[] args){
     Box firstBox = new Box();
     Box secondBox = new Box();
     firstBox.setContent(new Journal(13, "Vasea", "Roman"));
     secondBox.setContent(new Book(13, "Vasea", "Roman", 1999));
     System.out.println(firstBox.getContent().toString());
     System.out.println(secondBox.getContent().toString());
 }

}
