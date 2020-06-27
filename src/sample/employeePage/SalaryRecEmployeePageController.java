package sample.employeePage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ComboBoxListCell;
import sample.Payslip;

import java.net.URL;
import java.util.ResourceBundle;

public class SalaryRecEmployeePageController implements Initializable {
    @FXML
    private TableView<?> tableMazaya;
    @FXML
    private TableColumn<Payslip, String> col_salary;
    @FXML
    private TableView<?> tableKusurat;
    @FXML
    private TableColumn<Payslip, String> col_payment;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
