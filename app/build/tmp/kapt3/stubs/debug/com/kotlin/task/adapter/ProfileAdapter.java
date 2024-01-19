package com.kotlin.task.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\f\u001a\u00020\r2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0017J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001e\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/kotlin/task/adapter/ProfileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kotlin/task/adapter/ProfileAdapter$MainViewHolder;", "()V", "duplicateList", "Ljava/util/ArrayList;", "Lcom/kotlin/task/database/entity/ProfileList;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/kotlin/task/adapter/OnItemClickListener;", "profileList", "", "filterList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setProfileData", "profileLists", "MainViewHolder", "app_debug"})
public final class ProfileAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kotlin.task.adapter.ProfileAdapter.MainViewHolder> {
    private java.util.List<com.kotlin.task.database.entity.ProfileList> profileList;
    private java.util.ArrayList<com.kotlin.task.database.entity.ProfileList> duplicateList;
    private com.kotlin.task.adapter.OnItemClickListener listener;
    
    public ProfileAdapter() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setProfileData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.task.database.entity.ProfileList> profileLists, @org.jetbrains.annotations.NotNull()
    com.kotlin.task.adapter.OnItemClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kotlin.task.adapter.ProfileAdapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kotlin.task.adapter.ProfileAdapter.MainViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void filterList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kotlin.task.database.entity.ProfileList> filterList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/task/adapter/ProfileAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kotlin/task/databinding/ProfileListItemBinding;", "(Lcom/kotlin/task/databinding/ProfileListItemBinding;)V", "getBinding", "()Lcom/kotlin/task/databinding/ProfileListItemBinding;", "app_debug"})
    public static final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.kotlin.task.databinding.ProfileListItemBinding binding = null;
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        com.kotlin.task.databinding.ProfileListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kotlin.task.databinding.ProfileListItemBinding getBinding() {
            return null;
        }
    }
}