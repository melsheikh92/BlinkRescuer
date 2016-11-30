package com.beanit.mahmoud.blinkrescuer.services;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Mahmoud on 30/11/2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {


        String refreshedToken = FirebaseInstanceId.getInstance().getToken();


    }


}
