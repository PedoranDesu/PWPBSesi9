package com.pedoran.pwpbsesi9.Latihan1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.pedoran.pwpbsesi9.R;

import com.pedoran.pwpbsesi9.Latihan1.SongAdapter;
import com.pedoran.pwpbsesi9.Latihan1.Song;

import java.util.ArrayList;
import java.util.List;


public class ActivityLatihan1 extends AppCompatActivity {
    private RecyclerView songRV;
    private RecyclerView.LayoutManager songRVLM;
    private List<Song>  songList;
    private SongAdapter songAdapter;

    String[] names = {"I Took A Pill In Ibiza", "7 Years", "Pillow Talk", "Work From Home", "Never Forget You", "Don't Let Me Down", "Love Yourself", "Me,Myself & I","Cake By The Ocean","Dangerous Woman","My House","Stressed Out","One Dance","Middle","No"};
    String[] singer = {"Mike Posner","Lukas Graham","Zayn","Fifth Harmony","Zara Larsson & MNEK","The Chainsmokers","Justin Bieber","G-Eazy x Bebe Rexha", "DNCE","Ariana Grande","Flo Rida","Twenty One Pilots","Drake","DJ Snake","Meghan Trainer"};

    int[]pic = {
            R.drawable.took_a_pill,
            R.drawable.seven_years,
            R.drawable.pillow_talk,
            R.drawable.work,
            R.drawable.never_forget_you,
            R.drawable.dont_let_me_down,
            R.drawable.love_yourself,
            R.drawable.me_myself_and_i,
            R.drawable.cake_by_the_ocean,
            R.drawable.dangerous_woman,
            R.drawable.my_house_florida,
            R.drawable.stressed_out,
            R.drawable.one_dance,
            R.drawable.middle,
            R.drawable.no};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1);
        songRV = findViewById(R.id.rv_song);

        if (songRV != null){
            songRV.setHasFixedSize(true);
        }

        songRVLM = new LinearLayoutManager(this);
        songRV.setLayoutManager(songRVLM);

        songList = new ArrayList<>();

        for(int i = 0;i < names.length;i++){
            Song song = new Song(names[i],singer[i],i+1,pic[i]);
            songList.add(song);
        }

        songAdapter = new SongAdapter(songList);
        songRV.setAdapter(songAdapter);
        songAdapter.notifyDataSetChanged();


        songRV.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(ActivityLatihan1.this,"Card at " + (position+1) + " is clicked",Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_grid:
                songRVLM = new GridLayoutManager(this,2);
                songRV.setLayoutManager(songRVLM);
                break;
            case R.id.item_staggered_grid:
                songRVLM = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
                songRV.setLayoutManager(songRVLM);
                break;
            case R.id.item_horizontal:
                songRVLM = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
                songRV.setLayoutManager(songRVLM);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
