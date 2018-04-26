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
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);

        //create main panel
        JPanel rootPanel = new JPanel(new BorderLayout());
        rootPanel.setSize(800,800);
        frame.add(rootPanel);

        //Create north Panel
        JPanel northPanel = new JPanel();
        JLabel serverGUILabel = new JLabel("ServerGui: v.1");
        LayoutManager northFlowLayout = new FlowLayout(FlowLayout.CENTER);
        northPanel.setLayout(northFlowLayout);
        northPanel.setBackground(new Color(255,255,0));
        northPanel.add(serverGUILabel);
        rootPanel.add(northPanel, BorderLayout.NORTH);

        //Create South Panel
        JPanel southPanel = new JPanel();
        JLabel southLabel = new JLabel("South");
        LayoutManager southFlowLayout = new FlowLayout();
        southPanel.setLayout(southFlowLayout);
        southPanel.setBackground(new Color(255,0,255));
        southPanel.add(southLabel);
        rootPanel.add(southPanel, BorderLayout.SOUTH);

        //Create East Panel
        JPanel eastPanel = new JPanel();
        JLabel eastLabel = new JLabel("East");
        LayoutManager eastFlowLayout = new FlowLayout();
        eastPanel.setLayout(eastFlowLayout);
        eastPanel.setBackground(new Color(0, 255,255));
        eastPanel.add(eastLabel);
        rootPanel.add(eastPanel, BorderLayout.EAST);

        //Create West Panel
        JPanel westPanel = new JPanel();
        JLabel campaignsLabel = new JLabel("Campaigns");
        JButton newCampaignButton = new JButton("New Campaign");
        JList<Campaign> campaignList = new JList<Campaign>();
        Campaign[] campaigns1 = new Campaign[1];
        campaigns1[0] = new Campaign("Test1", 1);
        campaignList.setListData(campaigns1);
        LayoutManager westBorderLayout = new BorderLayout();
        westPanel.setLayout(westBorderLayout);
        westPanel.setBackground(new Color(255,0,0));
        westPanel.add(campaignsLabel, BorderLayout.NORTH);
        westPanel.add(campaignList, BorderLayout.CENTER);
        westPanel.add(newCampaignButton, BorderLayout.SOUTH);
        rootPanel.add(westPanel, BorderLayout.WEST);

        //Create Center Panel
        JPanel centerPanel = new JPanel();
        JLabel centerLabel = new JLabel("center");
        LayoutManager centerFlowLayout = new FlowLayout(FlowLayout.CENTER);
        centerPanel.setLayout(centerFlowLayout);
        centerPanel.setBackground(new Color(0,0,255));
        centerPanel.add(centerLabel);
        rootPanel.add(centerPanel, BorderLayout.CENTER);

        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }
}
