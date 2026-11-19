package com.google.android.material.textfield;

/* JADX INFO: renamed from: com.google.android.material.textfield.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5518d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23509s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23510t;

    public /* synthetic */ RunnableC5518d(Object obj, int i2) {
        this.f23509s = i2;
        this.f23510t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23509s) {
            case 0:
                ((ClearTextEndIconDelegate) this.f23510t).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f23510t).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f23510t).lambda$onGlobalLayout$1();
                break;
        }
    }
}
