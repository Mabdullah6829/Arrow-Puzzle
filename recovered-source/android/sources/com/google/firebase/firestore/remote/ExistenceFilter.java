package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import p022N.C0423k;

/* JADX INFO: loaded from: classes2.dex */
public final class ExistenceFilter {
    private final int count;
    private C0423k unchangedNames;

    public ExistenceFilter(int i2) {
        this.count = i2;
    }

    public int getCount() {
        return this.count;
    }

    @Nullable
    public C0423k getUnchangedNames() {
        return this.unchangedNames;
    }

    public String toString() {
        return "ExistenceFilter{count=" + this.count + ", unchangedNames=" + this.unchangedNames + '}';
    }

    public ExistenceFilter(int i2, @Nullable C0423k c0423k) {
        this.count = i2;
        this.unchangedNames = c0423k;
    }
}
