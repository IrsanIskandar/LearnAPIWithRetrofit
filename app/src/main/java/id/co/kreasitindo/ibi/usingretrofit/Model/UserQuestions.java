package id.co.kreasitindo.ibi.usingretrofit.Model;

import  javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
public class UserQuestions {
    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("question")
    @Expose
    public String question;

    public UserQuestions(){ }

    public UserQuestions(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public UserQuestions(String question){
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
