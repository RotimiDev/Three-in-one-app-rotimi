package com.example.punchandroidtest.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/punchandroidtest/viewmodel/RealEstateViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/punchandroidtest/repository/RealEstateRepository;", "(Lcom/example/punchandroidtest/repository/RealEstateRepository;)V", "_realEstate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/punchandroidtest/util/Resource;", "", "Lcom/example/punchandroidtest/data/model/RealEstate;", "cachedRealEstate", "isSearchStaring", "", "isSearching", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setSearching", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "realEstate", "Landroidx/lifecycle/LiveData;", "getRealEstate", "()Landroidx/lifecycle/LiveData;", "handleRealEstateData", "realEstateData", "Lretrofit2/Response;", "loadPaginatedRealEstateList", "Lkotlinx/coroutines/Job;", "searchRealEstate", "", "query", "", "app_debug"})
public final class RealEstateViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.punchandroidtest.repository.RealEstateRepository repository = null;
    private androidx.lifecycle.MutableLiveData<com.example.punchandroidtest.util.Resource<java.util.List<com.example.punchandroidtest.data.model.RealEstate>>> _realEstate;
    private androidx.lifecycle.MutableLiveData<com.example.punchandroidtest.util.Resource<java.util.List<com.example.punchandroidtest.data.model.RealEstate>>> cachedRealEstate;
    private boolean isSearchStaring = true;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSearching;
    
    @javax.inject.Inject()
    public RealEstateViewModel(@org.jetbrains.annotations.NotNull()
    com.example.punchandroidtest.repository.RealEstateRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.punchandroidtest.util.Resource<java.util.List<com.example.punchandroidtest.data.model.RealEstate>>> getRealEstate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSearching() {
        return null;
    }
    
    public final void setSearching(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadPaginatedRealEstateList() {
        return null;
    }
    
    public final void searchRealEstate(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final com.example.punchandroidtest.util.Resource<java.util.List<com.example.punchandroidtest.data.model.RealEstate>> handleRealEstateData(retrofit2.Response<java.util.List<com.example.punchandroidtest.data.model.RealEstate>> realEstateData) {
        return null;
    }
}