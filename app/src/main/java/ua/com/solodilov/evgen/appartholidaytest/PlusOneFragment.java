package ua.com.solodilov.evgen.appartholidaytest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ua.com.solodilov.evgen.appartholidaytest.model.City;
import ua.com.solodilov.evgen.appartholidaytest.model.MyResponse;
import ua.com.solodilov.evgen.appartholidaytest.widget.SFTextView;

public class PlusOneFragment extends Fragment {

    @BindView(R.id.tv_country)
    protected SFTextView mCountry;
    @BindView(R.id.tv_cities)
    protected SFTextView mCity;
    @BindView(R.id.tv_price)
    protected SFTextView mPrice;
    @BindView(R.id.tv_data_day)
    protected SFTextView mDataDay;
    @BindView(R.id.tv_data_month)
    protected SFTextView mDataMonth;
    @BindView(R.id.tv_night_day)
    protected SFTextView mNightDay;
    @BindView(R.id.tv_night_month)
    protected SFTextView mNightMonth;
    @BindView(R.id.progress)
    protected ProgressBar mProgress;

    private final int MAX_ATTEMPTS = 3;
    private int mNumberOfAttempts = 0;

    private static final String CITY_NAME = "Шарм";

    public PlusOneFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        startGettingData();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void startGettingData() {
        mNumberOfAttempts++;
        Call<City> call = App.getApi().getDataCity(CITY_NAME, Const.GLOBAL_TOKEN);
        call.enqueue(new Callback<City>() {
                         @Override
                         public void onResponse(Call<City> call, Response<City> response) {
                             mNumberOfAttempts = 0;
                             if (response.body() != null) {
                                 City city = response.body();
                                 for (MyResponse r : city.getResponse()) {
                                     if (r.getType().equals("city")) {
                                         if (r.getCountryName() != null) {
                                             mCountry.setText(r.getCountryName());
                                             mCity.setText(r.getNameVn());
                                             mPrice.setText(r.getUah() + " " + getResources().getString(R.string.currency));
                                         }
                                     }
                                 }
                             }
                             mProgress.setVisibility(View.GONE);
                         }

                         @Override
                         public void onFailure(Call<City> call, Throwable t) {
                             if (mNumberOfAttempts < MAX_ATTEMPTS) {
                                 startGettingData();
                             } else {
                                 mProgress.setVisibility(View.GONE);
                                 Toast.makeText(getContext(), "Can not get data", Toast.LENGTH_LONG).show();
                             }
                         }
                     }
        );
    }
}
