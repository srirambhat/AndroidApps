package com.example.sqlliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataBaseHelperClass myDb;
    Button btnAddData;
    Button btnViewAllData;
    Button btnUpdateData;
    Button btnDelete;
    EditText editName, editSurname, editMarks, editID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelperClass(this);

        editName = (EditText)findViewById(R.id.editName);
        editSurname = (EditText)findViewById(R.id.editSurname);
        editMarks = (EditText)findViewById(R.id.editMarks);
        editID = (EditText) findViewById(R.id.editId);

        btnAddData = (Button)findViewById(R.id.button_add);
        btnViewAllData = (Button) findViewById(R.id.button_display);
        btnUpdateData = (Button) findViewById(R.id.button_update);
        btnDelete = (Button) findViewById(R.id.button_del);

        addData();
        ViewAll();
        UpdateData();
        DeleteData();
    }

    public void addData () {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean isInserted = myDb.InsertData(editName.getText().toString(),
                                editSurname.getText().toString(),
                                editMarks.getText().toString() );
                        if (isInserted)
                            Toast.makeText(MainActivity.this,"Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void ViewAll () {
        btnViewAllData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor res = myDb.getAllData();
                        if (res.getCount() == 0) {
                            // Show Message
                            showMessage("Error","Nothing found");
                            return ;
                        } else {
                            StringBuffer buffer = new StringBuffer();
                            while (res.moveToNext()) {
                                buffer.append("Id :"+ res.getString(0)+"\n");
                                buffer.append("Name :"+ res.getString(1)+"\n");
                                buffer.append("Surname :"+ res.getString(2)+"\n");
                                buffer.append("Marks :"+ res.getString(3)+"\n\n");
                            }

                            // Show all data
                            showMessage("Data",buffer.toString());
                        }
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void UpdateData () {
        btnUpdateData = (Button) findViewById(R.id.button_update);

        btnUpdateData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean isUpdate = myDb.UpdateData(editID.getText().toString(),
                                editName.getText().toString(),
                                editSurname.getText().toString(),
                                editMarks.getText().toString()
                        );
                        if(isUpdate == true)
                            Toast.makeText(MainActivity.this,"Data Update",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void DeleteData () {
        btnDelete = (Button) findViewById(R.id.button_del);
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Integer del_rows = myDb.DeleteData(editID.getText().toString());

                        if(del_rows > 0)
                            Toast.makeText(MainActivity.this,del_rows +"Rows of Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}