package id.co.kreasitindo.ibi.usingretrofit.ApiServices;


import java.util.List;

import id.co.kreasitindo.ibi.usingretrofit.Model.UserQuestions;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiServices {

    @GET("api/info/questions")
    Call<List<UserQuestions>> GetUserQuestions();

}
