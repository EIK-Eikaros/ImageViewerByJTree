package project;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class FileWrapperDeluxe {

    static boolean c = true;

    public static void main(final String[] args) {
        final JFrame f = new JFrame("File Browser");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1500, 1000);
        final File file = new File("Data");//Select your path.
        final MyFile mf = new MyFile(file);
        final TreeModel model = new FileTreeModel(mf);
        final JTree tree = new JTree(model);
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                TreePath treePath = e.getPath();
                String print = treePath.toString().replace("[", "").replace("]", "").replace(" ", "");
                String[] j = print.split(",");
                String path = "";
                for (int i = 0; i < j.length; i++) {
                    path += j[i];
                    if (i != j.length - 1) {
                        path += "/";
                    }
                }
                String k = j[j.length - 1];
                if (k.charAt(k.length() - 1) == 'g' && k.charAt(k.length() - 2) == 'p' && k.charAt(k.length() - 3) == 'j') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                } else if (k.charAt(k.length() - 1) == 'g' && k.charAt(k.length() - 2) == 'e' && k.charAt(k.length() - 3) == 'p' && k.charAt(k.length() - 4) == 'j') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                } else if (k.charAt(k.length() - 1) == 'f' && k.charAt(k.length() - 2) == 'i' && k.charAt(k.length() - 3) == 'g') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                } else if (k.charAt(k.length() - 1) == 'f' && k.charAt(k.length() - 2) == 'f' && k.charAt(k.length() - 3) == 'i' && k.charAt(k.length() - 3) == 't') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                } else if (k.charAt(k.length() - 1) == 'd' && k.charAt(k.length() - 2) == 's' && k.charAt(k.length() - 3) == 'p') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                } else if (k.charAt(k.length() - 1) == 'g' && k.charAt(k.length() - 2) == 'n' && k.charAt(k.length() - 3) == 'p') {
                    Showpic.pic = path;
                    if (c) {
                        Showpic.draw.start();
                        c = false;
                    }
                }
            }
        });
        tree.setShowsRootHandles(true);
        tree.setEditable(false);
        final Showpic pi = new Showpic();
        JScrollPane sc = new JScrollPane(tree);
        sc.setBounds(0, 0, 400, 1000);
        f.add(sc);
        f.add(pi);
        f.setVisible(true);
    }
}
