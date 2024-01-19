package com.kotlin.task.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/task/repository/MainRepository;", "", "retrofitService", "Lcom/kotlin/task/service/RetrofitService;", "weatherRetrofitService", "Lcom/kotlin/task/service/WeatherRetrofitService;", "(Lcom/kotlin/task/service/RetrofitService;Lcom/kotlin/task/service/WeatherRetrofitService;)V", "getAllData", "Lretrofit2/Response;", "Lcom/kotlin/task/model/ProfileData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherDetail", "Lcom/kotlin/task/model/WeatherData;", "lat", "", "long", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRepository {
    private final com.kotlin.task.service.RetrofitService retrofitService = null;
    private final com.kotlin.task.service.WeatherRetrofitService weatherRetrofitService = null;
    
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.task.service.RetrofitService retrofitService, @org.jetbrains.annotations.NotNull()
    com.kotlin.task.service.WeatherRetrofitService weatherRetrofitService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kotlin.task.model.ProfileData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kotlin.task.model.WeatherData>> continuation) {
        return null;
    }
}