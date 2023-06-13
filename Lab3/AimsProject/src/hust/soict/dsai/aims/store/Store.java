package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("This media is already in the store.");
        }
        else {
            itemsInStore.add(media);
            System.out.println("Added " + media.getTitle() + " to the store.");
        }
    }
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed " + media.getTitle() + " from the store.");
        }
        else {
            System.out.println("This media is not in the store.");
        }
    }
}