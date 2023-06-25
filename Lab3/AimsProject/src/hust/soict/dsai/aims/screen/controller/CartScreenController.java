package hust.soict.dsai.aims.screen.controller;

import hust.soict.dsai.aims.cart.Cart;

public class CartScreenController 
{
    private Cart cart;
    
    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    public CartScreenController(Cart cart)
    {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize()
    {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
    }
}