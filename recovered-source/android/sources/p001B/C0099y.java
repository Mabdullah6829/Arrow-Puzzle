package p001B;

import android.content.Context;
import android.text.Editable;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.util.BiFunction;
import com.google.firebase.firestore.util.IntFunction;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Util;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayList;
import p030R.AbstractC0562j;
import p063h.InterfaceC6359e;

/* JADX INFO: renamed from: B.y */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0099y implements InterfaceC0097w, Interpolator, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, OnFailureListener, InterfaceC6359e, ImmutableSortedMap.Builder.KeyTranslator, Continuation, Listener, IntFunction, BiFunction, OnSuccessListener, ObjectConstructor {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f144s;

    public /* synthetic */ C0099y(int i2) {
        this.f144s = i2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        switch (this.f144s) {
            case 17:
                return FirebaseAppCheckTokenProvider.lambda$getToken$2(task);
            case 18:
                return FirestoreClient.lambda$getDocumentFromLocalCache$10(task);
            case 23:
                return Transaction.lambda$commit$1(task);
            case 25:
                return Util.lambda$static$0(task);
            case 26:
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
            default:
                return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return new ArrayList();
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f144s) {
            case 10:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case 11:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            case 12:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    @Override // p001B.InterfaceC0097w
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f2) {
        switch (this.f144s) {
            case 1:
                return Transition.lambda$getInterpolator$1(f2);
            case 2:
                return Transition.lambda$getInterpolator$2(f2);
            case 3:
                return Transition.lambda$getInterpolator$3(f2);
            case 4:
                return Transition.lambda$getInterpolator$4(f2);
            case 5:
                return Transition.lambda$getInterpolator$5(f2);
            case 6:
                return Transition.lambda$getInterpolator$6(f2);
            default:
                return Transition.lambda$getInterpolator$7(f2);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((AbstractC0562j) obj).halfClose();
    }

    @Override // com.google.firebase.firestore.util.Listener
    public void onValue(Object obj) {
        FirestoreClient.lambda$new$3((String) obj);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    public Object translate(Object obj) {
        return ImmutableSortedMap.Builder.lambda$static$0(obj);
    }

    @Override // com.google.firebase.firestore.util.IntFunction
    public Object apply(int i2) {
        return Query.lambda$convertToStages$0(i2);
    }

    @Override // p063h.InterfaceC6359e
    public Object apply(Object obj) {
        switch (this.f144s) {
            case 15:
                return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
            default:
                return ((MessagingClientEventExtension) obj).toByteArray();
        }
    }

    @Override // com.google.firebase.firestore.util.BiFunction
    public Object apply(Object obj, Object obj2) {
        Expression expression = (Expression) obj;
        switch (this.f144s) {
            case 21:
                return Expression.greaterThan(expression, obj2);
            default:
                return Expression.lessThan(expression, obj2);
        }
    }
}
