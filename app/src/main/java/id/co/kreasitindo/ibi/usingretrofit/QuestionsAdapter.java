package id.co.kreasitindo.ibi.usingretrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import id.co.kreasitindo.ibi.usingretrofit.Model.UserQuestions;

public class QuestionsAdapter extends ArrayAdapter {
    private Context context;
    private List<UserQuestions> userQuestions;

    public QuestionsAdapter(Context context, List<UserQuestions> userQuestions){
        super(context, 0, userQuestions);
        this.context = context;
        this.userQuestions = userQuestions;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItems = convertView;

        if(listItems == null){
            listItems = LayoutInflater.from(this.context).inflate(R.layout.activity_row__list, parent, false);
        }
        UserQuestions questions = userQuestions.get(position);

        TextView id = (TextView)listItems.findViewById(R.id.txtNumber);
        id.setText(String.valueOf(questions.getId()));

        TextView questionsUser = (TextView)listItems.findViewById(R.id.txtQuestion);
        questionsUser.setText(questions.getQuestion());

        return listItems;
    }
}
