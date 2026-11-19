package com.google.android.material.listitem;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class ListItemViewHolder extends RecyclerView.ViewHolder {

    @NonNull
    private final ListItemLayout listItemLayout;

    public ListItemViewHolder(@NonNull View view) {
        super(view);
        this.listItemLayout = findListItemLayout();
    }

    @NonNull
    private ListItemLayout findListItemLayout() {
        View view = this.itemView;
        if (view instanceof ListItemLayout) {
            return (ListItemLayout) view;
        }
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ((ViewGroup) this.itemView).getChildAt(i2);
                if (childAt instanceof ListItemLayout) {
                    return (ListItemLayout) childAt;
                }
            }
        }
        throw new IllegalStateException("Didn't find ListItemLayout in root itemView or among itemView's children.");
    }

    public void bind() {
        bind(getBindingAdapterPosition(), getBindingAdapter().getItemCount());
    }

    public void bind(int i2, int i3) {
        if (i2 == -1 || i3 == 0) {
            return;
        }
        this.listItemLayout.updateAppearance(i2, i3);
    }

    public void bind(int i2) {
        this.listItemLayout.updateAppearance(i2);
    }
}
