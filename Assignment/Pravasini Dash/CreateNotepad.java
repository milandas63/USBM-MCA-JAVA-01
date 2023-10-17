import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CreateNotepad
{
    public CreateNotepad() {
        JFrame f = new JFrame("Notepad File System");
        JMenuBar mbr = new JMenuBar();
        f.setJMenuBar(mbr);
        JMenu file = new JMenu("File");
        file.setMnemonic('F');
        mbr.add(file);
        JMenuItem fileNew = new JMenuItem("New");
        file.add(fileNew);
        file.addSeparator();
        JMenuItem fileWindow = new JMenuItem("New Window");
        file.add(fileWindow);
        file.addSeparator();
        JMenuItem fileOpen = new JMenuItem("Open");
        file.add(fileOpen);
        file.addSeparator();
        JMenuItem fileSave = new JMenuItem("Save");
        file.setMnemonic('S');
        fileSave.add(fileSave);
        file.addSeparator();
        JMenuItem fileSaveAs = new JMenuItem("SaveAs");
        file.add(fileSaveAs);
        file.addSeparator();
        JMenuItem filePageSetup = new JMenuItem("Page setup");
        filePageSetup.add(filePageSetup);
        file.addSeparator();
        JMenuItem filePrint = new JMenuItem("Print");
        file.add(filePrint);
        file.addSeparator();
        JMenuItem fileExit = new JMenuItem("Exit Page");
        file.add(fileExit);
        file.addSeparator();
        JMenu edit = new JMenu("Edit");
        mbr.add(edit);
        JMenuItem editCrop = new JMenuItem("Crop");
        edit.add(editCrop);
        edit.addSeparator();
        JMenuItem editPaste = new JMenuItem("Paste");
        edit.add(editPaste);
        edit.addSeparator();
        JMenuItem editCopy = new JMenuItem("Copy");
        edit.add(editCopy);
        edit.addSeparator();
        JMenuItem editCut = new JMenuItem("Cut");
        edit.add(editCut);
        edit.addSeparator();
        JMenuItem editDelete = new JMenuItem("Delete");
        edit.add(editDelete);
        edit.addSeparator();
        JMenuItem editSelectAll = new JMenuItem("SelectAll");
        edit.add(editSelectAll);
        edit.addSeparator();
        JMenuItem editGoto = new JMenuItem("Goto");
        edit.add(editGoto);
        edit.addSeparator();
        JMenuItem editReplace = new JMenuItem("Replace");
        edit.add(editReplace);
        edit.addSeparator();
        JMenu view = new JMenu("View");
        mbr.add(view);
        JMenuItem viewStatusBar=new JMenuItem();
        view.add(viewStatusBar);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(370, 150, 600, 350);
        f.setVisible(true);
    }
    public static void main(String[]args)
    {
        new CreateNotepad();
    }


}

