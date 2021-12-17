package controller;

import model.VideoC;
import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class ControllerMainView implements MouseListener {

    private VideoC model;
    private MainView view;

    public ControllerMainView() {
        super();
        this.model = new VideoC();
        //Connecting this ControllerMainView to the MainView cause it handles it directly.
        this.view = new MainView(this);
        //Make GUI visible
        this.view.setVisible(true);
    }

    /*MAIN VIEW CONTROLLER*/

    /*GETTERS AND SETTERS*/
    public VideoC getModel() {
        return model;
    }

    public void setModel(VideoC model) {
        this.model = model;
    }

    public MainView getView() {
        return view;
    }

    public void setView(MainView view) {
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        if(e.getSource().equals(getModel().get(1))) {
//            try {
//                java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.youtube.com/watch?v=RlaV8sJGhfc"));
//            }catch(IOException ex) {
//
//            }
//        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /*GETTERS AND SETTERS*/
}
