package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Aims
{
    public static void main(String[] args)
    {
        Cart anOrder = new Cart();

        Media dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        Media dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Georgre Lucas", 87 , 24.95f);
        anOrder.addMedia(dvd2);

        Media dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addMedia(dvd3);

        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.println(anOrder.orderedCart());
    }
}
