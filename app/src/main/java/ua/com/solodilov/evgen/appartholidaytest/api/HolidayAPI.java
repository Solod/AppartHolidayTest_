package ua.com.solodilov.evgen.appartholidaytest.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ua.com.solodilov.evgen.appartholidaytest.model.City;

public interface HolidayAPI {
    @GET("tours/suggests")
    Call<City> getDataCity(@Query("text") String nameСity, @Query("access_token") String token);
}
