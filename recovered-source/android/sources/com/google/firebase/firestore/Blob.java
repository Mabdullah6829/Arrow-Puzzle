package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6248m;

/* JADX INFO: loaded from: classes2.dex */
public class Blob implements Comparable<Blob> {
    private final AbstractC6251n bytes;

    private Blob(AbstractC6251n abstractC6251n) {
        this.bytes = abstractC6251n;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Blob fromByteString(@NonNull AbstractC6251n abstractC6251n) {
        Preconditions.checkNotNull(abstractC6251n, "Provided ByteString must not be null.");
        return new Blob(abstractC6251n);
    }

    @NonNull
    public static Blob fromBytes(@NonNull byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Provided bytes array must not be null.");
        C6248m c6248m = AbstractC6251n.f24219t;
        return new Blob(AbstractC6251n.m11896j(bArr, 0, bArr.length));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Blob) && this.bytes.equals(((Blob) obj).bytes);
    }

    public int hashCode() {
        return this.bytes.hashCode();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public AbstractC6251n toByteString() {
        return this.bytes;
    }

    @NonNull
    public byte[] toBytes() {
        return this.bytes.m11897w();
    }

    @NonNull
    public String toString() {
        return "Blob { bytes=" + Util.toDebugString(this.bytes) + " }";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Blob blob) {
        return Util.compareByteStrings(this.bytes, blob.bytes);
    }
}
