import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application implements EventHandler<ActionEvent>{
    boolean isXturn = true;
    int turns = 0;
    int r1 = 30;
    int r2 = 70;
    int r3 = 110;
    int r4 = 150;
    int r5 = 190;
    int c1 = 20;
    int c2 = 60;
    int c3 = 100;
    int c4 = 140;
    int c5 = 180;
    Label turnLabel;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primeStage) throws Exception {
        
        primeStage.setTitle("Tic-Tac-Toe");

        button1 = new Button();
        button1.setText("-");
        button1.setOnAction(this);

        button2 = new Button();
        button2.setText("-");
        button2.setOnAction(this);

        button3 = new Button();
        button3.setText("-");
        button3.setOnAction(this);

        button4 = new Button();
        button4.setText("-");
        button4.setOnAction(this);

        button5 = new Button();
        button5.setText("-");
        button5.setOnAction(this);

        button6 = new Button();
        button6.setText("-");
        button6.setOnAction(this);

        button7 = new Button();
        button7.setText("-");
        button7.setOnAction(this);

        button8 = new Button();
        button8.setText("-");
        button8.setOnAction(this);

        button9 = new Button();
        button9.setText("-");
        button9.setOnAction(this);

        button10 = new Button();
        button10.setText("-");
        button10.setOnAction(this);

        button11 = new Button();
        button11.setText("-");
        button11.setOnAction(this);

        button12 = new Button();
        button12.setText("-");
        button12.setOnAction(this);

        button13 = new Button();
        button13.setText("-");
        button13.setOnAction(this);

        button14 = new Button();
        button14.setText("-");
        button14.setOnAction(this);

        button15 = new Button();
        button15.setText("-");
        button15.setOnAction(this);

        button16 = new Button();
        button16.setText("-");
        button16.setOnAction(this);

        button17 = new Button();
        button17.setText("-");
        button17.setOnAction(this);

        button18 = new Button();
        button18.setText("-");
        button18.setOnAction(this);

        button19 = new Button();
        button19.setText("-");
        button19.setOnAction(this);

        button20 = new Button();
        button20.setText("-");
        button20.setOnAction(this);

        button21 = new Button();
        button21.setText("-");
        button21.setOnAction(this);

        button22 = new Button();
        button22.setText("-");
        button22.setOnAction(this);

        button23 = new Button();
        button23.setText("-");
        button23.setOnAction(this);

        button24 = new Button();
        button24.setText("-");
        button24.setOnAction(this);

        button25 = new Button();
        button25.setText("-");
        button25.setOnAction(this);

        turnLabel = new Label();
        turnLabel.setText("X's Move");


        Pane layout = new Pane();
        layout.getChildren().add(button1);
        button1.setLayoutX(c1);
        button1.setLayoutY(r1);
        layout.getChildren().add(button2);
        button2.setLayoutX(c2);
        button2.setLayoutY(r1);
        layout.getChildren().add(button3);
        button3.setLayoutX(c3);
        button3.setLayoutY(r1);
        layout.getChildren().add(button4);
        button4.setLayoutX(c4);
        button4.setLayoutY(r1);
        layout.getChildren().add(button5);
        button5.setLayoutX(c5);
        button5.setLayoutY(r1);
        layout.getChildren().add(button6);
        button6.setLayoutX(c1);
        button6.setLayoutY(r2);
        layout.getChildren().add(button7);
        button7.setLayoutX(c2);
        button7.setLayoutY(r2);
        layout.getChildren().add(button8);
        button8.setLayoutX(c3);
        button8.setLayoutY(r2);
        layout.getChildren().add(button9);
        button9.setLayoutX(c4);
        button9.setLayoutY(r2);
        layout.getChildren().add(button10);
        button10.setLayoutX(c5);
        button10.setLayoutY(r2);
        layout.getChildren().add(button11);
        button11.setLayoutX(c1);
        button11.setLayoutY(r3);
        layout.getChildren().add(button12);
        button12.setLayoutX(c2);
        button12.setLayoutY(r3);
        layout.getChildren().add(button13);
        button13.setLayoutX(c3);
        button13.setLayoutY(r3);
        layout.getChildren().add(button14);
        button14.setLayoutX(c4);
        button14.setLayoutY(r3);
        layout.getChildren().add(button15);
        button15.setLayoutX(c5);
        button15.setLayoutY(r3);
        layout.getChildren().add(button16);
        button16.setLayoutX(c1);
        button16.setLayoutY(r4);
        layout.getChildren().add(button17);
        button17.setLayoutX(c2);
        button17.setLayoutY(r4);
        layout.getChildren().add(button18);
        button18.setLayoutX(c3);
        button18.setLayoutY(r4);
        layout.getChildren().add(button19);
        button19.setLayoutX(c4);
        button19.setLayoutY(r4);
        layout.getChildren().add(button20);
        button20.setLayoutX(c5);
        button20.setLayoutY(r4);
        layout.getChildren().add(button21);
        button21.setLayoutX(c1);
        button21.setLayoutY(r5);
        layout.getChildren().add(button22);
        button22.setLayoutX(c2);
        button22.setLayoutY(r5);
        layout.getChildren().add(button23);
        button23.setLayoutX(c3);
        button23.setLayoutY(r5);
        layout.getChildren().add(button24);
        button24.setLayoutX(c4);
        button24.setLayoutY(r5);
        layout.getChildren().add(button25);
        button25.setLayoutX(c5);
        button25.setLayoutY(r5);
    
        layout.getChildren().add(turnLabel);
        turnLabel.setLayoutX(125);
        turnLabel.setLayoutY(230);

        Scene scene = new Scene(layout, 300, 250);
        primeStage.setScene(scene);
        primeStage.show();

        
    }
    @Override
    public void handle(ActionEvent click) {
       if (click.getSource() == button1 && isXturn) {
        button1.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button1 && !isXturn) {
        button1.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button2 && isXturn) {
        button2.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button2 && !isXturn) {
        button2.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button3 && isXturn) {
        button3.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button3 && !isXturn) {
        button3.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button4 && isXturn) {
        button4.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button4 && !isXturn) {
        button4.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button5 && isXturn) {
        button5.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button5 && !isXturn) {
        button5.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button6 && isXturn) {
        button6.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button6 && !isXturn) {
        button6.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button7 && isXturn) {
        button7.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button7 && !isXturn) {
        button7.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button8 && isXturn) {
        button8.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button8 && !isXturn) {
        button8.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button9 && isXturn) {
        button9.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button9 && !isXturn) {
        button9.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button10 && isXturn) {
        button10.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button10 && !isXturn) {
        button10.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button11 && isXturn) {
        button11.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button11 && !isXturn) {
        button11.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button12 && isXturn) {
        button12.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button12 && !isXturn) {
        button12.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button13 && isXturn) {
        button13.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button13 && !isXturn) {
        button13.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button14 && isXturn) {
        button14.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button14 && !isXturn) {
        button14.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button15 && isXturn) {
        button15.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button15 && !isXturn) {
        button15.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button16 && isXturn) {
        button16.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button16 && !isXturn) {
        button16.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button17 && isXturn) {
        button17.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button17 && !isXturn) {
        button17.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button18 && isXturn) {
        button18.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button18 && !isXturn) {
        button18.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button19 && isXturn) {
        button19.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button19 && !isXturn) {
        button19.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button20 && isXturn) {
        button20.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button20 && !isXturn) {
        button20.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button21 && isXturn) {
        button21.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button21 && !isXturn) {
        button21.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button22 && isXturn) {
        button22.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button22 && !isXturn) {
        button22.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button23 && isXturn) {
        button23.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button23 && !isXturn) {
        button23.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button24 && isXturn) {
        button24.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button24 && !isXturn) {
        button24.setText("O");
        turnLabel.setText("X's Move");
       }
       if (click.getSource() == button25 && isXturn) {
        button25.setText("X");
        turnLabel.setText("O's Move");
       }
       if (click.getSource() == button25 && !isXturn) {
        button25.setText("O");
        turnLabel.setText("X's Move");
       }
       turns++;
       checkWinner(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, turnLabel);
       isXturn = !isXturn;
       
    } 
    Boolean checkWinner(Button inpButton1, Button inpButton2, Button inpButton3,
    Button inpButton4, Button inpButton5, Button inpButton6, Button inpButton7, Button inpButton8, Button inpButton9,
    Button inpButton10, Button inpButton11, Button inpButton12, Button inpButton13, Button inpButton14, Button inpButton15,
    Button inpButton16, Button inpButton17, Button inpButton18, Button inpButton19,
    Button inpButton20, Button inpButton21, Button inpButton22, Button inpButton23, Button inpButton24, Button inpButton25, Label inpLabel) {
        boolean XisWinner = false;
        boolean OisWinner = false;
        if (inpButton1.getText().equals("X") && inpButton6.getText().equals("X") && inpButton11.getText().equals("X") && inpButton16.getText().equals("X") && inpButton21.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton1.getText().equals("O") && inpButton6.getText().equals("O") && inpButton11.getText().equals("O") && inpButton16.getText().equals("O") && inpButton21.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton2.getText().equals("X") && inpButton7.getText().equals("X") && inpButton12.getText().equals("X") && inpButton17.getText().equals("X") && inpButton22.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton2.getText().equals("O") && inpButton7.getText().equals("O") && inpButton12.getText().equals("O") && inpButton17.getText().equals("O") && inpButton22.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton3.getText().equals("X") && inpButton8.getText().equals("X") && inpButton13.getText().equals("X") && inpButton18.getText().equals("X") && inpButton23.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton3.getText().equals("O") && inpButton8.getText().equals("O") && inpButton13.getText().equals("O") && inpButton18.getText().equals("O") && inpButton23.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton4.getText().equals("X") && inpButton9.getText().equals("X") && inpButton14.getText().equals("X") && inpButton19.getText().equals("X") && inpButton24.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton4.getText().equals("O") && inpButton9.getText().equals("O") && inpButton14.getText().equals("O") && inpButton19.getText().equals("O") && inpButton24.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton5.getText().equals("X") && inpButton10.getText().equals("X") && inpButton15.getText().equals("X") && inpButton20.getText().equals("X") && inpButton25.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton5.getText().equals("O") && inpButton10.getText().equals("O") && inpButton15.getText().equals("O") && inpButton20.getText().equals("O") && inpButton25.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        ///rows
        if (inpButton1.getText().equals("X") && inpButton2.getText().equals("X") && inpButton3.getText().equals("X") && inpButton4.getText().equals("X") && inpButton5.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton1.getText().equals("O") && inpButton2.getText().equals("O") && inpButton3.getText().equals("O") && inpButton4.getText().equals("O") && inpButton5.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton6.getText().equals("X") && inpButton7.getText().equals("X") && inpButton8.getText().equals("X") && inpButton9.getText().equals("X") && inpButton10.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton6.getText().equals("O") && inpButton7.getText().equals("O") && inpButton8.getText().equals("O") && inpButton9.getText().equals("O") && inpButton10.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton11.getText().equals("X") && inpButton12.getText().equals("X") && inpButton13.getText().equals("X") && inpButton14.getText().equals("X") && inpButton15.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton11.getText().equals("O") && inpButton12.getText().equals("O") && inpButton13.getText().equals("O") && inpButton14.getText().equals("O") && inpButton15.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton16.getText().equals("X") && inpButton17.getText().equals("X") && inpButton18.getText().equals("X") && inpButton19.getText().equals("X") && inpButton20.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton16.getText().equals("O") && inpButton17.getText().equals("O") && inpButton18.getText().equals("O") && inpButton19.getText().equals("O") && inpButton20.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        if (inpButton21.getText().equals("X") && inpButton22.getText().equals("X") && inpButton23.getText().equals("X") && inpButton24.getText().equals("X") && inpButton25.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton21.getText().equals("O") && inpButton22.getText().equals("O") && inpButton23.getText().equals("O") && inpButton24.getText().equals("O") && inpButton25.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        }
        // diagonals
        if (inpButton1.getText().equals("X") && inpButton7.getText().equals("X") && inpButton13.getText().equals("X") && inpButton19.getText().equals("X") && inpButton25.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton1.getText().equals("O") && inpButton7.getText().equals("O") && inpButton13.getText().equals("O") && inpButton19.getText().equals("O") && inpButton25.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        } 
        if (inpButton5.getText().equals("X") && inpButton9.getText().equals("X") && inpButton13.getText().equals("X") && inpButton17.getText().equals("X") && inpButton21.getText().equals("X")) {
            System.out.println("W!!!");
            inpLabel.setText("X wins!");
        }
        if (inpButton5.getText().equals("O") && inpButton9.getText().equals("O") && inpButton13.getText().equals("O") && inpButton17.getText().equals("O") && inpButton21.getText().equals("O")) {
            System.out.println("W!!!");
            inpLabel.setText("O wins!");
        } 
        if (turns >= 25) {
            inpLabel.setText("Tie Game!");
        }


        return XisWinner;

    }
}