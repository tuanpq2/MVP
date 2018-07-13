package com.example.lap11799.mvp;

import java.util.List;

public interface DataConstract {
    interface IDataView{
        void showProgressBar();
        void hideProgressBar();
        void showData(List<Data> data);
        void showError(String message);
    }
    interface IDataPresenter{
        void getData();
    }
}