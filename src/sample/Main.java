package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class Main extends Application {
    Client bal = new Client();
    int i = 0;
    int count =  0;
    int j =0;
    String trans[]= new  String [5];
    String operation[]= new String[100];

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {


        Stage secondaryStage = new Stage();
        Stage thirdStage = new Stage();
        Stage forthStage = new Stage();
        Stage fifthStage = new Stage();

        PasswordField kk = new PasswordField();
        TextField amount = new TextField();
        TextField amount2 = new TextField();


        Label x = new Label("Enter the password ");
        Label yy = new Label();
        Label wrongAmount = new Label();
        Label showbal = new Label();
        Label tittle = new Label("Your current balance is : ");
        Label wrong = new Label();
        Label check = new Label();
        Label tran = new Label();

        Button enter = new Button(" Enter ");
        enter.setOnAction(event -> {
            if (kk.getText().equals(String.valueOf(5490))) {
                secondaryStage.show();

            } else {
                yy.setText("wrong password!");
                yy.setStyle("-fx-text-fill: red ; -fx-font-size: 16px;");
                yy.getText();
            }
        });
        Button withdraw = new Button("Withdraw");
        withdraw.setOnAction(event -> {
            fifthStage.show();
        });
        Button deposit = new Button("Deposit");
        deposit.setOnAction(event -> {
            thirdStage.show();


        });

        Button[] bt = new Button[10];
        for (int i = 0; i < 10; i++) {
            bt[i] = new Button(String.valueOf(i));
        }


        bt[0].setOnAction(event -> {
            amount.setText(amount.getText() + 0);
        });
        bt[1].setOnAction(event -> {
            amount.setText(amount.getText() + 1);
        });
        bt[2].setOnAction(event -> {
            amount.setText(amount.getText() +2);
        });
        bt[3].setOnAction(event -> {
            amount.setText(amount.getText() + 3);
        });
        bt[4].setOnAction(event -> {
            amount.setText(amount.getText() +4);
        });
        bt[5].setOnAction(event -> {
            amount.setText(amount.getText() +5);
        });
        bt[6].setOnAction(event -> {
            amount.setText(amount.getText() +6);
        });
        bt[7].setOnAction(event -> {
            amount.setText(amount.getText() +7);
        });
        bt[8].setOnAction(event -> {
            amount.setText(amount.getText() +8);
        });
        bt[9].setOnAction(event -> {
            amount.setText(amount.getText() + 9);
        });

        Button[] num = new Button[10];
        for (int i = 0; i < 10; i++) {
            num[i] = new Button(String.valueOf(i));
        }


        num[0].setOnAction(event -> {
            amount2.setText(amount2.getText() + 0);
        });
        num[1].setOnAction(event -> {
            amount2.setText(amount2.getText() + 1);
        });
        num[2].setOnAction(event -> {
            amount2.setText(amount2.getText() + 2);
        });
        num[3].setOnAction(event -> {
            amount2.setText(amount2.getText() + 3);
        });
        num[4].setOnAction(event -> {
            amount2.setText(amount2.getText() + 4);
        });
        num[5].setOnAction(event -> {
            amount2.setText(amount2.getText() + 5);
        });
        num[6].setOnAction(event -> {
            amount2.setText(amount2.getText() + 6);
        });
        num[7].setOnAction(event -> {
            amount2.setText(amount2.getText() + 7);
        });
        num[8].setOnAction(event -> {
            amount2.setText(amount2.getText() + 8);
        });
        num[9].setOnAction(event -> {
            amount2.setText(amount2.getText() + 9);
        });


        Button enter2 = new Button("Enter");
        enter2.setOnAction(event -> {if(amount!=null) {
            bal.setBalance((bal.getBalance() + Integer.parseInt(amount.getText())));
            check.setText("Operation ended! ");
            check.setStyle("-fx-text-fill: blue ; -fx-font-size: 16px;");
            showbal.setText(String.valueOf(bal.getBalance()));
            trans[i++] = amount.getText();
            operation[j++] = "Deposit:";
            count++;
            forthStage.show();
            amount.clear();
        }
        });
        Button enterw = new Button("Enter");
        enterw.setOnAction(event -> {if(amount2!=null){
            if ((Integer.parseInt(amount2.getText()) > bal.getBalance()) || (Integer.parseInt(amount2.getText()) < 0)) {
                wrong.setText("INVAILED OPERATION! ");
                wrong.setStyle("-fx-text-fill: red ; -fx-font-size: 16px;");
                wrong.getText();
                System.out.println(bal.getBalance());
            } else {
                bal.setBalance((bal.getBalance() - Integer.parseInt(amount2.getText())));
                check.setText(" Operation ended! ");
                check.setStyle("-fx-text-fill: blue ; -fx-font-size: 16px;");
                showbal.setText(String.valueOf(bal.getBalance()));
                trans[i++]=amount2.getText();
                operation[j++]="Withdraw :";
                count++;
                forthStage.show();
                amount2.clear();

            }}
        });
        Button next = new Button("next->");
        next.setOnAction(event -> {if (i<count&&j<count) {
            tran.setText(operation[++j]+trans[++i]);
            tran.getText();

        }

        });
        Button prev = new Button("<-previous");
        prev.setOnAction(event -> {if(i>0&&j>0) {


            tran.setText(operation[--j]+trans[--i]);
            tran.getText();
        }
        });

        Button showBalance = new Button("Show Balance ");
        showBalance.setOnAction(event -> {
            forthStage.show();


            showbal.setText(String.valueOf(bal.getBalance()));
            trans[i++]=showbal.getText();
            operation[j++]=" Balance query  :";
            count++;


        });
        Button close1 = new Button("esc");
        close1.setOnAction(event -> {
            primaryStage.close();

        });
        Button close2 = new Button("esc");
        close2.setOnAction(event -> {
            secondaryStage.close();
        });
        Button close3 = new Button("esc");
        close3.setOnAction(event -> {
            thirdStage.close();
        });
        Button close4 = new Button("esc");
        close4.setOnAction(event -> {
            forthStage.close();
        });
        Button close5 = new Button("esc");
        close5.setOnAction(event -> {
            fifthStage.close();
        });

        GridPane kimo = new GridPane();
        kimo.add(x, 2, 1);
        kimo.add(enter, 2, 3);
        kimo.add(kk, 2, 2);
        kimo.add(yy, 2, 4);
        kimo.add(close1, 3, 3);
        kimo.setStyle("-fx-background-color: pink  ");

        GridPane kimo2 = new GridPane();
        kimo2.add(withdraw, 1, 1);
        kimo2.add(deposit, 1, 2);
        kimo2.add(showBalance, 1, 3);
        kimo2.add(wrongAmount, 2, 1);
        kimo2.add(close2, 1, 15);
        kimo2.add(next, 1, 5);
        kimo2.add(prev, 1, 6);
        kimo2.add(tran, 1, 7);
        kimo2.setStyle("-fx-background-color: pink ");

        VBox kimo3 = new VBox();
        kimo3.getChildren().addAll(bt[1], bt[4], bt[7]);
        VBox kimo4 = new VBox();
        kimo4.getChildren().addAll(bt[2], bt[5], bt[8], bt[0]);
        VBox kimo5 = new VBox();
        kimo5.getChildren().addAll(bt[3], bt[6], bt[9], enter2);
        HBox kimo7 = new HBox();
        kimo7.getChildren().addAll(kimo3, kimo4, kimo5);
        VBox kimo6 = new VBox();
        kimo6.getChildren().addAll(amount, kimo7, close3);
        kimo6.setStyle("-fx-background-color: pink ");


        GridPane kimo8 = new GridPane();
        kimo8.setStyle("-fx-background-color: pink ");

        kimo8.add(tittle, 2, 1);
        kimo8.add(showbal, 2, 2);
        kimo8.add(check, 2, 3);
        kimo8.add(close4, 2, 4);

        VBox kimo9 = new VBox();
        kimo9.getChildren().addAll(num[1], num[4], num[7]);
        VBox kimo10 = new VBox();
        kimo10.getChildren().addAll(num[2], num[5], num[8], num[0]);
        VBox kimo11 = new VBox();
        kimo11.getChildren().addAll(num[3], num[6], num[9], enterw);
        HBox kimo12 = new HBox();
        kimo12.getChildren().addAll(kimo9, kimo10, kimo11);

        VBox kimo13 = new VBox();
        kimo13.getChildren().addAll(amount2, kimo12, wrong,close5 );
        kimo13.setStyle("-fx-background-color: pink ");


        Scene[] scene = new Scene[5];
        scene[0] = new Scene(kimo, 500, 250);
        scene[1] = new Scene(kimo2, 400, 200);
        scene[2] = new Scene(kimo6, 500, 250);
        scene[3] = new Scene(kimo8, 300, 150);
        scene[4] = new Scene(kimo13, 500, 250);

        primaryStage.setTitle(" Atm ");
        primaryStage.setScene(scene[0]);
        primaryStage.show();
        secondaryStage.setTitle(" Atm ");
        secondaryStage.setScene(scene[1]);
        thirdStage.setTitle(" Atm Deposit ");
        thirdStage.setScene(scene[2]);
        forthStage.setTitle(" Atm ");
        forthStage.setScene(scene[3]);
        fifthStage.setTitle(" Atm Withdraw ");
        fifthStage.setScene(scene[4]);

    }
}
