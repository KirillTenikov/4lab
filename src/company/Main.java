package company;

import com.ericsson.otp.erlang.*;


public class Main {


    public static void main(String[] args) throws Exception {
        System.setProperty("OtpConnection.trace", "0");
        OtpNode javaNode = new OtpNode("pidSorting@192.168.2.19");
        OtpNode receiveNode = new OtpNode("pidDelivery@192.168.2.19" );
        if (javaNode.ping("pidSorting@192.168.2.19", 10000) && javaNode.ping("pidDelivery@192.168.2.19", 10000)
                && receiveNode.ping("pidSorting@192.168.2.19", 10000) && receiveNode.ping("pidDelivery@192.168.2.19", 10000)) {
            new MainForm(javaNode, receiveNode);
        }

    }
}
