package com.example.punchandroidtest.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/punchandroidtest/presentation/adapter/NoteAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/punchandroidtest/data/model/Note;", "Lcom/example/punchandroidtest/presentation/adapter/NoteAdapter$NoteViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "NoteViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.punchandroidtest.data.model.Note, com.example.punchandroidtest.presentation.adapter.NoteAdapter.NoteViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.punchandroidtest.data.model.Note, kotlin.Unit> onItemClick = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.punchandroidtest.data.model.Note> differCallback = null;
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.punchandroidtest.data.model.Note, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.punchandroidtest.presentation.adapter.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.punchandroidtest.presentation.adapter.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/punchandroidtest/presentation/adapter/NoteAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/punchandroidtest/databinding/NoteLayoutAdapterBinding;", "onItemClick", "Lkotlin/Function1;", "Lcom/example/punchandroidtest/data/model/Note;", "", "(Lcom/example/punchandroidtest/databinding/NoteLayoutAdapterBinding;Lkotlin/jvm/functions/Function1;)V", "getItemBinding", "()Lcom/example/punchandroidtest/databinding/NoteLayoutAdapterBinding;", "bind", "note", "app_debug"})
    public static final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.punchandroidtest.databinding.NoteLayoutAdapterBinding itemBinding = null;
        private final kotlin.jvm.functions.Function1<com.example.punchandroidtest.data.model.Note, kotlin.Unit> onItemClick = null;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.databinding.NoteLayoutAdapterBinding itemBinding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.punchandroidtest.data.model.Note, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.punchandroidtest.databinding.NoteLayoutAdapterBinding getItemBinding() {
            return null;
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.data.model.Note note) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/punchandroidtest/presentation/adapter/NoteAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/punchandroidtest/data/model/Note;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.punchandroidtest.data.model.Note> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.punchandroidtest.presentation.adapter.NoteAdapter.DiffCallback INSTANCE = null;
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.data.model.Note oldItem, @org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.data.model.Note newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.data.model.Note oldItem, @org.jetbrains.annotations.NotNull()
        com.example.punchandroidtest.data.model.Note newItem) {
            return false;
        }
    }
}