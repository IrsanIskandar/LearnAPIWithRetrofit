package id.co.kreasitindo.ibi.usingretrofit;


import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.co.kreasitindo.ibi.usingretrofit.ApiServices.APIUtils;
import id.co.kreasitindo.ibi.usingretrofit.ApiServices.IApiServices;
import id.co.kreasitindo.ibi.usingretrofit.Model.UserQuestions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    private String TAG = MainActivity.class.getSimpleName();

    TextView resultNumber;
    TextView resultQuestion;
    ListView listQuestions;
    IApiServices iApiServices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultNumber = findViewById(R.id.txtResult);
        resultQuestion = findViewById(R.id.txtResultQuestion);
        listQuestions = findViewById(R.id.listViewQuastions);

        GetQustions();

        listQuestions.setOnItemClickListener(MainActivity.this);
    }

    private void GetQustions(){
        final ProgressDialog loading = ProgressDialog.show(MainActivity.this, "Fetching Data", "Please Wait...", false, false);
        iApiServices = APIUtils.getIApiServices();

        Call<List<UserQuestions>> call = iApiServices.GetUserQuestions();
        call.enqueue(new Callback<List<UserQuestions>>() {
            @Override
            public void onResponse(Call<List<UserQuestions>> call, Response<List<UserQuestions>> response) {
                loading.dismiss();
                List<UserQuestions> userQuestionsList = response.body();

                for (int i = 0; i < userQuestionsList.size(); i++){
                    userQuestionsList.get(i).getId();
                    userQuestionsList.get(i).getQuestion();
                }

                ArrayAdapter adapter = new QuestionsAdapter(MainActivity.this, userQuestionsList);
                listQuestions.setAdapter(adapter);


                /*String convert = "";
                for (int i = 0; i < userQuestionsList.size(); i++){
                    int id = userQuestionsList.get(i).getId();
                    String items = userQuestionsList.get(i).getQuestion();
                    convert = "Hasil : " + String.valueOf(id) + " " + items;

                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
                adapter.add(convert);

                listQuestions.setAdapter(adapter);*/

                /*int id = 0;
                String items = "";
                for (int i = 0; i < userQuestionsList.size(); i++){
                    id = userQuestionsList.get(i).getId();
                    items = userQuestionsList.get(i).getQuestion();
                }

                resultNumber.setText(String.valueOf(id));
                resultQuestion.setText(items);*/
            }

            @Override
            public void onFailure(Call<List<UserQuestions>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error occure.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ShowList() {
        //String[] items;
        List<UserQuestions> getUserQuestion = new ArrayList<>();

        for (int i = 0; i < getUserQuestion.size(); i++){
            //items = getQuestion.get(i).getQuestion();
            getUserQuestion.get(i);
        }
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.activity_row__list, getUserQuestion);

        listQuestions.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
