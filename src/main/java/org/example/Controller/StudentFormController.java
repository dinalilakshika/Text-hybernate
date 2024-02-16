package org.example.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import org.example.bo.BOFactory;
import org.example.bo.custom.StudentBO;
import org.example.dto.StudentDto;

import java.sql.SQLException;

public class StudentFormController {

        @FXML
        private JFXTextField txtID;

        @FXML
        private JFXTextField txtName;

        @FXML
        private JFXTextField txtAddress;

        @FXML
        private JFXButton btnSave;

        @FXML
        private JFXButton btnUpdate;

        @FXML
        private JFXButton btnDelete;

        @FXML
        void btnDeleteOnAction(ActionEvent event) {

        }

    StudentBO studentBO = (StudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.STUDENT);
    ObservableList<StudentDTO> observableList = FXCollections.observableArrayList();

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String studentId = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();

        try {
            boolean isSaved = studentBO.saveStudent(new StudentDTO(studentId, name,address));

            if (isSaved) {

                new Alert(Alert.AlertType.CONFIRMATION, "Saved  !!!").show();
                txtId.setText("");
                txtName.setText("");
                txtAddress.setText("");
                observableList.clear();

            } else {
                new Alert(Alert.AlertType.ERROR, "Not saved  !!!").show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
