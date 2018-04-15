import Server.ServerGUI;

/**
 * Main class that will be used to launch the program.
 */
public class Main {

    //fields


    /**
     * main method that launches the program
     * @param args Run as server or client
     */
    public static void main(String[] args) {

        //local vars
        int port = 0;

        if(args.length != 0){
            //run server
            try{
                port = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nonInt){
                System.out.println("ServerMain: main <port> must be an integer");
                System.exit(1);
            }
            ServerGUI gui = new ServerGUI();
        }
        else{
            //run client

        }
    }
}
