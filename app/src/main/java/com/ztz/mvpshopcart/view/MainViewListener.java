package com.ztz.mvpshopcart.view;

import com.ztz.mvpshopcart.bean.ShopBean;

/**
 * Created by TR on 2017/11/22.
 */

public interface MainViewListener {
    void success(ShopBean bean);
    void failure(Exception e);
}
