package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldPath {
    private final com.google.firebase.firestore.model.FieldPath internalPath;
    private static final Pattern RESERVED = Pattern.compile("[~*/\\[\\]]");
    private static final FieldPath DOCUMENT_ID_INSTANCE = new FieldPath(com.google.firebase.firestore.model.FieldPath.KEY_PATH);

    private FieldPath(@NonNull List<String> list) {
        this.internalPath = com.google.firebase.firestore.model.FieldPath.fromSegments(list);
    }

    @NonNull
    public static FieldPath documentId() {
        return DOCUMENT_ID_INSTANCE;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static FieldPath fromDotSeparatedPath(@NonNull String str) {
        Preconditions.checkNotNull(str, "Provided field path must not be null.");
        Preconditions.checkArgument(!RESERVED.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return m11255of(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: of */
    public static FieldPath m11255of(String... strArr) {
        Preconditions.checkArgument(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            boolean z = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder("Invalid field name at argument ");
            i2++;
            sb.append(i2);
            sb.append(". Field names must not be null or empty.");
            Preconditions.checkArgument(z, sb.toString(), new Object[0]);
        }
        return new FieldPath((List<String>) Arrays.asList(strArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldPath.class != obj.getClass()) {
            return false;
        }
        return this.internalPath.equals(((FieldPath) obj).internalPath);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.google.firebase.firestore.model.FieldPath getInternalPath() {
        return this.internalPath;
    }

    public int hashCode() {
        return this.internalPath.hashCode();
    }

    public String toString() {
        return this.internalPath.toString();
    }

    private FieldPath(@NonNull com.google.firebase.firestore.model.FieldPath fieldPath) {
        this.internalPath = fieldPath;
    }
}
