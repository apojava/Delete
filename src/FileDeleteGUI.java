import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

/**
 * @author shystart
 * @create 2021-04-12 下午 15:29
 */
public class FileDeleteGUI {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("批量删除指定后缀的文件");


        JPanel jPanel = new JPanel();

        JLabel jLabel1 = new JLabel("请输入你遍历的文件夹路径：");
        JLabel jLabel2 = new JLabel("请输入你要删除的文件的后缀：");

        JTextField jTextField1 = new JTextField(28);
        jTextField1.setFont(new Font("仿宋",Font.BOLD,16));
        JTextField jTextField2 = new JTextField(28);
        jTextField2.setFont(new Font("仿宋",Font.BOLD,16));



        JButton jButton = new JButton("删除");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = jTextField1.getText();
                String end = jTextField2.getText();
                System.out.println(path);
                System.out.println(end);
                FileDelete.Delete(new File(path),end);
            }
        });

        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        jPanel.add(jLabel2);
        jPanel.add(jTextField2);
        jPanel.add(jButton);
        jFrame.add(jPanel);

        jFrame.setBounds(600,200,500,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }



}
