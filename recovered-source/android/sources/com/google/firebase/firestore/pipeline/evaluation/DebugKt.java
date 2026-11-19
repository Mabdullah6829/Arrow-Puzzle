package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugKt {
    private static final InterfaceC6498l evaluateIsError = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 1) {
                throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    try {
                        return EvaluateResult.Companion.m12330boolean(((EvaluateResult) interfaceC6498l.invoke(input)).isError());
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateError = new C0059r(18);
    private static final InterfaceC6498l evaluateExists = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 1) {
                throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$2.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    try {
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (AbstractC6452k.m12177a(evaluateResult, EvaluateResultError.INSTANCE)) {
                            return evaluateResult;
                        }
                        if (AbstractC6452k.m12177a(evaluateResult, EvaluateResultUnset.INSTANCE)) {
                            return EvaluateResult.Companion.getFALSE();
                        }
                        if (evaluateResult instanceof EvaluateResultValue) {
                            return EvaluateResult.Companion.getTRUE();
                        }
                        throw new NoWhenBranchMatchedException();
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateIsAbsent = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$3
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 1) {
                throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.DebugKt$special$$inlined$unaryFunction$3.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    try {
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (AbstractC6452k.m12177a(evaluateResult, EvaluateResultError.INSTANCE)) {
                            return evaluateResult;
                        }
                        if (AbstractC6452k.m12177a(evaluateResult, EvaluateResultUnset.INSTANCE)) {
                            return EvaluateResult.Companion.getTRUE();
                        }
                        if (evaluateResult instanceof EvaluateResultValue) {
                            return EvaluateResult.Companion.getFALSE();
                        }
                        throw new NoWhenBranchMatchedException();
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateError$lambda$2(List list) {
        AbstractC6452k.m12181e(list, "<unused var>");
        return new C0059r(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResultError evaluateError$lambda$2$lambda$1(MutableDocument mutableDocument) {
        AbstractC6452k.m12181e(mutableDocument, "<unused var>");
        return EvaluateResultError.INSTANCE;
    }

    public static final InterfaceC6498l getEvaluateError() {
        return evaluateError;
    }

    public static final InterfaceC6498l getEvaluateExists() {
        return evaluateExists;
    }

    public static final InterfaceC6498l getEvaluateIsAbsent() {
        return evaluateIsAbsent;
    }

    public static final InterfaceC6498l getEvaluateIsError() {
        return evaluateIsError;
    }
}
