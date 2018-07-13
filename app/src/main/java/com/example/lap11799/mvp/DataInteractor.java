package com.example.lap11799.mvp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataInteractor {
    public void loadData(final DataListener listener){
        GetDataService service = RetrofitInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<Data>> call = service.getAllData();
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                listener.onFailure(t.getMessage());
            }
        });
    }
}
