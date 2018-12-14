package javaprog;

import java.awt.*;
import java.awt.event.*;

public class menudemo  {
    public static void main(String[] args) {
    MenuFrame f= new MenuFrame("MenuDemo");
    f.setSize(300, 200);
    f.setVisible(true);
    }
}

class MenuFrame extends Frame {

    String msg = " ";
    CheckboxMenuItem debug;
    Label lf;

    public MenuFrame(String title) {
        super(title);
        setLayout(new BorderLayout());
        lf=new Label();
        add(lf,BorderLayout.SOUTH);
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu file = new Menu("file");
        MenuItem item1;
        file.add(item1 = new MenuItem("New..."));
        debug = new CheckboxMenuItem("Debug");
        file.add(debug);
        mbar.add(file);
        MyHandler handler = new MyHandler(this);
        item1.addActionListener(handler);
        debug.addItemListener(handler);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
}

class MyWindowAdapter extends WindowAdapter {

    MenuFrame menuframe;

    public MyWindowAdapter(MenuFrame mf) {
        this.menuframe = mf;
    }

    public void windowClosing(WindowEvent we) {
        menuframe.setVisible(false);
    }
}

class MyHandler implements ActionListener, ItemListener {

    MenuFrame menuframe;

    public MyHandler(MenuFrame mf) {
        this.menuframe = mf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "You selected ";
        String arg = (String) e.getActionCommand();
        if (arg.equals("New...")) {
            msg += "New.";
        }
        menuframe.msg=msg;
        menuframe.lf.setText(msg);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(menuframe.debug.getState())
           menuframe.lf.setText("Debug is On");
        else menuframe.lf.setText("Debug is Off");
    }

}
