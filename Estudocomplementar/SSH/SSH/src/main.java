import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class main {

	public static void main(String[] args) throws JSchException, IOException {
		// TODO Auto-generated method stub
		String command = "ls -l\n";
		JSch jsch = new JSch();
		int port = 22;
		String host = "192.168.1.101";
		String username = "root";
		Session session = jsch.getSession(username, host, port);

		Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");

		session.setConfig(config);

		session.setPassword("trinite2014");

		/*
		 * InputStream input = channel.getInputStream(); OutputStream output =
		 * channel.getOutputStream();
		 * 
		 * PrintStream out = new PrintStream(output);
		 * 
		 * ((ChannelExec) channel).setCommand("ls -l\n");
		 */
		/*
		 * byte[] tmp = new byte[1024]; while (input.available() > 0) { int i =
		 * input.read(tmp, 0, 1024); if (i < 0) break;
		 * 
		 * System.out.println("msg" + new String(tmp, 0, i)); }
		 */
		session.setConfig("StrictHostKeyChecking", "no");

		session.connect(10 * 1000);

		Channel channel = session.openChannel("shell");

		/*InputStream is = new ByteArrayInputStream(command.getBytes());
		channel.setInputStream(is);
		*/        
		
		try {
            InputStream is = channel.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringWriter  out = new StringWriter();

            String line;
            while ((line = in.readLine()) != null || !channel.isClosed()) {
                if (line != null) {
                    out.write(line + '\n');
                    out.flush();
                }
            }
            in.close();
            is.close();
        } catch (IOException ex) {
        } finally {
        }
	}

	}
