import java.awt.*;
import java.awt.event.*;

public class TicTac implements ActionListener,WindowListener {
    int count=0;
    String letter;
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,set,fls,result;
    Panel p;
    public TicTac(){
        f=new Frame("Tik Tac Toe");
        f.setSize(400, 600);
        f.setBackground(Color.CYAN);
        f.setVisible(true);

        b1=new Button();
        b1.setBounds(50,50,100,100);
        b1.addActionListener(this);

        b2=new Button();
        b2.setBounds(150, 50, 100, 100);
        b2.addActionListener(this);

        b3=new Button();
        b3.setBounds(250, 50, 100, 100);
        b3.addActionListener(this);

        b4=new Button();
        b4.setBounds(50,150,100,100);
        b4.addActionListener(this);

        b5=new Button();
        b5.setBounds(150, 150, 100, 100);
        b5.addActionListener(this);

        b6=new Button();
        b6.setBounds(250, 150, 100, 100);
        b6.addActionListener(this);

        b7=new Button();
        b7.setBounds(50, 250, 100, 100);
        b7.addActionListener(this);

        b8=new Button();
        b8.setBounds(150, 250, 100, 100);
        b8.addActionListener(this);

        b9=new Button();
        b9.setBounds(250, 250, 100, 100);
        b9.addActionListener(this);

        set=new Button("Reset");
        set.setBounds(150, 350, 100, 50);
        set.addActionListener(this);

        fls=new Button();
        fls.setBounds(350, 270, 150, 50);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(set);
        f.add(fls);

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        set.setBackground(Color.WHITE);

        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        
         
    }
    
    
    public void actionPerformrd(ActionEvent e){
        count++;
        if(count==1||count==3|| count==5||count==7||count==9){
            letter="X";
        }
        if(count==2||count==4||count==6||count==8){
            letter="O";
        }

        if(e.getSource()==b1){
            b1.setBackground(Color.blue);
            b1.setEnabled(true);
            b1.setLabel(letter);
            b1.setEnabled(false);
            b1.setForeground(Color.black);
        }
        if(e.getSource()==b2){
            b2.setLabel(letter);
            b2.setEnabled(false);
            b2.setBackground(Color.black);
        }
        if(e.getSource()==b3){
            b3.setLabel(letter);
            b3.setEnabled(false);
            b3.setBackground(Color.black);
        }
        if(e.getSource()==b4){
            b4.setLabel(letter);
            b4.setEnabled(false);
            b4.setBackground(Color.black);
        }
        if(e.getSource()==b5){
            b5.setLabel(letter);
            b5.setEnabled(false);
            b5.setBackground(Color.black);
        }
        if(e.getSource()==b6){
            b6.setLabel(letter);
            b6.setEnabled(false);
            b6.setBackground(Color.black);
        }
        if(e.getSource()==b7){
            b7.setLabel(letter);
            b7.setEnabled(false);
            b7.setBackground(Color.black);
        }
        if(e.getSource()==b8){
            b8.setLabel(letter);
            b8.setEnabled(false);
            b8.setBackground(Color.black);
        }
        if(e.getSource()==b9){
            b9.setLabel(letter);
            b9.setEnabled(false);
            b9.setBackground(Color.black);
        }
        if(e.getSource()==set){
            b1.setEnabled(true);
            b1.setBackground(Color.pink);
            set.setEnabled(false);
            b1.setBackground(Color.black);
        }
        if(b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b1.getLabel()!="" && b2.getLabel()!="" && b3.getLabel()!=""){
            result=new Button(b1.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);

            b1.setBackground(Color.green);
            b2.setBackground(Color.green);
            b3.setBackground(Color.green);


        }
        else if(b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b4.getLabel()!="" && b5.getLabel()!="" && b6.getLabel()!=""){
            result=new Button(b4.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b4.setBackground(Color.green);
            b5.setBackground(Color.green);
            b6.setBackground(Color.green);
        }
        else if(b7.getLabel()==b8.getLabel() && b8.getLabel()==b9.getLabel() && b7.getLabel()!="" && b8.getLabel()!="" && b9.getLabel()!=""){
            result=new Button(b7.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b7.setBackground(Color.green);
            b8.setBackground(Color.green);
            b9.setBackground(Color.green);
        }
        else if(b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b1.getLabel()!="" && b4.getLabel()!="" && b7.getLabel()!=""){
            result=new Button(b1.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b1.setBackground(Color.green);
            b4.setBackground(Color.green);
            b7.setBackground(Color.green);
        }
        else if(b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b2.getLabel()!="" && b5.getLabel()!="" && b8.getLabel()!=""){
            result=new Button(b2.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b2.setBackground(Color.green);
            b5.setBackground(Color.green);
            b8.setBackground(Color.green);
        }
        else if(b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b3.getLabel()!="" && b6.getLabel()!="" && b9.getLabel()!=""){
            result=new Button(b3.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b3.setBackground(Color.green);
            b6.setBackground(Color.green);
            b9.setBackground(Color.green);
        }
        else if(b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b1.getLabel()!="" && b5.getLabel()!="" && b9.getLabel()!=""){
            result=new Button(b1.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b1.setBackground(Color.green);
            b5.setBackground(Color.green);
            b9.setBackground(Color.green);
        }   
        else if(b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b3.getLabel()!="" && b5.getLabel()!="" && b7.getLabel()!=""){
            result=new Button(b3.getLabel()+"  is win!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
            b3.setBackground(Color.green);
            b5.setBackground(Color.green);
            b7.setBackground(Color.green);
        }
        else if(b1.getLabel()!="" && b2.getLabel()!="" && b3.getLabel()!="" && b4.getLabel()!="" && b5.getLabel()!="" && b6.getLabel()!="" && b7.getLabel()!="" && b8.getLabel()!="" && b9.getLabel()!=""){
            result=new Button("Draw!");
            result.setBounds(50,440,300,50);
            result.setVisible(true);
            f.add(result);
        }

    }
    
    public static void main(String[] args) {
        TicTac t=new TicTac();
    }


    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }


    
}