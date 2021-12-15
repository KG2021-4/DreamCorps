package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerMainView;
import model.VideoModel;

public class MainView extends JFrame {
	private JPanel contentPane;
	private ArrayList<JLabel>videos = new ArrayList<JLabel>();
	private ControllerMainView mainController;
	
	/* MainView where we see our preview of our Netflix account */
	public MainView(ControllerMainView c) {
		setMainController(c);
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1929,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(9,9,9));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*JLabel set with image logo.png from specified path*/
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\assets\\img\\vistaprincipal\\logo.PNG"));
		lblNewLabel.setBounds(30,11,131,88);
		contentPane.add(lblNewLabel);
		
		/*JLabel set with "Sign in" text*/
		JLabel lblNewLabel_1 = new JLabel("Sign in");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(255,255,255));
		lblNewLabel_1.setBounds(160, 50,71,25);
		contentPane.add(lblNewLabel_1);
		
		/*JLabel set with "Series" text*/
		JLabel lblNewLabel_2 = new JLabel("Series");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(new Color(255,255,255));
		lblNewLabel_2.setBounds(227,50,71,25);
		contentPane.add(lblNewLabel_2);

		/*JLabel set with "Movies" text to represent the category*/
		JLabel lblNewLabel_2_1 = new JLabel("Movies");
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(292,50,71,25);
		contentPane.add(lblNewLabel_2_1);
		
		/*JLabel set with "Most Recent" text*/
		JLabel lblNewLabel_2_2 = new JLabel("Most Recent");
		lblNewLabel_2_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBounds(362,52,108,20);
		contentPane.add(lblNewLabel_2_2);
		
		/*JLabel set with "My List" text*/
		JLabel lblNewLabel_2_3 = new JLabel("My List");
		lblNewLabel_2_3.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(478,50,71,25);
		contentPane.add(lblNewLabel_2_3);
		
		/*RIGHT SKEWED IMAGES*/
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(".\\assets\\img\\vistaprincipal\\menu.PNG"));
		lblNewLabel_3.setBounds(1670,44,134,28);
		contentPane.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(".\\assets\\img\\vistaprincipal\\user.PNG"));
		lblNewLabel_4.setBounds(1817,33,55,48);
		contentPane.add(lblNewLabel_4);
		/*RIGHT SKEWED IMAGES*/
		
		
		/*JLabel set with "New & Popular" text to represent the category*/
		JLabel lblNewLabel_5 = new JLabel("New & Popular");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(30,110,268,42);
		contentPane.add(lblNewLabel_5);
		
		/*JLabel set with "Trending" text to represent the category*/
		JLabel lblNewLabel_5_1 = new JLabel("Trending");
		lblNewLabel_5_1.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setBounds(30, 360, 268, 42);
		contentPane.add(lblNewLabel_5_1);
		
		/*JLabel set with "Series" text to represent the category*/
		JLabel lblNewLabel_5_2 = new JLabel("Series");
		lblNewLabel_5_2.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setBounds(30,610,268,42);
		contentPane.add(lblNewLabel_5_2);
		
		updateVideos();
		
	}
	
	private void updateVideos() {
		ArrayList<VideoModel> videos = (ArrayList<VideoModel>) getMainController().getModel().getAll();
		Integer xPopular = 30;
		Integer xTrending = 30;
		Integer xSeries = 30;
		
		// for loop to generate each Label at its specific bounds and width depending on the case
		for(VideoModel video: videos) {
			JLabel lbl = new JLabel("");
			//update videos images because we added a new entry
			lbl.setIcon(new ImageIcon(video.getImage()));
			
			switch(video.getCategory()) {
			case "Popular":
				lbl.setBounds(xPopular,160,341,192);
				xPopular = xPopular+345;
				break;
			case "Trending":
				lbl.setBounds(xTrending,410,341,192);
				xPopular = xPopular+345;
				break;
			case "Series":
				lbl.setBounds(xSeries,660,341,192);
				xPopular = xPopular+345;
				break;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
