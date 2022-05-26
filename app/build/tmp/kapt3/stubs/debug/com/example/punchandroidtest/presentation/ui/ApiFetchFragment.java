package com.example.punchandroidtest.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/example/punchandroidtest/presentation/ui/ApiFetchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/punchandroidtest/databinding/FragmentApiFetchBinding;", "connectivityLiveData", "Lcom/example/punchandroidtest/util/ConnectivityLiveData;", "realEstateAdapter", "Lcom/example/punchandroidtest/presentation/adapter/RealEstateAdapter;", "realEstateList", "", "Lcom/example/punchandroidtest/data/model/RealEstate;", "[Lcom/example/punchandroidtest/data/model/RealEstate;", "receiver", "Lcom/example/punchandroidtest/util/NetworkReceiver;", "viewModel", "Lcom/example/punchandroidtest/viewmodel/RealEstateViewModel;", "getViewModel", "()Lcom/example/punchandroidtest/viewmodel/RealEstateViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideProgressBar", "", "loadPage", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showProgressBar", "updateConnectedFlags", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ApiFetchFragment extends androidx.fragment.app.Fragment {
    private com.example.punchandroidtest.presentation.adapter.RealEstateAdapter realEstateAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.punchandroidtest.data.model.RealEstate[] realEstateList;
    private com.example.punchandroidtest.databinding.FragmentApiFetchBinding binding;
    private com.example.punchandroidtest.util.NetworkReceiver receiver;
    private com.example.punchandroidtest.util.ConnectivityLiveData connectivityLiveData;
    
    public ApiFetchFragment() {
        super();
    }
    
    private final com.example.punchandroidtest.viewmodel.RealEstateViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void loadPage() {
    }
    
    private final void updateConnectedFlags() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
}