package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VideoC implements C<Videos>{
    private Database db = Database.getInstance();


    @Override
    public Optional<Videos> get(Integer id) {
        Videos vid = null;
        ResultSet rs = getDb().query("SELECT * FROM videos WHERE video.id = " +id+ " LIMIT 1");

        try{
            while(rs.next()) {
                String title = rs.getString(2);
                String image =  rs.getString(3);
                String category =  rs.getString(4);
                vid = new Videos(id,title,image,category);
            }
        }catch(SQLException ex){

        }
        return Optional.ofNullable(vid);
    }

    @Override
    public List<Videos> getAll() {
        List<Videos> vidList = new ArrayList<>();
        ResultSet rs = getDb().query("SELECT * FROM videos");

        try {
            while(rs.next()) {
                Integer id = rs.getInt(1);
                String title = rs.getString(2);
                String image =  rs.getString(3);
                String category =  rs.getString(4);
                Videos vid = new Videos(id,title,image,category);
                vidList.add(vid);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return vidList;
    }

    @Override
    public void save(Videos v) {
        ResultSet rs = getDb().query("INSERT INTO public.videos (title,image,category) VALUES ("
                +"'"+v.getTitle()+"'::character varying, '"+v.getImage()+"'::character varying,'"+v.getCategory()+"'::character varying)"
                + "returning id;");

    }

    @Override
    public void update(Videos v) {
        ResultSet rs = getDb().query("UPDATE public.videos SET category = '"+v.getCategory()+"'::character varying,"
                + "image = '"+v.getImage()+"'::character varying," + "title = '"
                +v.getTitle()+"'::character varying WHERE id = "+ v.getId()+";");
    }

    @Override
    public void delete(Videos v) {
        ResultSet rs = getDb().query("DELETE FROM public.videos WHERE id IN ("+v.getId()+");");

    }

    public Integer maxId() {
        Integer id = 0;
        ResultSet rs = getDb().query("SELECT id FROM public.videos ORDER BY id DESC LIMIT 1;");
        try {
            if(rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
}
