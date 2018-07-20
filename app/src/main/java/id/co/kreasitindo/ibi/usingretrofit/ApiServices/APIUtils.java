package id.co.kreasitindo.ibi.usingretrofit.ApiServices;

public class APIUtils {
    private static String ROOT_URL = "http://prosertest.azurewebsites.net/";

    public static IApiServices getIApiServices(){
        return ApiClient.GetClient(ROOT_URL).create(IApiServices.class);
    }
}
