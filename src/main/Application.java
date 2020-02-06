import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;

@SuppressWarnings("all")
public class Application {
    public static ArrayList<FelineInterface> felineArray = new ArrayList<>();
    private static List<String> catsNameList = new ArrayList<>();


    public static void main(String[] args) {

        initGui();

    }

    public static void initGui() {
        JButton saveBtn = new JButton("SAVE");
        JTextField nameInput = new JTextField();
        JTextField raceInput = new JTextField();
        JTextField yearInput = new JTextField();

        JFrame window = new JFrame("Cat Database App");
        window.getContentPane().add(nameInput);
        window.getContentPane().add(raceInput);
        window.getContentPane().add(yearInput);
        window.getContentPane().add(saveBtn);

        window.getContentPane().setLayout(
                new BoxLayout(window.getContentPane(),
                        BoxLayout.PAGE_AXIS
                ));
        window.setBounds(100, 100, 400, 300);
        window.show();

//OBSERVER - anonymous
//IoC - Inversion of Control
        saveBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

//accumulate
                //catsNameList.add(nameInput.getText());
               // catsNameList.add(nameInput.getText());
                //catsNameList.add(nameInput.getText());
                //System.out.println( catsNameList.get(catsNameList.size() - 1) );
                //System.out.println("Cats in the collection " + catsNameList.size());
                //nameInput.setText("");
               // printList();
                felineArray.add(new Cat(nameInput.getText(),raceInput.getText(), Integer.parseInt(yearInput.getText()) ));
                System.out.println( felineArray.get(felineArray.size() - 1) );
                System.out.println("Cats in the collection " + felineArray.size());
                nameInput.setText("");
                raceInput.setText("");
                yearInput.setText("");
                printList();
            }

        } );


    }
    public static void printList() {
        System.out.print("[" +  felineArray.size() + "]: ");
/*for (int i = 0; i < catsNameList.size(); i++) {
System.out.println(catsNameList.get(i) + ", ");
}*/
        System.out.println( ","  + felineArray);
    }

}