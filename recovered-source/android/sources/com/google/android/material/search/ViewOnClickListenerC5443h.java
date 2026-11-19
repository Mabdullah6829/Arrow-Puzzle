package com.google.android.material.search;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.search.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5443h implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23467s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ SearchView f23468t;

    public /* synthetic */ ViewOnClickListenerC5443h(SearchView searchView, int i2) {
        this.f23467s = i2;
        this.f23468t = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23467s) {
            case 0:
                this.f23468t.lambda$setUpBackButton$2(view);
                break;
            case 1:
                this.f23468t.lambda$setUpClearButton$3(view);
                break;
            default:
                this.f23468t.lambda$setupWithSearchBar$8(view);
                break;
        }
    }
}
