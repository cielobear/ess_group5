/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgui2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author c1elobear
 */
public class FXMLDocumentController implements Initializable {
    
    ArrayList<stock> listStocks = new ArrayList<>();
    
    @FXML
    private Label lblNewStock;
    
    private ComboBox<String> cboStockBox;
    @FXML
    private TextField fldItem;
    @FXML
    private TextField fldSupplier;
    @FXML
    private TextField fldCount;
    @FXML
    private Button btnStocksAdd;
    @FXML
    private Label lblStockList;
    @FXML
    private Button btnViewStocks;
    @FXML
    private ListView<stock> stockListView;
    @FXML
    private TextField fldStockBox;
    
    private final List<StockBoxes> listStockBoxes = new ArrayList<>();

    /*Initializes*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listStocks.add(new stock("Nails", "The Range", "100"));
        listStocks.add(new stock("Laminate", "Beaver Inc.", "25"));
        listStocks.add(new stock("Bricks", "SuperBuilder", "300"));
    }
    
    @FXML
    public void handleSaveStock(ActionEvent event) throws IOException {
        
        String stockbox = this.fldStockBox.getText();
        String item = this.fldItem.getText();
        String supplier = this.fldSupplier.getText();
        String count = this.fldCount.getText();
      
        
        stock Stock = new stock(item, supplier, count);
        listStocks.add(Stock);
    }
    
    @FXML
    public void handleShowStocks(){
                if (!stockListView.getItems().isEmpty()){
            this.stockListView.getItems().clear();
        }
                listStocks.forEach((ag) -> {
                    this.stockListView.getItems().add(ag);
        });
    }
    
    @FXML
    private Label label;
    
    @FXML
    private void btnBuyAction(ActionEvent event) {
        System.out.println("Bought more supplies!");
        label.setText("Item was ordered!");
    }  
    

}

    class StockBoxes {

        public StockBoxes(String String) {
        }
    }



