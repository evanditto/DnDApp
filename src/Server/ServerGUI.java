package Server;

import Campaign.Campaign;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class ServerGUI {

    /**
     * Creates the server GUI
     */
    public ServerGUI(){
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI(){
        //Create and set up the window
        JFrame frame = new JFrame("ServerGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create main panel
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);
        JPanel p2 = new JPanel(new GridLayout(3,1));
        panel.add(p2, BorderLayout.WEST);
        JLabel l = new JLabel("test");
        l.setPreferredSize(new Dimension(200, 200));
        JLabel l2 = new JLabel("test");
        l2.setPreferredSize(new Dimension(200, 200));
        p2.add(l);
        panel.add(l2, BorderLayout.EAST);

        /*
        //create west panel
        LayoutManager westGridLayout = new GridLayout(3,1);
        JPanel westPanel = new JPanel(westGridLayout);
        JLabel campaignsLabel = new JLabel("Campaigns");
        campaignsLabel.setPreferredSize(new Dimension(200, 200));
        JButton newCampaignButton = new JButton("New Campaign");
        //JList<Campaign> campaignList = new JList<Campaign>();
        westGridLayout.addLayoutComponent("campaignsLabel", campaignsLabel);
        westGridLayout.addLayoutComponent("newCampaignButton", newCampaignButton);
        //westGridLayout.addLayoutComponent("campaignList", campaignList);

        //create east panel
        LayoutManager eastGridLayout = new GridLayout(4,1);
        JPanel eastPanel = new JPanel(westGridLayout);

        //create center panel
        JPanel centerPanel = new JPanel(westGridLayout);


        panel.add(westPanel, BorderLayout.WEST);
        panel.add(eastPanel, BorderLayout.EAST);
        panel.add(centerPanel, BorderLayout.CENTER);
*/

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
