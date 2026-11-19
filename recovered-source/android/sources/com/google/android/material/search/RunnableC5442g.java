package com.google.android.material.search;

/* JADX INFO: renamed from: com.google.android.material.search.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5442g implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23465s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ SearchView f23466t;

    public /* synthetic */ RunnableC5442g(SearchView searchView, int i2) {
        this.f23465s = i2;
        this.f23466t = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23465s) {
            case 0:
                this.f23466t.lambda$requestFocusAndShowKeyboardIfNeeded$9();
                break;
            case 1:
                this.f23466t.lambda$clearFocusAndHideKeyboard$11();
                break;
            case 2:
                this.f23466t.lambda$requestFocusAndShowKeyboard$10();
                break;
            case 3:
                this.f23466t.show();
                break;
            default:
                this.f23466t.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
