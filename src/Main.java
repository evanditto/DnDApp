import Campaign.Campaign;
//import Server.ServerGUI;
import Server.ServerLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Main class that will be used to launch the program.
 */
public class Main {

    //fields
    static FileWriter serverLogger;

    /**
     * main method that launches the program
     * @param args Run as server or client
     */
    public static void main(String[] args) {

        //local vars
        int port = 0;

        //Start a logger
        try {
            serverLogger = new FileWriter(new File(System.getProperty("user.dir" + "\\serverFiles\\Logs" + "\\" +  LocalDateTime.now())));
        } catch (IOException e) {
            System.err.println("ServerMain: Failed to initilize the logger");
            System.exit(1);
        }
        /*
        finally {
            try {
                serverLogger.close();
            } catch (IOException e) {
                System.err.println("ServerMain: Failed to close serverLogger");
            }
        }
        */
        try {
            serverLogger.write("ServerLoggerStarted\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(args.length != 0){
            //run server
            try{
                port = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nonInt){
                System.out.println("ServerMain: main <port> must be an integer");
                System.exit(1);
            }
            ServerLoader serverLoader = new ServerLoader(new Campaign("test"));
            closeServerLogger();
            //ServerGUI gui = new ServerGUI();
        }
        else{
            //run client

        }
    }

    private static void closeServerLogger() {
        try {
            serverLogger.write("Stopping serverLogger");
            serverLogger.close();
        } catch (IOException e) {
            System.err.println("ServerMain: Failed to close serverLogger");
        }
    }
}
