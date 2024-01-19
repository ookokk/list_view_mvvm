package com.kotlin.task.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kotlin/task/view/DetailScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/kotlin/task/databinding/ActivityDetailScreenBinding;", "getBinding", "()Lcom/kotlin/task/databinding/ActivityDetailScreenBinding;", "setBinding", "(Lcom/kotlin/task/databinding/ActivityDetailScreenBinding;)V", "viewModel", "Lcom/kotlin/task/viewmodel/MainViewModel;", "checkForInternet", "", "context", "Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class DetailScreen extends androidx.appcompat.app.AppCompatActivity {
    public com.kotlin.task.databinding.ActivityDetailScreenBinding binding;
    private com.kotlin.task.viewmodel.MainViewModel viewModel;
    
    public DetailScreen() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.task.databinding.ActivityDetailScreenBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.kotlin.task.databinding.ActivityDetailScreenBinding p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
    private final boolean checkForInternet(android.content.Context context) {
        return false;
    }
}