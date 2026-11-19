package com.google.android.material.timepicker;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5541c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23520s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23521t;

    public /* synthetic */ RunnableC5541c(Object obj, int i2) {
        this.f23520s = i2;
        this.f23521t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23520s) {
            case 0:
                ((RadialViewGroup) this.f23521t).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f23521t).lambda$onViewCreated$3();
                break;
        }
    }
}
