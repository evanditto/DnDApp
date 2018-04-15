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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);

        //create main panel
        JPanel rootPanel = new JPanel(new BorderLayout());
        rootPanel.setSize(new Dimension(1000,500));
        frame.add(rootPanel);
        JPanel westGridPanel = new JPanel(new GridLayout(3,1));
        westGridPanel.setPreferredSize(new Dimension(100, 400));
        rootPanel.add(westGridPanel, BorderLayout.WEST);
        JLabel campaignsLabel = new JLabel("Campaigns");
        campaignsLabel.setPreferredSize(new Dimension(50, 50));
        westGridPanel.add(campaignsLabel);

        JButton newCampaign = new JButton("New Campaign");
        //newCampaign.setSize(new Dimension(50,50));
        //newCampaign.setSize(50,50);
        newCampaign.setPreferredSize(new Dimension(50,50));
        westGridPanel.add(newCampaign);

        JList<Campaign> campaignList = new JList<Campaign>();
        campaignList.setPreferredSize(new Dimension(100, 200));
        Campaign[] campaigns1 = new Campaign[5];
        campaigns1[0] = new Campaign("Test1");
        campaignList.setListData(campaigns1);
        westGridPanel.add(campaignList);


        JLabel l2 = new JLabel("label2");
        l2.setPreferredSize(new Dimension(100, 50));
        rootPanel.add(l2, BorderLayout.EAST);

        /*
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
