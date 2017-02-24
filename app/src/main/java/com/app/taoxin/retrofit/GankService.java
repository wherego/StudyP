package com.app.taoxin.retrofit;


import com.app.taoxin.model.GanHuo;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface GankService {
    @GET("api/data/{type}/{count}/{page}")
    Observable<GanHuo> getGanHuo(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );
}
