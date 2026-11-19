package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import java.util.Collections;
import java.util.List;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArrayTransformOperation implements TransformOperation {
    private final List<C0393Z0> elements;

    public static class Remove extends ArrayTransformOperation {
        public Remove(List<C0393Z0> list) {
            super(list);
        }

        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public C0393Z0 apply(@Nullable C0393Z0 c0393z0) {
            C0403d c0403dCoercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(c0393z0);
            for (C0393Z0 c0393z1 : getElements()) {
                int i2 = 0;
                while (i2 < c0403dCoercedFieldValuesArray.m790e()) {
                    if (c0403dCoercedFieldValuesArray.m789d(i2).equals(c0393z1)) {
                        c0403dCoercedFieldValuesArray.m791f(i2);
                    } else {
                        i2++;
                    }
                }
            }
            C0389X0 c0389x0M714O = C0393Z0.m714O();
            c0389x0M714O.m687c(c0403dCoercedFieldValuesArray);
            return (C0393Z0) c0389x0M714O.m12341build();
        }
    }

    public static class Union extends ArrayTransformOperation {
        public Union(List<C0393Z0> list) {
            super(list);
        }

        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public C0393Z0 apply(@Nullable C0393Z0 c0393z0) {
            C0403d c0403dCoercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(c0393z0);
            for (C0393Z0 c0393z1 : getElements()) {
                if (!Values.contains(c0403dCoercedFieldValuesArray, c0393z1)) {
                    c0403dCoercedFieldValuesArray.m788c(c0393z1);
                }
            }
            C0389X0 c0389x0M714O = C0393Z0.m714O();
            c0389x0M714O.m687c(c0403dCoercedFieldValuesArray);
            return (C0393Z0) c0389x0M714O.m12341build();
        }
    }

    public ArrayTransformOperation(List<C0393Z0> list) {
        this.elements = Collections.unmodifiableList(list);
    }

    public static C0403d coercedFieldValuesArray(@Nullable C0393Z0 c0393z0) {
        return Values.isArray(c0393z0) ? (C0403d) c0393z0.m745t().m12349toBuilder() : C0406e.m798k();
    }

    public abstract C0393Z0 apply(@Nullable C0393Z0 c0393z0);

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToLocalView(@Nullable C0393Z0 c0393z0, Timestamp timestamp) {
        return apply(c0393z0);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToRemoteDocument(@Nullable C0393Z0 c0393z0, C0393Z0 c0393z1) {
        return apply(c0393z0);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    @Nullable
    public C0393Z0 computeBaseValue(@Nullable C0393Z0 c0393z0) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.elements.equals(((ArrayTransformOperation) obj).elements);
    }

    public List<C0393Z0> getElements() {
        return this.elements;
    }

    public int hashCode() {
        return this.elements.hashCode() + (getClass().hashCode() * 31);
    }
}
