package Modul1;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;
import java.io.IOException;
public class tugasno2prak {

    public static void main(String[] args) throws UnknownHostException, IOException {
        String[] options = {"HOST", "IP"};
        int a = JOptionPane.showOptionDialog(null, "Silahkan Pilih",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(a==0){String host=JOptionPane.showInputDialog(null, "Masukkan Host Address");
            System.out.println("Host: "+
                    InetAddress.getByName(host));
            System.out.println("\n# Check Connection");
            InetAddress ia = InetAddress.getByName(host);
            if(ia.isReachable(3000)){
                System.out.println(ia+" is Reachable");
            }else{
                System.out.println(ia+" is unReachable");
            }

    }else{
            String ip=JOptionPane.showInputDialog(null, "Masukkan IP Address");
            System.out.println("IP: "+
                    InetAddress.getByName(ip));
            System.out.println("\n# Check Connection");
            InetAddress ia = InetAddress.getByName(ip);
            if(ia.isReachable(3000)){
                System.out.println(ia+" is Reachable");
            }else{
                System.out.println(ia+" is unReachable");
            }
        }
    
}
}
