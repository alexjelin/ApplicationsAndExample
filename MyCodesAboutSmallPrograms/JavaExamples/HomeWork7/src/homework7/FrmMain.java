package homework7;

import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrmMain extends JFrame {

    private Transferable[] arrAccounts = new Transferable[50];
    private ObjectOutputStream output;
    private BankUI creditUI;
    private BankUI savingUI;
    private JButton btnSave1;
    private JButton btnSave2;
    private JButton btnFile;

    public FrmMain() {
        String[] text1 = {"Acc No", "Balance", "Trans No.", "Transfer"};
        String text2[] = {"Acc No", "Balance", "Interest", "Transfer"};
        BankUI obj1 = new BankUI(text2);
        BankUI obj2 = new BankUI(text1);
        obj1.add(this);
        obj2.add(this);
        
        btnSave1=creditUI.getButtonOne();
        btnSave2=savingUI.getButtonOne();
        
        btnFile.setText("To file");
        btnFile.addActionListener(
                p
                );
    }
}
