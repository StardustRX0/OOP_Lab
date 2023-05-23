public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[65536];

    public void addDVD(DigitalVideoDisc disc)
    {
        int i = itemsInStore.length;
        itemsInStore[i-1] = disc;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc[] itemsInStoreRemoved = new DigitalVideoDisc[itemsInStore.length - 1];
        int i = 0;
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc != disc) {
                itemsInStoreRemoved[i] = digitalVideoDisc;
                i++;
            }
        }
        itemsInStore = itemsInStoreRemoved;
    }
}