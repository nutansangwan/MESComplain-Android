package com.example.nutan.mescomplain;

//import com.squareup.http.Response;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public interface MESServices  {
//    /**
//     * Creates an Observable with a Function to execute when it is subscribed to.
//     * <p>
//     * <em>Note:</em> Use {@link #create(OnSubscribe)} to create an Observable, instead of this constructor,
//     * unless you specifically have a need for inheritance.
//     *
//     * @param f {@link OnSubscribe} to be executed when {@link #subscribe(Subscriber)} is called
//     */
//    protected MESServices(OnSubscribe<MESServices> f) {
//        super(f);
//    }

   @POST("/user/sign_in")
    Observable<Response> userSignIn(@Body User user);

}
