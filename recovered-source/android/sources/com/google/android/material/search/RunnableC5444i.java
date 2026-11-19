package com.google.android.material.search;

/* JADX INFO: renamed from: com.google.android.material.search.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5444i implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23469s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ SearchViewAnimationHelper f23470t;

    public /* synthetic */ RunnableC5444i(SearchViewAnimationHelper searchViewAnimationHelper, int i2) {
        this.f23469s = i2;
        this.f23470t = searchViewAnimationHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23469s) {
            case 0:
                this.f23470t.hide();
                break;
            case 1:
                this.f23470t.lambda$startShowAnimationExpand$0();
                break;
            default:
                this.f23470t.lambda$startShowAnimationTranslate$1();
                break;
        }
    }
}
