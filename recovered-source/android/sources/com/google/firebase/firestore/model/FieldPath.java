package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldPath extends BasePath<FieldPath> {
    public static final FieldPath KEY_PATH = fromSingleSegment(DocumentKey.KEY_FIELD_NAME);
    public static final String UPDATE_TIME_NAME = "__update_time__";
    public static final FieldPath UPDATE_TIME_PATH = fromSingleSegment(UPDATE_TIME_NAME);
    public static final String CREATE_TIME_NAME = "__create_time__";
    public static final FieldPath CREATE_TIME_PATH = fromSingleSegment(CREATE_TIME_NAME);
    public static final FieldPath EMPTY_PATH = new FieldPath(Collections.EMPTY_LIST);

    private FieldPath(List<String> list) {
        super(list);
    }

    @NonNull
    public static FieldPath fromSegments(@NonNull List<String> list) {
        return list.isEmpty() ? EMPTY_PATH : new FieldPath(list);
    }

    public static FieldPath fromServerFormat(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\') {
                i2++;
                if (i2 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i2));
            } else if (cCharAt == '.') {
                if (z) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z = !z;
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new FieldPath(arrayList);
    }

    public static FieldPath fromSingleSegment(String str) {
        return new FieldPath(Collections.singletonList(str));
    }

    private static boolean isValidIdentifier(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public String canonicalString() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.segments.size(); i2++) {
            if (i2 > 0) {
                sb.append(".");
            }
            String strReplace = this.segments.get(i2).replace("\\", "\\\\").replace("`", "\\`");
            if (!isValidIdentifier(strReplace)) {
                strReplace = "`" + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public /* bridge */ /* synthetic */ BasePath createPathWithSegments(List list) {
        return createPathWithSegments((List<String>) list);
    }

    public boolean isKeyField() {
        return equals(KEY_PATH);
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public FieldPath createPathWithSegments(List<String> list) {
        return new FieldPath(list);
    }
}
