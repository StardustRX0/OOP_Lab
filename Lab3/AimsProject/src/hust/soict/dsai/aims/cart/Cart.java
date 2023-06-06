package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart
{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if (qtyOrdered < MAX_NUMBERS_ORDERED)
        {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else
        {
            System.out.println("The cart is full, cannot add disc");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        DigitalVideoDisc[] itemsOrderedRemoved = new DigitalVideoDisc[qtyOrdered - 1];
        int j=0;
        for (int i=0; i<qtyOrdered; ++i)
        {
            if (itemsOrdered[i] != disc)
            {
                itemsOrderedRemoved[j] = itemsOrdered[i];
                j++;
            }
        }
        qtyOrdered--;
        itemsOrdered = itemsOrderedRemoved;
        System.out.println("The disc has been removed");
    }

    public float totalCost()
    {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++)
        {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList)
    {
        if (dvdList.length <= MAX_NUMBERS_ORDERED - qtyOrdered)
        {
            for (DigitalVideoDisc dvd : dvdList)
            {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
            }
            System.out.println("The disc has been added");
        }
        else
        {
            System.out.println("The cart is full, cannot add disc");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED)
        {
            itemsOrdered[qtyOrdered] = dvd1;
            itemsOrdered[qtyOrdered+1] = dvd2;
            qtyOrdered += 2;
            System.out.println("The discs have been added");
        }
        else
        {
            System.out.println("The cart is full, cannot add discs");
        }
    }

    public boolean orderedCart()
    {
        System.out.println("***************CART**************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++)
        {
            DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.printf("%d. DVD - %s - %s - %s - %s: %.2f $\n", i+1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
        }

        System.out.print("Total cost: " + totalCost() + "\n");
        System.out.println("**********************************");
        return false;
    }
}


