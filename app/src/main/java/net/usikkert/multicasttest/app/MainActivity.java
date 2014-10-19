package net.usikkert.multicasttest.app;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            final MulticastSocket multicastSocket = new MulticastSocket(25000);
            final InetAddress inetAddress = InetAddress.getByName("224.168.5.200");

            multicastSocket.joinGroup(inetAddress); // Lock here
        }

        catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }
}
