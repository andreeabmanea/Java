package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.Object;
import java.awt.Desktop;

public class Catalog implements Serializable{

    private String catalogName;
    private transient List<Item> items;

    public Catalog(String catalogName) {
        this.catalogName = catalogName;
        items = new ArrayList<>();
    }

    public void add(Item entry) {

        items.add(entry);
    }

    public void list() {
        System.out.println(items);
    }

    public void play(Item item) {
        File f = new File(String.valueOf(item.getPath()));
        try {
            Desktop.getDesktop().open(f);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void save(Catalog catalog) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream("catalog.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(catalog);
            out.close();
            fileOut.close();
            System.out.println("Saved");
            }catch (IOException i){
            i.printStackTrace();
        }
    }

    public void load() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("catalog.ser");
        ObjectInputStream in = new ObjectInputStream(fis);
        Date date = (Date)in.readObject();
        String message = (String) in.readObject();
        int i = in.readInt();
        fis.close();
    }



}
