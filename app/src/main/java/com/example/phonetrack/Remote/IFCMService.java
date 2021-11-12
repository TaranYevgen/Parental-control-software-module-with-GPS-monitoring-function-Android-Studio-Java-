package com.example.phonetrack.Remote;

import com.example.phonetrack.Model.MyResponse;
import com.example.phonetrack.Model.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers(
            {
                "Content-Type: application/json",
                    "Authorization:key=AUTHIRIZATION-KEY"
            }
    )

    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);
}
