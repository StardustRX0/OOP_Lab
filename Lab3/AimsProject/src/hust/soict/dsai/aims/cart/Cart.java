package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Cart
{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media media)
    {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED)
        {
            itemsOrdered.add(media);
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is full");
        }
    }
    public void removeMedia(Media media)
    {
        if (itemsOrdered.contains(media))
        {
            itemsOrdered.remove(media);
            System.out.println("The disc has been removed");
        }
        else {
            System.out.println("The disc is not in the cart");
        }
    }
    public float totalCost()
    {
        float totalCost = 0;
        for (Media media : itemsOrdered)
        {
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost);
        return totalCost;
    }

    public void searchById(int id)
    {
        System.out.printf("Search Results for discs with ID %d\n", id);
        for (Media a : itemsOrdered)
        {
            if (a.getId() == id)
            {
                System.out.printf("%d: DVD - %s - %s - %s - %s: %.2f $\n", a.getId(), a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(), a.getCost());
            }
        }
    }

    public void searchByTitle(String title) {
        System.out.printf("Search Results for discs with title \"%s\"\n", title);
        for (Media a : itemsOrdered)
        {
            if (a.getTitle().equals(title))
            {
                System.out.printf("%d: DVD - %s - %s - %s - %s: %.2f $\n", a.getId(), a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(), a.getCost());
            }
        }
    }

    public boolean orderedCart()
    {
if (itemsOrdered.size() > 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}