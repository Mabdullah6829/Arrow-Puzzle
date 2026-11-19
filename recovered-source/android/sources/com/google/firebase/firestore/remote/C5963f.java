package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p030R.AbstractC0548c;
import p030R.AbstractC0562j;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5963f implements OnCompleteListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23941s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23942t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23943u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23944v;

    public /* synthetic */ C5963f(Task task, AbstractC0548c abstractC0548c, Task task2) {
        this.f23941s = 0;
        this.f23942t = task;
        this.f23944v = abstractC0548c;
        this.f23943u = task2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f23941s) {
            case 0:
                FirestoreCallCredentials.lambda$applyRequestMetadata$0((Task) this.f23942t, (AbstractC0548c) this.f23944v, (Task) this.f23943u, task);
                break;
            case 1:
                ((FirestoreChannel) this.f23942t).lambda$runBidiStreamingRpc$0((AbstractC0562j[]) this.f23943u, (IncomingStreamObserver) this.f23944v, task);
                break;
            case 2:
                ((FirestoreChannel) this.f23942t).lambda$runRpc$2((TaskCompletionSource) this.f23943u, this.f23944v, task);
                break;
            default:
                ((FirestoreChannel) this.f23942t).lambda$runStreamingResponseRpc$1((FirestoreChannel.StreamingListener) this.f23943u, this.f23944v, task);
                break;
        }
    }

    public /* synthetic */ C5963f(FirestoreChannel firestoreChannel, Object obj, Object obj2, int i2) {
        this.f23941s = i2;
        this.f23942t = firestoreChannel;
        this.f23943u = obj;
        this.f23944v = obj2;
    }
}
