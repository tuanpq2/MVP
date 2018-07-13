package com.example.lap11799.mvp;

import java.util.List;

public interface DataListener {
    void onSuccess(List<Data> data);
    void onFailure(String message);
}
