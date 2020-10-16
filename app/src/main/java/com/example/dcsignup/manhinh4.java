package com.example.dcsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Bundle;

public class manhinh4 extends AppCompatActivity {
    Button btnGoto;
    ImageView nprofile;
    ImageView nlogout;

    ListView listView;
    String mTitle[] = {"Hoa Hải Đường","Họa Mây","Ai Mang Cô Đơn Đi","Sầu Hồng Gai","Đánh Mất Em","Bông Hoa Đẹp Nhất","Bỏ Lỡ Một Người","Khác Biệt To Lớn","Chắc Vì Mình Chưa Tốt","Chạnh Lòng Thương Cô"};
    String mAgo[] = {"03:50","04:09","03:41","05:51","04:24","05:15","05:15","04:00","05:55","04:47"};
    String mDescription[]={"Jack","X2X","K-ICM,APJ","G5R Squad","Quang Đăng Trần","Quân A.P","Lê Bảo Bình","Trịnh Thăng Bình, Liz Kim Cương","Thanh Hưng","Huy Vạc,NonHanTa"};
    int images[] ={R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.ii,R.drawable.kk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh4);

        listView = findViewById(R.id.ListView);
        MyAdapter adapter = new MyAdapter( this, mTitle,mAgo,mDescription,images);
        listView.setAdapter(adapter);

        btnGoto =(Button)findViewById(R.id.buttonGoTo);
        btnGoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(manhinh4.this,manhinh5.class);
                startActivity(mh4);
            }
        });

        nprofile =(ImageView) findViewById(R.id.profile);
        nprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(manhinh4.this,manhinh5.class);
                startActivity(mh4);
            }
        });

        nlogout =(ImageView) findViewById(R.id.logout);
        nlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(manhinh4.this,MainActivity.class);
                startActivity(mh4);
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rAgo[];
        String rDescription[];
        int rImgs[];
        MyAdapter (Context c, String title[],String Ago[],String description[],int imgs[] ){
            super(c,R.layout.row, R.id.textview1,title);
            this.context =c;
            this.rTitle=title;
            this.rAgo=Ago;
            this.rDescription=description;
            this.rImgs=imgs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images= row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myAgo = row.findViewById(R.id.textview2);
            TextView myDescription = row.findViewById(R.id.textview3);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myAgo.setText(rAgo[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }

    }
}