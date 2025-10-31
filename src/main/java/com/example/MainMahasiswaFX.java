package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainMahasiswaFX extends Application {

    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtNim;
    @FXML
    private TextField txtJurusan;
    @FXML
    private TextField txtUmur;
    @FXML
    private TextArea txtOutput;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/form_mahasiswa.fxml"));
        Scene scene = new Scene(loader.load(), 380, 480);
        stage.setTitle("Form Mahasiswa");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleSimpan() {
        try {
            String nama = txtNama.getText();
            String nim = txtNim.getText();
            String jurusan = txtJurusan.getText();
            int umur = Integer.parseInt(txtUmur.getText());

            Mahasiswa mhs = new Mahasiswa(
                    "Reyhan Fathir Alamsyah",
                    "24552011032",
                    "Teknik Informatika",
                    19
            );
            mhs.setNama(nama);
            mhs.setNim(nim);
            mhs.setJurusan(jurusan);
            mhs.setUmur(umur);

            txtOutput.setText(
                    "Nama: " + mhs.getNama() + "\n"
                    + "NIM: " + mhs.getNim() + "\n"
                    + "Jurusan: " + mhs.getJurusan() + "\n"
                    + "Umur: " + mhs.getUmur()
            );

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
