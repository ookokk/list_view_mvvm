package com.kotlin.task.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010&\u001a\u00020\u001a2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011J\b\u0010-\u001a\u00020)H\u0014J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0011H\u0002R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u00060"}, d2 = {"Lcom/kotlin/task/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/kotlin/task/repository/MainRepository;", "application", "Landroid/app/Application;", "(Lcom/kotlin/task/repository/MainRepository;Landroid/app/Application;)V", "allProfileList", "Landroidx/lifecycle/LiveData;", "", "Lcom/kotlin/task/database/entity/ProfileList;", "getAllProfileList", "()Landroidx/lifecycle/LiveData;", "setAllProfileList", "(Landroidx/lifecycle/LiveData;)V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getWeatherDetails", "Lcom/kotlin/task/model/WeatherData;", "getGetWeatherDetails", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "loading", "", "getLoading", "repository", "Lcom/kotlin/task/database/repository/ProfileRepository;", "getRepository", "()Lcom/kotlin/task/database/repository/ProfileRepository;", "addProfileList", "profileList", "getAllData", "", "getWeatherDetail", "lat", "long", "onCleared", "onError", "message", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.kotlin.task.repository.MainRepository mainRepository = null;
    private final android.app.Application application = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kotlin.task.model.WeatherData> getWeatherDetails = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.kotlin.task.database.entity.ProfileList>> allProfileList;
    @org.jetbrains.annotations.NotNull()
    private final com.kotlin.task.database.repository.ProfileRepository repository = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.kotlin.task.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kotlin.task.model.WeatherData> getGetWeatherDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kotlin.task.database.entity.ProfileList>> getAllProfileList() {
        return null;
    }
    
    public final void setAllProfileList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.kotlin.task.database.entity.ProfileList>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.task.database.repository.ProfileRepository getRepository() {
        return null;
    }
    
    public final void getAllData() {
    }
    
    public final void getWeatherDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_1663806) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addProfileList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.task.database.entity.ProfileList> profileList) {
        return null;
    }
    
    private final void onError(java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}