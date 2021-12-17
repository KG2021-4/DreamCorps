package view;

import controller.ControllerMainView;
import model.Videos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class MainView extends JFrame{
    private JPanel contentPane;
    private ArrayList<JLabel> videos = new ArrayList<JLabel>();
    private ControllerMainView mainController;
    private JLabel lbl;

    /* MainView where we see our preview of our Netflix account */
    public MainView(ControllerMainView c) {
        setMainController(c);
        setForeground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1929,1080);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(40,44,60));
        contentPane.setForeground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        /*JLabel set with image logo.png from specified path*/
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("assets/Images/disneylogowhite.png"));
        lblNewLabel.setBounds(30,20,120,75);
        contentPane.add(lblNewLabel);

        /*JLabel set with "Home" text*/
        JLabel lblNewLabel_1 = new JLabel("Home");
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 17));
        lblNewLabel_1.setForeground(new Color(255,255,255));
        lblNewLabel_1.setBounds(250, 50,71,25);
        contentPane.add(lblNewLabel_1);

        /*JLabel set with "My List" text*/
        JLabel lblNewLabel_2_3 = new JLabel("WatchList");
        lblNewLabel_2_3.setFont(new Font("SansSerif", Font.PLAIN, 17));
        lblNewLabel_2_3.setForeground(Color.WHITE);
        lblNewLabel_2_3.setBounds(450,50,100,25);
        contentPane.add(lblNewLabel_2_3);

        /*JLabel set with "Most Recent" text*/
        JLabel lblNewLabel_2_2 = new JLabel("Originals");
        lblNewLabel_2_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
        lblNewLabel_2_2.setForeground(Color.WHITE);
        lblNewLabel_2_2.setBounds(700,52,108,20);
        contentPane.add(lblNewLabel_2_2);

        /*JLabel set with "Movies" text to represent the category*/
        JLabel lblNewLabel_2_1 = new JLabel("Movies");
        lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setBounds(950,50,71,25);
        contentPane.add(lblNewLabel_2_1);

        /*JLabel set with "Series" text*/
        JLabel lblNewLabel_2 = new JLabel("Series");
        lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
        lblNewLabel_2.setForeground(new Color(255,255,255));
        lblNewLabel_2.setBounds(1200,50,71,25);
        contentPane.add(lblNewLabel_2);

        //User image
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("assets/Images/mickey.png"));
        lblNewLabel_4.setBounds(1500,33,75,75);
        contentPane.add(lblNewLabel_4);
        /*RIGHT SKEWED IMAGES*/

        JLabel disney = new JLabel();
        disney.setIcon(new ImageIcon("assets/Images/Disney.png"));
        disney.setBounds(30,130,300,159);
        contentPane.add(disney);

        JLabel pixar = new JLabel();
        pixar.setIcon(new ImageIcon("assets/Images/Pixar.png"));
        pixar.setBounds(360,130,300,159);
        contentPane.add(pixar);

        JLabel marvel = new JLabel();
        marvel.setIcon(new ImageIcon("assets/Images/Marvel.png"));
        marvel.setBounds(690,130,300,159);
        contentPane.add(marvel);

        JLabel starwars = new JLabel();
        starwars.setIcon(new ImageIcon("assets/Images/StarWars.png"));
        starwars.setBounds(1020,130,300,159);
        contentPane.add(starwars);

        JLabel ng = new JLabel();
        ng.setIcon(new ImageIcon("assets/Images/NatGeo.png"));
        ng.setBounds(1350,130,300,159);
        contentPane.add(ng);

        /*JLabel set with "New & Popular" text to represent the category*/
        JLabel lblNewLabel_5 = new JLabel("Originals");
        lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setBounds(30,330,268,42);
        contentPane.add(lblNewLabel_5);

        /*JLabel set with "Trending" text to represent the category*/
        JLabel lblNewLabel_5_1 = new JLabel("My List");
        lblNewLabel_5_1.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblNewLabel_5_1.setForeground(Color.WHITE);
        lblNewLabel_5_1.setBounds(30, 605, 268, 42);
        contentPane.add(lblNewLabel_5_1);

//        /*JLabel set with "Series" text to represent the category*/
//        JLabel lblNewLabel_5_2 = new JLabel("Series");
//        lblNewLabel_5_2.setFont(new Font("SansSerif", Font.BOLD, 25));
//        lblNewLabel_5_2.setForeground(Color.WHITE);
//        lblNewLabel_5_2.setBounds(30,700,268,42);
//        contentPane.add(lblNewLabel_5_2);

        updateVideos();

    }

    private void updateVideos() {
        ArrayList<Videos> videos = (ArrayList<Videos>) getMainController().getModel().getAll();
        Integer xOriginals = 30;
        Integer xMyList = 30;
//        Integer xSeries = 30;

        // for loop to generate each Label at its specific bounds and width depending on the case
        for(Videos video: videos) {
            lbl = new JLabel("");
            //update videos images because we added a new entry
            lbl.setIcon(new ImageIcon(video.getImage()));
            lbl.addMouseListener(getMainController());

            switch(video.getCategory()) {
                case "Originals":
                    lbl.setBounds(xOriginals,400,341,192);
                    xOriginals = xOriginals+345;
                    break;
                case "My List":
                    lbl.setBounds(xMyList,675,341,192);
                    xMyList = xMyList+345;
                    break;
//                case "Series":
//                    lbl.setBounds(xSeries,660,341,192);
//                    xPopular = xPopular+345;
//                    break;
            }
            contentPane.add(lbl);
        }

    }


    /*GETTERS AND SETTERS*/
    public ControllerMainView getMainController() {
        return mainController;
    }

    public void setMainController(ControllerMainView mainController) {
        this.mainController = mainController;
    }

    public ArrayList<JLabel> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<JLabel> videos) {
        this.videos = videos;
    }
    /*GETTERS AND SETTERS*/

    public JLabel getLbl() {
        return lbl;
    }
}
