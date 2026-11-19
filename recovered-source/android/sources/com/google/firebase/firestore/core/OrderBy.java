package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderBy {
    private final Direction direction;
    final FieldPath field;

    public enum Direction {
        ASCENDING(1),
        DESCENDING(-1);

        private final int comparisonModifier;

        Direction(int i2) {
            this.comparisonModifier = i2;
        }

        public int getComparisonModifier() {
            return this.comparisonModifier;
        }
    }

    private OrderBy(Direction direction, FieldPath fieldPath) {
        this.direction = direction;
        this.field = fieldPath;
    }

    public static OrderBy getInstance(Direction direction, FieldPath fieldPath) {
        return new OrderBy(direction, fieldPath);
    }

    public int compare(Document document, Document document2) {
        int comparisonModifier;
        int iCompare;
        if (this.field.equals(FieldPath.KEY_PATH)) {
            comparisonModifier = this.direction.getComparisonModifier();
            iCompare = document.getKey().compareTo(document2.getKey());
        } else {
            C0393Z0 field = document.getField(this.field);
            C0393Z0 field2 = document2.getField(this.field);
            comparisonModifier = this.direction.getComparisonModifier();
            iCompare = Values.compare(field, field2);
        }
        return iCompare * comparisonModifier;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof OrderBy)) {
            OrderBy orderBy = (OrderBy) obj;
            if (this.direction == orderBy.direction && this.field.equals(orderBy.field)) {
                return true;
            }
        }
        return false;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public FieldPath getField() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode() + ((this.direction.hashCode() + 899) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.direction == Direction.ASCENDING ? "" : "-");
        sb.append(this.field.canonicalString());
        return sb.toString();
    }
}
