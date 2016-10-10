package com.example.d.longayu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Whoareyou extends AppCompatActivity {
    //  public final static String EXTRA_MESSAGE = "com.example.d.longayu.MESSAGE";
    // DatabaseHelper myDb;
 /* protected static final android.R.attr R = ; */
    //  private static Button user_sbm;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //  private GoogleApiClient client;

    //   @Override
    public Button signup;

    public void init() {
        signup = (Button) findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Whoareyou.this,Signup.class);
                startActivity(intent);
            }
        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoareyou);
        init();
        //  myDb = new DatabaseHelper(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //  client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        // onclickuserlistener();
    }
}

 //   public void onclickuserlistener() {
   //     user_sbm = (Button) findViewById(R.id.button);
     //   user_sbm.setOnClickListener(

       //         new View.OnClickListener() {

         //           @Override
           //         public void onClick(View v) {
             //           Intent user = new Intent("com.example.d.longayu.Signup");
               //         startActivity(user);
                 //   }
                //}
      //  );
   // }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    public Action getIndexApiAction() {
  //      Thing object = new Thing.Builder()
    //            .setName("Whoareyou Page") // TODO: Define a title for the content shown.
      //          // TODO: Make sure this auto-generated URL is correct.
        //        .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
          //      .build();
    //    return new Action.Builder(Action.TYPE_VIEW)
      //          .setObject(object)
        //        .setActionStatus(Action.STATUS_TYPE_COMPLETED)
          //      .build();
  //  }

   // @Override
  //  public void onStart() {
    //    super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
      //  client.connect();
       // AppIndex.AppIndexApi.start(client, getIndexApiAction());
  //  }

   // @Override
   // public void onStop() {
     //   super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
       // AppIndex.AppIndexApi.end(client, getIndexApiAction());
       // client.disconnect();
   // }
 //         Button signup = (Button)findViewById(R.id.button);
   // public void init(
     //     signup.etOnClickListener(new View.OnClickListener()){




     //   public void onClick(View view){
       //     Intent intent = new Intent(Whoareyou.this, Signup.class);
            //   EditText editText = (EditText) findViewById(R.id.button);
            //   String message = editText.getText().toString();
            //  intent.putExtra(EXTRA_MESSAGE, message);
         //   startActivity(intent);
       // }


