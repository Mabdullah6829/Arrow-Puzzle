package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePath<B extends BasePath<B>> implements Comparable<B>, Iterable<String> {
    final List<String> segments;

    public BasePath(List<String> list) {
        this.segments = list;
    }

    private static int compareSegments(String str, String str2) {
        boolean zIsNumericId = isNumericId(str);
        boolean zIsNumericId2 = isNumericId(str2);
        if (zIsNumericId && !zIsNumericId2) {
            return -1;
        }
        if (zIsNumericId || !zIsNumericId2) {
            return (zIsNumericId && zIsNumericId2) ? Long.compare(extractNumericId(str), extractNumericId(str2)) : Util.compareUtf8Strings(str, str2);
        }
        return 1;
    }

    private static long extractNumericId(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    private static boolean isNumericId(String str) {
        return str.startsWith("__id") && str.endsWith("__");
    }

    public B append(String str) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.add(str);
        return (B) createPathWithSegments(arrayList);
    }

    public abstract String canonicalString();

    public abstract B createPathWithSegments(List<String> list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    public String getFirstSegment() {
        return this.segments.get(0);
    }

    public String getLastSegment() {
        return this.segments.get(length() - 1);
    }

    public String getSegment(int i2) {
        return this.segments.get(i2);
    }

    public int hashCode() {
        return this.segments.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public boolean isImmediateParentOf(B b) {
        if (length() + 1 != b.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (!getSegment(i2).equals(b.getSegment(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrefixOf(B b) {
        if (length() > b.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (!getSegment(i2).equals(b.getSegment(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<String> iterator() {
        return this.segments.iterator();
    }

    public B keepFirst(int i2) {
        return (B) createPathWithSegments(this.segments.subList(0, i2));
    }

    public int length() {
        return this.segments.size();
    }

    public B popFirst() {
        return (B) popFirst(1);
    }

    public B popLast() {
        return (B) createPathWithSegments(this.segments.subList(0, length() - 1));
    }

    public String toString() {
        return canonicalString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull B b) {
        int length = length();
        int length2 = b.length();
        for (int i2 = 0; i2 < length && i2 < length2; i2++) {
            int iCompareSegments = compareSegments(getSegment(i2), b.getSegment(i2));
            if (iCompareSegments != 0) {
                return iCompareSegments;
            }
        }
        return Integer.compare(length, length2);
    }

    public B popFirst(int i2) {
        int length = length();
        Assert.hardAssert(length >= i2, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i2), Integer.valueOf(length));
        return (B) createPathWithSegments(this.segments.subList(i2, length));
    }

    public B append(B b) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.addAll(b.segments);
        return (B) createPathWithSegments(arrayList);
    }
}
