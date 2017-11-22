package com.ztz.mvpshopcart.presenter;

import com.ztz.mvpshopcart.bean.ShopBean;
import com.ztz.mvpshopcart.model.MainModel;
import com.ztz.mvpshopcart.model.MainModelCallBack;
import com.ztz.mvpshopcart.view.MainViewListener;

/**
 * Created by TR on 2017/11/22.
 */

public class MainPresenter {

    private MainViewListener listener;
    private MainModel mainModel;
    public MainPresenter(MainViewListener listener){
        this.listener = listener ;
        this.mainModel = new MainModel();
    }

    public void getData(){

        mainModel.getData(new MainModelCallBack() {

            @Override
            public void success(ShopBean bean) {

                if(listener != null){
                    listener.success(bean);
                }
            }

            @Override
            public void failure(Exception e) {

                if(listener != null){
                    listener.failure(e);
                }
            }
        });
    }
    /**
     * 防止内存泄漏
     */
    public void detach(){
        listener = null;
    }

}