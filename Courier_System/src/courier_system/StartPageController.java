package courier_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * StartPageController class is a controller class to handle all events. It
 * performs all the necessary actions of the controls.
 *
 * @author Ajay
 */
public class StartPageController {

    @FXML
    private BorderPane brdMain;
    @FXML
    private Menu mnFile;
    @FXML
    private Menu mnEdit;
    @FXML
    private Label lblMsg;
    @FXML
    private ScrollPane scpaneShipment;
    @FXML
    private Font x1;
    @FXML
    private TextField txtContent;
    @FXML
    private Font x2;
    @FXML
    private TextField txtIVal;
    @FXML
    private Color x3;
    @FXML
    private Insets x5;
    @FXML
    private Button btnShipNext;
    @FXML
    private ScrollPane scPaneDestination;
    @FXML
    private TextField txtDSTName;
    @FXML
    private TextField txtDSTAdd;
    @FXML
    private TextField txtDSTCity;
    @FXML
    private TextField txtDSTPhone;
    @FXML
    private TextField txtDSTProvince;
    @FXML
    private TextField txtDSTZIP;
    @FXML
    private TextField txtDSTCountry;
    @FXML
    private Button btnDSTNext;
    @FXML
    private ScrollPane scPaneSender;
    @FXML
    private TextField txtSNDName;
    @FXML
    private TextField txtSNDAdd;
    @FXML
    private TextField txtSNDCity;
    @FXML
    private TextField txtSNDPhone;
    @FXML
    private TextField txtSNDProvince;
    @FXML
    private TextField txtSNDZIP;
    @FXML
    private TextField txtSNDCountry;
    @FXML
    private TextArea txtSNDComment;
    @FXML
    private Tab tbTrack;
    @FXML
    private Font x6;
    @FXML
    private Button btnReset;
    @FXML
    private Button btnDSTBack;
    @FXML
    private Button btnSenBack;
    @FXML
    private Insets m;
    @FXML
    private Insets m2;
    @FXML
    private TextField txtDVal;
    @FXML
    private RadioButton rbYes;
    @FXML
    private Insets m0;
    @FXML
    private RadioButton rbNo;
    @FXML
    private Insets mm;
    @FXML
    private Font x7;
    @FXML
    private Insets ship;
    @FXML
    private Insets de;
    @FXML
    private Insets n;
    @FXML
    private Insets a;
    @FXML
    private Insets c;
    @FXML
    private Insets p;
    @FXML
    private Insets pr;
    @FXML
    private Insets z;
    @FXML
    private Insets co;
    @FXML
    private Insets ns;
    @FXML
    private Insets na;
    @FXML
    private Insets cs;
    @FXML
    private Insets sp;
    @FXML
    private Insets spr;
    @FXML
    private Insets sz;
    @FXML
    private Insets sc;
    @FXML
    private Insets scm;
    @FXML
    private GridPane grdDesDet;
    @FXML
    private GridPane grdSender;
    @FXML
    private GridPane grdShipment;
    @FXML
    private Tab tbNav;
    @FXML
    private ScrollPane scNav;
    @FXML
    private Tab tbShipmentForm;
    @FXML
    private ToggleGroup tgCh;
    @FXML
    private Font x8;
    @FXML
    private Insets x11;
    @FXML
    private ToggleGroup tgCH;
    @FXML
    private Insets se;
    @FXML
    private TextField txtSearch;
    @FXML
    private Button btnSearch;
    @FXML
    private Insets add;
    @FXML
    private Insets sen;
    @FXML
    private Button btnFirst;
    @FXML
    private Button btnPrev;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnLast;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnSave;
    @FXML
    private ComboBox<String> cbShipby;
    @FXML
    private Insets cbship;
    @FXML
    private TextField txtNavDesName;
    @FXML
    private TextField txtNavDesAdd;
    @FXML
    private TextField txtNavDesCity;
    @FXML
    private TextField txtNavDesPC;
    @FXML
    private TextField txtNavDesPro;
    @FXML
    private TextField txtNavDesPH;
    @FXML
    private TextField txtNavDesCountry;
    @FXML
    private ComboBox<String> cbNavDesShipby;
    @FXML
    private TextField txtNavSenName;
    @FXML
    private TextField txtNavSenAdd;
    @FXML
    private TextField txtNavSenCity;
    @FXML
    private TextField txtNavSenPro;
    @FXML
    private TextField txtNavSenPC;
    @FXML
    private TextField txtNavSenPH;
    @FXML
    private TextField txtNavSenCountry;
    @FXML
    private TextField txtNavSenNotes;
    @FXML
    private TextField txtNavContent;
    @FXML
    private TextField txtNavDecVal;
    @FXML
    private TextField txtNavInsVal;
    @FXML
    private RadioButton rbNavYes;
    @FXML
    private RadioButton rbNavNo;
    @FXML
    private Insets navship;
    @FXML
    private TextField txtShipmentID;
    @FXML
    private Insets shid;
    @FXML
    private TextField txtNavShipmentID;
    @FXML
    private Insets navadd;
    @FXML
    private Insets nac;
    @FXML
    private Insets navp;
    @FXML
    private Insets navpr;
    @FXML
    private Insets naph;
    @FXML
    private Insets navc;
    @FXML
    private Insets nm;
    @FXML
    private Insets nsa;
    @FXML
    private Insets nsc;
    @FXML
    private Insets nsp;
    @FXML
    private Insets nspc;
    @FXML
    private Insets nsph;
    @FXML
    private Insets nsco;
    @FXML
    private Insets nsn;
    @FXML
    private Insets nscom;
    @FXML
    private Insets nsdv;
    @FXML
    private Insets nvi;
    @FXML
    private Insets nsid;
    @FXML
    private TableView<CourierModel> tblTrack;

    @FXML
    private TableColumn clmShipmentID;
    @FXML
    private TableColumn clmContent;
    @FXML
    private TableColumn clmDecVal;
    @FXML
    private TableColumn clmInsVal;
    @FXML
    private TableColumn clmisDange;
    @FXML
    private TableColumn clmRecName;
    @FXML
    private TableColumn clmRecAdd;
    @FXML
    private TableColumn clmRecCity;
    @FXML
    private TableColumn clmRecPro;
    @FXML
    private TableColumn clmRecZIP;
    @FXML
    private TableColumn clmRecCou;
    @FXML
    private TableColumn clmShipby;
    @FXML
    private TableColumn clmSenName;
    @FXML
    private TableColumn clmSenAdd;
    @FXML
    private TableColumn clmSenCity;
    @FXML
    private TableColumn clmSenPro;
    @FXML
    private TableColumn clmSenZIP;
    @FXML
    private TableColumn clmSenPH;
    @FXML
    private TableColumn clmSenCou;
    @FXML
    private TableColumn clmNotes;
    @FXML
    private TableColumn clmRecPH;

    ArrayList<CourierModel> lstCourier = new ArrayList<>();
    int index = 0;
    String path = "Courier.aad";
    String[] Shipping = {"Air", "Ground", "Sea"};

    /**
     * This method handle events of all the button on navigation page and
     * tracking page.
     */
    @FXML
    private void btnClicked(ActionEvent event) {
        if (event.getSource() == btnShipNext) {
            scpaneShipment.setVisible(false);
            scPaneDestination.setVisible(true);
        } else if (event.getSource() == btnDSTNext) {
            scPaneDestination.setVisible(false);
            scPaneSender.setVisible(true);
        } else if (event.getSource() == btnDSTBack) {
            scpaneShipment.setVisible(true);
            scPaneDestination.setVisible(false);
        } else if (event.getSource() == btnSenBack) {
            scPaneDestination.setVisible(true);
            scPaneSender.setVisible(false);
        } else if (event.getSource() == btnSave) {
            if (lstAdd() == true) {
                SavetoFile(false);
            }
        } else if (event.getSource() == btnReset) {
            clear(index);
        } else if (event.getSource() == btnSearch) {
            int i = -1;
            boolean flg = false;
            for (CourierModel courierModel : lstCourier) {
                //System.out.println(courierModel.getShipmentID() + courierModel.getShipmentID().equalsIgnoreCase(txtSearch.getText()));
                ++i;
                if (courierModel.getShipmentID().equalsIgnoreCase(txtSearch.getText())) {
                    getDataTable(i);
                    flg = true;
                    break;
                }
            }

            if (!flg) {
                lblMsg.setText("No such records found");
            } else {
                lblMsg.setText("Record found");
            }
        }
    }

    /**
     * This method helps changing tabs successfully and perform initial tasks to
     * provide user friendly evironment to user.
     */
    @FXML
    private void tabChanged(Event e) {
        if (e.getSource() == tbNav) {
            cbNavDesShipby.getItems().clear();
            cbNavDesShipby.getItems().addAll(Arrays.asList(Shipping));
            lblMsg.setText("Navigate update/delete records");
            index = 0;
            displayRecord();
        } else if (e.getSource() == tbShipmentForm) {
            loadFromFile();
            txtShipmentID.setText("S" + Year.now().getValue() + index);
            cbShipby.getItems().clear();
            cbShipby.getItems().addAll(Arrays.asList(Shipping));
            cbShipby.setValue("Ground");
            lblMsg.setText("Add new shipment information");
        } else if (e.getSource() == tbTrack) {
            if (!lstCourier.isEmpty()) {
                getDataTable(-1);
            }
        } else {
            lblMsg.setText("Track shipments");
        }
    }

    /**
     * Adds data of all the fields to the list of curior model.
     */
    public boolean lstAdd() {
        try {
            CourierModel objModel = new CourierModel(txtShipmentID.getText());
            objModel.setContent(txtContent.getText());
            objModel.setDecVal(Double.parseDouble(txtDVal.getText()));
            objModel.setInsVal(Double.parseDouble(txtIVal.getText()));
            objModel.setisDange(rbYes.isSelected());

            objModel.setRecAdd(txtDSTAdd.getText());
            objModel.setRecCity(txtDSTCity.getText());
            objModel.setRecCountry(txtDSTCountry.getText());
            objModel.setRecName(txtDSTName.getText());
            objModel.setRecPH(txtDSTPhone.getText());
            objModel.setRecPro(txtDSTProvince.getText());
            objModel.setRecPC(txtDSTZIP.getText());
            objModel.setShipBy(cbShipby.getValue());

            objModel.setSenName(txtSNDName.getText());
            objModel.setSenAdd(txtSNDAdd.getText());
            objModel.setSenCity(txtSNDCity.getText());
            objModel.setSenPro(txtSNDProvince.getText());
            objModel.setSenPC(txtSNDZIP.getText());
            objModel.setSenCountry(txtSNDCountry.getText());
            objModel.setSenPH(txtSNDPhone.getText());
            objModel.setNotes(txtSNDComment.getText());
            lstCourier.add(objModel);
            return true;
        } catch (Exception e) {
            lblMsg.setText("Message: Please check your inputs");
            return false;
        }
    }

    /**
     * display records of the current index in navigation panel.
     */
    public void displayRecord() {
        try {
            //System.out.println(index + "d");
            if (index >= 0 && index < lstCourier.size()) {
                txtNavShipmentID.setText(lstCourier.get(index).getShipmentID());
                txtNavContent.setText(lstCourier.get(index).getContent());
                txtNavDecVal.setText("" + lstCourier.get(index).getDecVal());
                txtNavInsVal.setText("" + lstCourier.get(index).getInsVal());
                rbNavYes.setSelected(lstCourier.get(index).isDange());
                rbNavNo.setSelected(!lstCourier.get(index).isDange());
                txtNavDesAdd.setText(lstCourier.get(index).getRecAdd());
                txtNavDesCity.setText(lstCourier.get(index).getRecCity());
                txtNavDesCountry.setText(lstCourier.get(index).getRecCountry());
                txtNavDesName.setText(lstCourier.get(index).getRecName());
                txtNavDesPH.setText(lstCourier.get(index).getRecPH());
                txtNavDesPro.setText(lstCourier.get(index).getRecPro());
                txtNavDesPC.setText(lstCourier.get(index).getRecPC());
                cbNavDesShipby.setValue(lstCourier.get(index).getShipBy());

                txtNavSenName.setText(lstCourier.get(index).getSenName());
                txtNavSenAdd.setText(lstCourier.get(index).getSenAdd());
                txtNavSenPro.setText(lstCourier.get(index).getSenPro());
                txtNavSenPC.setText(lstCourier.get(index).getSenPC());
                txtNavSenCity.setText(lstCourier.get(index).getSenCity());
                txtNavSenCountry.setText(lstCourier.get(index).getSenCountry());
                txtNavSenPH.setText(lstCourier.get(index).getSenPH());
                txtNavSenNotes.setText(lstCourier.get(index).getNotes());
            }
        } catch (Exception e) {
            lblMsg.setText("Message: Error while retriving data");
        }
    }

    /**
     * Loades data into file from arraylist.
     */
    public void loadFromFile() {
        lstCourier.clear();
        index = 1;
        File f = new File(path);
        if (!f.exists()) {
            try {
                f.createNewFile();
                lblMsg.setText("Message: No records found");
            } catch (IOException e) {
                lblMsg.setText("Message: Error to read the file.");
            }
        }
        try (Scanner records = new Scanner(f)) {
            while (records.hasNextLine()) {
                String record = records.nextLine();
                try (Scanner fields = new Scanner(record)) {
                    fields.useDelimiter("~\\s*");

                    CourierModel objCourier = new CourierModel(fields.next());
                    objCourier.setContent(fields.next());
                    objCourier.setDecVal(fields.nextDouble());
                    objCourier.setInsVal(fields.nextDouble());
                    objCourier.setisDange(fields.nextBoolean());

                    objCourier.setRecName(fields.next());
                    objCourier.setRecAdd(fields.next());
                    objCourier.setRecCity(fields.next());
                    objCourier.setRecPro(fields.next());
                    objCourier.setRecPC(fields.next());
                    objCourier.setRecCountry(fields.next());
                    objCourier.setRecPH(fields.next());
                    objCourier.setShipBy(fields.next());

                    objCourier.setSenName(fields.next());
                    objCourier.setSenAdd(fields.next());
                    objCourier.setSenCity(fields.next());
                    objCourier.setSenPro(fields.next());
                    objCourier.setSenPC(fields.next());
                    objCourier.setSenCountry(fields.next());
                    objCourier.setSenPH(fields.next());
                    objCourier.setNotes(fields.next());

                    lstCourier.add(objCourier);
                }
                ++index;
            }
        } catch (Exception ex) {
            lblMsg.setText("Message: Error while retriving the records");
        }
    }

    /**
     * fatch data from user form and saves it to file.
     */
    public void SavetoFile(boolean isUpdate) {
        File f = new File(path);
        try (PrintWriter pw = new PrintWriter(f)) {
            for (CourierModel cm : lstCourier) {
                pw.printf("%s\n", cm.toString());
            }
            if (!isUpdate) {
                clear(++index);
            }
            lblMsg.setText("Status: Shipment created Successfully, Thank you!!");
            scPaneDestination.setVisible(false);
            scPaneSender.setVisible(false);
            scpaneShipment.setVisible(true);
        } catch (FileNotFoundException ex) {
            lblMsg.setText("Message: Error while inserting the record.");

        } catch (Exception e) {
            lblMsg.setText("Message: Error while inserting the record, Something gone wrong");
        }
    }

    /**
     * Helps update file after file is edited.
     */
    public void UpdateFile() {
        if (index >= 0 && index < lstCourier.size()) {
            lstCourier.get(index).setShipmentID(txtNavShipmentID.getText());
            lstCourier.get(index).setContent(txtNavContent.getText());
            lstCourier.get(index).setDecVal(Double.parseDouble(txtNavDecVal.getText()));
            lstCourier.get(index).setInsVal(Double.parseDouble(txtNavInsVal.getText()));
            lstCourier.get(index).setisDange(rbNavYes.isSelected());

            lstCourier.get(index).setRecAdd(txtNavDesAdd.getText());
            lstCourier.get(index).setRecCity(txtNavDesCity.getText());
            lstCourier.get(index).setRecCountry(txtNavDesCountry.getText());
            lstCourier.get(index).setRecName(txtNavDesName.getText());
            lstCourier.get(index).setRecPH(txtNavDesPH.getText());
            lstCourier.get(index).setRecPro(txtNavDesPro.getText());
            lstCourier.get(index).setRecPC(txtNavDesPC.getText());
            lstCourier.get(index).setShipBy(cbNavDesShipby.getValue());

            lstCourier.get(index).setSenName(txtNavSenName.getText());
            lstCourier.get(index).setSenAdd(txtNavSenAdd.getText());
            lstCourier.get(index).setSenPro(txtNavSenPro.getText());
            lstCourier.get(index).setSenPC(txtNavSenPC.getText());
            lstCourier.get(index).setSenCity(txtNavSenCity.getText());
            lstCourier.get(index).setSenCountry(txtNavSenCountry.getText());
            lstCourier.get(index).setSenPH(txtNavSenPH.getText());
            lstCourier.get(index).setNotes(txtNavSenNotes.getText());
        }
    }

    /**
     * Clear method is to reset form entire form.
     */
    public void clear(int index) {
        txtShipmentID.setText("S" + Year.now().getValue() + index);
        txtContent.setText("");
        txtDVal.setText("");
        txtIVal.setText("");
        rbNo.setSelected(true);

        txtDSTAdd.setText("");
        txtDSTCity.setText("");
        txtDSTCountry.setText("");
        txtDSTName.setText("");
        txtDSTPhone.setText("");
        txtDSTProvince.setText("");
        txtDSTZIP.setText("");
        cbShipby.setValue("Ground");

        txtSNDName.setText("");
        txtSNDAdd.setText("");
        txtSNDCity.setText("");
        txtSNDProvince.setText("");
        txtSNDZIP.setText("");
        txtSNDCountry.setText("");
        txtSNDPhone.setText("");
        txtSNDComment.setText("");
    }

    /**
     * This method is to control all the navigation button and helps user to
     * navigate through entered data.
     */
    @FXML
    private void btnNavClicked(ActionEvent event) {
        if (event.getSource() == btnFirst) {
            if (lstCourier.isEmpty() || index == 0) {
                showNoMoreRecordsAlert("No more records");
            }
            index = 0;
        } else if (event.getSource() == btnLast) {
            if (index == lstCourier.size() - 1) {
                showNoMoreRecordsAlert("No more records");
            } else {
                index = lstCourier.size() - 1;
            }
            if (index < 0) {
                index = 0;
                showNoMoreRecordsAlert("No more records");
            }
        } else if (event.getSource() == btnPrev) {
            index--;
            if (index < 0) {
                index++;
                showNoMoreRecordsAlert("You are already at first record");
            }
        } else if (event.getSource() == btnNext) {
            ++index;
            //System.out.println(index);
            if (index >= lstCourier.size()) {
                index--;
                showNoMoreRecordsAlert("You are already at last record");
            }
        } else if (event.getSource() == btnDelete) {
            if (index >= 0 && index < lstCourier.size()) {
                lstCourier.remove(index);
                --index;
                SavetoFile(true);
                if (index < 0) {
                    ++index;
                }
                if (lstCourier.isEmpty()) {
                    clearnav();
                }
                displayRecord();
                lblMsg.setText("Record deleted successfully");
            } else {
                index = 0;
                showNoMoreRecordsAlert("no records found");
            }
        } else if (event.getSource() == btnUpdate) {
            try {
                UpdateFile();
                SavetoFile(true);
                lblMsg.setText("Record updated successfully");
            } catch (Exception ex) {
                lblMsg.setText("Error while updating the data");
            }
        }
        displayRecord();
    }

    /**
     * This method is used to fetch data in tracking tab while searching or
     * without searching tracking Id.
     */
    public void getDataTable(int i) {
        clmShipmentID.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("ShipmentID"));
        clmContent.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("Content"));
        clmDecVal.setCellValueFactory(new PropertyValueFactory<CourierModel, Double>("DecVal"));
        clmInsVal.setCellValueFactory(new PropertyValueFactory<CourierModel, Double>("InsVal"));
        clmisDange.setCellValueFactory(new PropertyValueFactory<CourierModel, Boolean>("isDange"));

        clmRecName.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecName"));
        clmRecAdd.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecAdd"));
        clmRecCity.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecCity"));
        clmRecPro.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecPro"));
        clmRecZIP.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecPC"));
        clmRecCou.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecCountry"));
        clmRecPH.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("RecPH"));
        clmShipby.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("ShipBy"));

        clmSenName.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenName"));
        clmSenAdd.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenAdd"));
        clmSenCity.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenCity"));
        clmSenPro.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenPro"));
        clmSenZIP.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenPC"));
        clmSenCou.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenCountry"));
        clmSenPH.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("SenPH"));
        clmNotes.setCellValueFactory(new PropertyValueFactory<CourierModel, String>("Notes"));

        if (i <= -1) {
            tblTrack.setItems(observableArrayList(lstCourier));
        } else {
            tblTrack.setItems(observableArrayList(lstCourier.get(i)));
        }
    }

    /**
     * Alert box display if there are no more record found while navigation
     * through.
     */
    public void showNoMoreRecordsAlert(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Warning");
        a.setContentText(msg);
        a.showAndWait();
    }

    public void clearnav() {
        txtNavShipmentID.setText("");
        txtNavContent.setText("");
        txtNavDecVal.setText("");
        txtNavInsVal.setText("");
        rbNavYes.setSelected(false);
        rbNavNo.setSelected(false);

        txtNavDesAdd.setText("");
        txtNavDesCity.setText("");
        txtNavDesCountry.setText("");
        txtNavDesName.setText("");
        txtNavDesPH.setText("");
        txtNavDesPro.setText("");
        txtNavDesPC.setText("");
        cbNavDesShipby.setValue("");

        txtNavSenName.setText("");
        txtNavSenAdd.setText("");
        txtNavSenPro.setText("");
        txtNavSenPC.setText("");
        txtNavSenCity.setText("");
        txtNavSenCountry.setText("");
        txtNavSenPH.setText("");
        txtNavSenNotes.setText("");
    }
}
