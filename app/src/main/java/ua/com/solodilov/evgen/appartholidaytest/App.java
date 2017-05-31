package ua.com.solodilov.evgen.appartholidaytest;

import android.app.Application;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.com.solodilov.evgen.appartholidaytest.api.HolidayAPI;

/**
 * Created by jack on 31.05.17.
 */

public class App extends Application {

    private static HolidayAPI mHolydayApi;
    private Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(Const.BASE_URL) //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .client(client)
                .build();
        mHolydayApi = retrofit.create(HolidayAPI.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    public static HolidayAPI getApi() {
        return mHolydayApi;
    }
}
