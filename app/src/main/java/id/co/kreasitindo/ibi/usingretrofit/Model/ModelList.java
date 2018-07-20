package id.co.kreasitindo.ibi.usingretrofit.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelList {
    private List<UserQuestions> questionsList = new ArrayList<UserQuestions>();
    private Map<String, Object> additionalProperties = new HashMap<>();
    private ArrayList<HashMap<String, String>> properties = new ArrayList<>();

    public List<UserQuestions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<UserQuestions> questionsList) {
        this.questionsList = questionsList;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public ArrayList<HashMap<String, String>> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<HashMap<String, String>> properties) {
        this.properties = properties;
    }
}
