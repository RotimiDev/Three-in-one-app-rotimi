package com.example.punchandroidtest.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010&\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010!H\u0002J\b\u0010\'\u001a\u00020\u0010H\u0002J\u0016\u0010(\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/punchandroidtest/presentation/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "_binding", "Lcom/example/punchandroidtest/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/punchandroidtest/databinding/FragmentHomeBinding;", "dragListener", "Landroid/view/View$OnDragListener;", "noteAdapter", "Lcom/example/punchandroidtest/presentation/adapter/NoteAdapter;", "notesViewModel", "Lcom/example/punchandroidtest/viewmodel/NoteViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "onViewCreated", "view", "searchNote", "setUpRecyclerView", "updateUI", "note", "", "Lcom/example/punchandroidtest/data/model/Note;", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private com.example.punchandroidtest.databinding.FragmentHomeBinding _binding;
    private com.example.punchandroidtest.viewmodel.NoteViewModel notesViewModel;
    private com.example.punchandroidtest.presentation.adapter.NoteAdapter noteAdapter;
    private final android.view.View.OnDragListener dragListener = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.punchandroidtest.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void updateUI(java.util.List<com.example.punchandroidtest.data.model.Note> note) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
        return false;
    }
    
    private final void searchNote(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}