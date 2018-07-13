package com.example.lap11799.mvp;

import java.util.List;

public class DataPresenter implements DataConstract.IDataPresenter, DataListener {

    private DataConstract.IDataView photosView;
    private DataInteractor dataInteractor;

    public DataPresenter(DataConstract.IDataView photosView, DataInteractor dataInteractor) {
        this.photosView = photosView;
        this.dataInteractor = dataInteractor;
    }


    @Override
    public void getData() {
        photosView.showProgressBar();
        dataInteractor.loadData(this);
    }

    @Override
    public void onSuccess(List<Data> data) {
        photosView.showData(data);
        photosView.hideProgressBar();
    }

    @Override
    public void onFailure(String message) {
        photosView.showError(message);
        photosView.hideProgressBar();
    }
}
