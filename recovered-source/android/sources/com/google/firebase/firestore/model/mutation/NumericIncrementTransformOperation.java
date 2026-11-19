package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class NumericIncrementTransformOperation implements TransformOperation {
    private C0393Z0 operand;

    public NumericIncrementTransformOperation(C0393Z0 c0393z0) {
        Assert.hardAssert(Values.isNumber(c0393z0), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.operand = c0393z0;
    }

    private double operandAsDouble() {
        if (Values.isDouble(this.operand)) {
            return this.operand.m748x();
        }
        if (Values.isInteger(this.operand)) {
            return this.operand.m732B();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long operandAsLong() {
        if (Values.isDouble(this.operand)) {
            return (long) this.operand.m748x();
        }
        if (Values.isInteger(this.operand)) {
            return this.operand.m732B();
        }
        throw Assert.fail("Expected 'operand' to be of Number type, but was " + this.operand.getClass().getCanonicalName(), new Object[0]);
    }

    private long safeIncrement(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) >= 0) {
            return j4;
        }
        if (j4 >= 0) {
            return Long.MIN_VALUE;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToLocalView(@Nullable C0393Z0 c0393z0, Timestamp timestamp) {
        C0393Z0 c0393z0ComputeBaseValue = computeBaseValue(c0393z0);
        if (Values.isInteger(c0393z0ComputeBaseValue) && Values.isInteger(this.operand)) {
            long jSafeIncrement = safeIncrement(c0393z0ComputeBaseValue.m732B(), operandAsLong());
            C0389X0 c0389x0M714O = C0393Z0.m714O();
            c0389x0M714O.m695m(jSafeIncrement);
            return (C0393Z0) c0389x0M714O.m12341build();
        }
        if (Values.isInteger(c0393z0ComputeBaseValue)) {
            double dM732B = c0393z0ComputeBaseValue.m732B() + operandAsDouble();
            C0389X0 c0389x0M714O2 = C0393Z0.m714O();
            c0389x0M714O2.m691g(dM732B);
            return (C0393Z0) c0389x0M714O2.m12341build();
        }
        Assert.hardAssert(Values.isDouble(c0393z0ComputeBaseValue), "Expected NumberValue to be of type DoubleValue, but was ", c0393z0.getClass().getCanonicalName());
        double dM748x = c0393z0ComputeBaseValue.m748x() + operandAsDouble();
        C0389X0 c0389x0M714O3 = C0393Z0.m714O();
        c0389x0M714O3.m691g(dM748x);
        return (C0393Z0) c0389x0M714O3.m12341build();
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 computeBaseValue(@Nullable C0393Z0 c0393z0) {
        if (Values.isNumber(c0393z0)) {
            return c0393z0;
        }
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m695m(0L);
        return (C0393Z0) c0389x0M714O.m12341build();
    }

    public C0393Z0 getOperand() {
        return this.operand;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToRemoteDocument(@Nullable C0393Z0 c0393z0, C0393Z0 c0393z1) {
        return c0393z1;
    }
}
