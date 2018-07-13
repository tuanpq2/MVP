package com.example.lap11799.mvp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/v2/5b4815072f0000a200481717")
    Call<List<Data>> getAllData();
}
