package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class Bound {
    private final boolean inclusive;
    private final List<C0393Z0> position;

    public Bound(List<C0393Z0> list, boolean z) {
        this.position = list;
        this.inclusive = z;
    }

    private int compareToDocument(List<OrderBy> list, Document document) {
        int iCompare;
        Assert.hardAssert(this.position.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i2 = 0;
        for (int i3 = 0; i3 < this.position.size(); i3++) {
            OrderBy orderBy = list.get(i3);
            C0393Z0 c0393z0 = this.position.get(i3);
            if (orderBy.field.equals(FieldPath.KEY_PATH)) {
                Assert.hardAssert(Values.isReferenceValue(c0393z0), "Bound has a non-key value where the key path is being used %s", c0393z0);
                iCompare = DocumentKey.fromName(c0393z0.m734D()).compareTo(document.getKey());
            } else {
                C0393Z0 field = document.getField(orderBy.getField());
                Assert.hardAssert(field != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iCompare = Values.compare(c0393z0, field);
            }
            if (orderBy.getDirection().equals(OrderBy.Direction.DESCENDING)) {
                iCompare *= -1;
            }
            i2 = iCompare;
            if (i2 != 0) {
                return i2;
            }
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Bound.class == obj.getClass()) {
            Bound bound = (Bound) obj;
            if (this.inclusive == bound.inclusive && this.position.equals(bound.position)) {
                return true;
            }
        }
        return false;
    }

    public List<C0393Z0> getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + ((this.inclusive ? 1 : 0) * 31);
    }

    public boolean isInclusive() {
        return this.inclusive;
    }

    public String positionString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C0393Z0 c0393z0 : this.position) {
            if (!z) {
                sb.append(",");
            }
            sb.append(Values.canonicalId(c0393z0));
            z = false;
        }
        return sb.toString();
    }

    public boolean sortsAfterDocument(List<OrderBy> list, Document document) {
        int iCompareToDocument = compareToDocument(list, document);
        if (this.inclusive) {
            return iCompareToDocument >= 0;
        }
        return iCompareToDocument > 0;
    }

    public boolean sortsBeforeDocument(List<OrderBy> list, Document document) {
        int iCompareToDocument = compareToDocument(list, document);
        if (this.inclusive) {
            return iCompareToDocument <= 0;
        }
        return iCompareToDocument < 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.inclusive);
        sb.append(", position=");
        for (int i2 = 0; i2 < this.position.size(); i2++) {
            if (i2 > 0) {
                sb.append(" and ");
            }
            sb.append(Values.canonicalId(this.position.get(i2)));
        }
        sb.append(")");
        return sb.toString();
    }
}
